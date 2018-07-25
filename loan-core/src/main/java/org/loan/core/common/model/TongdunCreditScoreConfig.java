package org.loan.core.common.model;

import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.utils.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author liuzx
 * @desc 同盾信用分配置
 * @create 2018-06-14 17:15
 */
public class TongdunCreditScoreConfig {

    /**
     * 报告提交地址
     */
    private String submitUrl;

    /**
     * 报告查询地址
     */
    private String queryUrl;

    /**
     * 合作方标识
     */
    private String partnerCode;

    /**
     * 合作方密钥
     */
    private String partnerKey;

    /**
     * 应用名
     */
    private String partnerApp;

    /**
     * 事件类型
     */
    private String eventType;

    /**
     * 表单版本号
     */
    private String version = "v1";

    public static TongdunCreditScoreConfig getConfig(String config) {
        if (StringUtils.isEmpty(config)) {
            throw new ServiceException("同盾分配置不能为空");
        }
        TongdunCreditScoreConfig scoreConfig = JSONObject.parseObject(config,
            TongdunCreditScoreConfig.class);
        return scoreConfig;
    }

    public static void main(String[] args) {
        TongdunCreditScoreConfig scoreConfig = new TongdunCreditScoreConfig();
        scoreConfig.setSubmitUrl("https://api.tongdun.cn/preloan/apply/v5");
        scoreConfig.setQueryUrl("https://api.tongdun.cn/preloan/report/v9");
        scoreConfig.setPartnerCode("tdyq");
        scoreConfig.setPartnerKey("c09cb5b83a1a4b7187e82b63deb0965d");
        scoreConfig.setPartnerApp("tdyq_web");
        System.out.println(JSON.toJSONString(scoreConfig));
    }

    public String getSubmitUrl() {
        return submitUrl;
    }

    public void setSubmitUrl(String submitUrl) {
        this.submitUrl = submitUrl;
    }

    public String getQueryUrl() {
        return queryUrl;
    }

    public void setQueryUrl(String queryUrl) {
        this.queryUrl = queryUrl;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public String getPartnerKey() {
        return partnerKey;
    }

    public void setPartnerKey(String partnerKey) {
        this.partnerKey = partnerKey;
    }

    public String getPartnerApp() {
        return partnerApp;
    }

    public void setPartnerApp(String partnerApp) {
        this.partnerApp = partnerApp;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
