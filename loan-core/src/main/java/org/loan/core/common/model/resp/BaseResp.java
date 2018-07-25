package org.loan.core.common.model.resp;

/**
 * Copyright (c) 2018 All Rights Reserved.
 */

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.loan.core.common.exception.ServiceException;

import java.io.Serializable;

/**
 * 
 * @author jinlilong
 * @version $Id: BaseResp.java, v 0.1 2018年7月17日 下午3:40:11 jinlilong Exp $
 */
@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResp<T> implements Serializable {

    /**  */
    public static final long   serialVersionUID  = 9013801867983578789L;

    /**  无token 返回*/
    public static final String NO_TOKEN_CODE     = "201";

    /**  成功*/
    public static final String SUCCESS_CODE      = "200";

    /**  失败*/
    public static final String FAIL_CODE         = "400";

    /**  登录超时*/
    public static final String TOKEN_IS_OVERTIME = "202";

    /**  返回data*/
    @ApiModelProperty(value = "数据对象", name = "数据对象")
    private T                  data;

    /**  提示信息*/
    @ApiModelProperty(value = "错误码描述", name = "错误码描述")
    private String             message;

    /**  异常码*/
    @ApiModelProperty(value = "错误码", name = "错误码")
    private String             code;

    /**
     * 创建正常返回
     */
    public static <T> BaseResp<T> buildSuccessResp(T t) {
        BaseResp<T> resp = new BaseResp<>();
        resp.setCode(SUCCESS_CODE);
        resp.setData(t);
        resp.setMessage("请求成功");
        return resp;
    }

    /**
     * 创建异常返回
     * @param exception
     * @return
     */
    public static <T> BaseResp<T> buildFailResp(ServiceException exception) {
        BaseResp<T> resp = new BaseResp<>();
        resp.setCode(exception.getCode());
        resp.setMessage(exception.getMessage());
        return resp;
    }

    /**
     * 创建未知异常
     * @return
     */
    public static <T> BaseResp<T> buildSysFailResp() {
        BaseResp<T> resp = new BaseResp<>();
        resp.setCode(FAIL_CODE);
        resp.setMessage("系统正在开小差,请稍后再试...");
        return resp;
    }

    public static void main(String[] args) {
        System.out.println(JSONObject.toJSON(BaseResp.buildSuccessResp("测试啦啦!")));
    }

    /**
     * Getter method for property <tt>data</tt>.
     * 
     * @return property value of data
     */
    public T getData() {
        return data;
    }

    /**
     * Setter method for property <tt>data</tt>.
     * 
     * @param data value to be assigned to property data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Getter method for property <tt>message</tt>.
     * 
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     * 
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

}
