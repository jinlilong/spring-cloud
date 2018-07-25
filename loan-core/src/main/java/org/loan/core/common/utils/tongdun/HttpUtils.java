package org.loan.core.common.utils.tongdun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocketFactory;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.model.resp.PreloanQueryResponse;
import org.loan.core.common.model.resp.PreloanSubmitResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

/**
 * @author liuzx
 * @desc 同盾信用分对接http工具类
 * @create 2018-06-14 16:25
 */
public class HttpUtils {

    private static final Logger        LOGGER                   = LoggerFactory
        .getLogger(HttpUtils.class);

    /**
     * 连接建立超时时间
     */
    private static final int           CONNECT_TIME_OUT         = 1 * 1000;

    /**
     * 设置读取超时，建议设置为3000ms。若同时调用了信息核验服务，请与客户经理协商确认具体时间”
     */
    private static final int           SOCKET_TIME_OUT          = 3 * 1000;

    /**
     * 连接不够用时从connection manager获取连接等待超时时间
     */
    private static final int           CONNECT_REQUEST_TIME_OUT = 1 * 1000;

    /**
     * 最大重试次数
     */
    private final static int           RETRY_TIMES              = 5;

    /**
     * 最大等待时间
     */
    public static final long           WAIT_TIME                = 5 * 1000;

    private HttpsURLConnection         conn;

    private SSLSocketFactory           ssf                      = (SSLSocketFactory) SSLSocketFactory
        .getDefault();

    private static CloseableHttpClient httpClient               = null;

    private final static Object        syncLock                 = new Object();

    /**
     * 生成同盾信用报告
     *
     * @param params
     * @return
     */
    public PreloanSubmitResponse apply(Map<String, Object> params, String url) {
        PreloanSubmitResponse submitResponse;
        HttpPost httppost = new HttpPost(url);
        config(httppost);
        setPostParams(httppost, params);
        CloseableHttpResponse response = null;
        try {
            response = getHttpClient(url).execute(httppost, HttpClientContext.create());
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity, "utf-8");
            EntityUtils.consume(entity);
            submitResponse = JSON.parseObject(result, PreloanSubmitResponse.class);
            return submitResponse;
        } catch (Exception e) {
            LOGGER.error("生成同盾信用报告 apply throw exception, details: " + e);
            throw new ServiceException("获取同盾报告异常");
        } finally {
            try {
                if (response != null)
                    response.close();
            } catch (IOException e) {
                LOGGER.error("", e);
            }
        }
    }

    /**
     * 查询同盾信用分报告详情
     *
     * @param reportId
     * @param urlString
     * @return
     */
    public PreloanQueryResponse query(String reportId, String urlString) {
        PreloanQueryResponse queryResponse = new PreloanQueryResponse();
        try {
            URL url = new URL(urlString);
            conn = (HttpsURLConnection) url.openConnection();
            //设置https
            conn.setSSLSocketFactory(ssf);
            // 设置长链接
            conn.setRequestProperty("Connection", "Keep-Alive");
            // 设置连接超时
            conn.setConnectTimeout(1000);
            // 设置读取超时
            conn.setReadTimeout(500);
            // 提交参数
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
                StringBuilder result = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    result.append(line).append("\n");
                }
                return JSON.parseObject(result.toString().trim(), PreloanQueryResponse.class);
            }
        } catch (Exception e) {
            LOGGER.error("[RiskServicePreloan] query throw exception, details: " + e);
        }
        return queryResponse;
    }

    /**
     * 对http请求做相关配置.
     *
     * @param httpRequestBase
     */
    public static void config(HttpRequestBase httpRequestBase) {
        // 配置超时时间
        RequestConfig requestConfig = RequestConfig.custom()
            .setConnectionRequestTimeout(CONNECT_REQUEST_TIME_OUT)
            .setConnectTimeout(CONNECT_TIME_OUT).setSocketTimeout(SOCKET_TIME_OUT).build();
        httpRequestBase.setConfig(requestConfig);
    }

    /**
     * 获取HttpClient对象
     *
     * @return
     */
    public static CloseableHttpClient getHttpClient(String url) {
        String hostname = url.split("/")[2];
        int port = 80;
        if (hostname.contains(":")) {
            String[] arr = hostname.split(":");
            hostname = arr[0];
            port = Integer.parseInt(arr[1]);
        }
        if (httpClient == null) {
            synchronized (syncLock) {
                if (httpClient == null) {
                    httpClient = createHttpClient(200, 40, 100, hostname, port);
                }
            }
        }
        return httpClient;
    }

    /**
     * 创建HttpClient对象 这里只设置一个路由.
     *
     * @return
     */
    public static CloseableHttpClient createHttpClient(int maxTotal, int maxPerRoute, int maxRoute,
                                                       String hostname, int port) {
        ConnectionSocketFactory plainsf = PlainConnectionSocketFactory.getSocketFactory();
        LayeredConnectionSocketFactory sslsf = SSLConnectionSocketFactory.getSocketFactory();
        Registry<ConnectionSocketFactory> registry = RegistryBuilder
            .<ConnectionSocketFactory> create().register("http", plainsf).register("https", sslsf)
            .build();
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);
        // 最大连接数
        cm.setMaxTotal(maxTotal);
        // 每个默认基础路由的连接数
        cm.setDefaultMaxPerRoute(maxPerRoute);
        HttpHost httpHost = new HttpHost(hostname, port);
        // 每个路由的最大连接数增加
        cm.setMaxPerRoute(new HttpRoute(httpHost), maxRoute);
        SocketConfig socketConfig = SocketConfig.custom().setSoKeepAlive(true).build();
        cm.setDefaultSocketConfig(socketConfig);

        // 请求重试处理
        HttpRequestRetryHandler httpRequestRetryHandler = (exception, executionCount, context) -> {
            // 如果已经重试了5次，就放弃
            if (executionCount >= RETRY_TIMES) {
                return false;
            }
            // 如果服务器丢掉了连接，那么就重试
            if (exception instanceof NoHttpResponseException) {
                return true;
            }
            // 不要重试SSL握手异常
            if (exception instanceof SSLHandshakeException) {
                return false;
            }
            // 超时
            if (exception instanceof InterruptedIOException) {
                return false;
            }
            // 目标服务器不可达
            if (exception instanceof UnknownHostException) {
                return false;
            }
            // 连接被拒绝
            if (exception instanceof ConnectTimeoutException) {
                return false;
            }
            // SSL握手异常
            if (exception instanceof SSLException) {
                return false;
            }

            HttpClientContext clientContext = HttpClientContext.adapt(context);
            HttpRequest request = clientContext.getRequest();
            // 如果请求是幂等的，就再次尝试
            if (!(request instanceof HttpEntityEnclosingRequest)) {
                return true;
            }
            return false;
        };

        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(cm)
            .setRetryHandler(httpRequestRetryHandler).build();
        return httpClient;
    }

    /**
     * 设置post请求参数.
     *
     * @param httpost
     * @param params
     */
    public static void setPostParams(HttpPost httpost, Map<String, Object> params) {
        List<NameValuePair> nvps = new ArrayList<>();
        Set<String> keySet = params.keySet();
        for (String key : keySet) {
            nvps.add(new BasicNameValuePair(key, "" + params.get(key)));
        }
        try {
            httpost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            LOGGER.error("字符集编码转化异常", e);
        }
    }

    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("loan_amount", "10000"); // 申请借款金额
        params.put("loan_term", "12"); // 申请借款期限
        params.put("loan_term_unit", "DAY"); // 期限单位，默认是月，填写时可以为天或月:DAY,MONTH
        params.put("loan_date", "2018-11-11"); // 申请借款日期，格式yyyy-MM-dd 默认当前日期
        params.put("name", "demo1111"); // 姓名
        params.put("id_number", "433127198404230289"); // 身份证号
        params.put("mobile", "13260665731"); // 手机号
        params.put("card_number", ""); // 银行卡
        params.put("ip_address", ""); // IP地址
        params.put("token_id", ""); // token_id
        params.put("black_box", ""); // black_box

        params.put("purpose", ""); // 借款用途
        params.put("apply_province", ""); // 进件省份
        params.put("apply_city", ""); // 进件城市
        params.put("apply_channel", ""); // 进件渠道
        params.put("work_phone", ""); // 单位座机
        params.put("home_phone", ""); // 家庭座机
        params.put("qq", ""); // qq
        params.put("email", ""); // 电子邮箱
        params.put("diploma", ""); // 学历
        params.put("marriage", ""); // 婚姻
        params.put("house_property", ""); // 房产情况
        params.put("house_type", ""); // 房产类型
        params.put("registered_address", ""); // 户籍地址
        params.put("home_address", ""); // 家庭地址
        params.put("contact_address", ""); // 通讯地址
        params.put("career", ""); // 职业
        params.put("applyer_type", ""); // 申请人类别
        params.put("work_time", ""); // 工作时间
        params.put("company_name", ""); // 工作单位
        params.put("company_address", ""); // 单位地址
        params.put("company_industry", ""); // 公司行业
        params.put("company_type", ""); // 公司性质
        params.put("occupation", ""); // 职位
        params.put("annual_income", ""); // 年收入
        params.put("is_cross_loan", ""); // 三个月内是否跨平台申请借款
        params.put("cross_loan_count", ""); // 三个月内跨平台申请借款平台个数
        params.put("is_liability_loan", ""); // 三个月内是否跨平台借款负债
        params.put("liability_loan_count", ""); // 三个月内跨平台借款负债平台个数
        params.put("is_id_checked", ""); // 是否通过实名认证
        params.put("contact1_relation", ""); // 第一联系人社会关系
        params.put("concatc1_name", ""); // 第一联系人姓名
        params.put("contact1_id_number", ""); // 第一联系人身份证
        params.put("contact1_mobile", ""); // 第一联系人手机号
        params.put("contact1_addr", ""); // 第一联系人家庭地址
        params.put("contact1_com_name", ""); // 第一联系人工作单位
        params.put("contact1_com_addr", ""); // 第一联系人工作地址
        params.put("contact2_relation", "");
        params.put("contact2_name", "");
        params.put("contact2_id_number", "");
        params.put("contact2_mobile", "");
        params.put("contact2_addr", "");
        params.put("contact2_com_name", "");
        params.put("contact2_com_addr", "");
        params.put("contact3_relation", "");
        params.put("contact3_name", "");
        params.put("contact3_id_number", "");
        params.put("contact3_mobile", "");
        params.put("contact3_addr", "");
        params.put("contact3_com_name", "");
        params.put("contact3_com_addr", "");
        params.put("contact4_relation", "");
        params.put("contact4_name", "");
        params.put("contact4_id_number", "");
        params.put("contact4_mobile", "");
        params.put("contact4_addr", "");
        params.put("contact4_com_name", "");
        params.put("contact4_com_addr", "");
        params.put("contact5_relation", "");
        params.put("contact5_name", "");
        params.put("contact5_id_number", "");
        params.put("contact5_mobile", "");
        params.put("contact5_addr", "");
        params.put("contact5_com_name", "");
        params.put("contact5_com_addr", "");

        /*RiskServicePreloan service = new RiskServicePreloan();
        PreloanSubmitResponse riskPreloanResponse = service.apply(params);
        System.out.println(riskPreloanResponse.toString());
        
        if (riskPreloanResponse.getSuccess()) {
            // 等待一定时间后，可调用query接口查询结果。
            // 时间建议：5s后可调用
            try {
                Thread.sleep(WAIT_TIME);
            } catch (Exception e) {
                //
            }
            // query接口获取结果
            PreloanQueryResponse response = service.query(riskPreloanResponse.getReport_id());
            System.out.println(response.getReport_id());
            // 其他处理 。。。
        }*/
    }

}
