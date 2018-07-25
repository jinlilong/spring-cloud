/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.resp;

/**
 * 
 * @author jinlilong
 * @version $Id: PayChannelResp.java, v 0.1 2018年5月11日 下午3:23:58 jinlilong Exp $
 */
public class PayChannelResp {

    /**  成功状态*/
    private boolean success;

    /**  返回code*/
    private String  code;

    /**  信息*/
    private String  message;

    /**  协议号*/
    private String  tradeNo;

    public PayChannelResp() {

    }

    /**
     * @param success
     * @param code
     * @param message
     */
    public PayChannelResp(boolean success, String code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    /**
     * Getter method for property <tt>success</tt>.
     * 
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>success</tt>.
     * 
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
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
     * Getter method for property <tt>tradeNo</tt>.
     * 
     * @return property value of tradeNo
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * Setter method for property <tt>tradeNo</tt>.
     * 
     * @param tradeNo value to be assigned to property tradeNo
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

}
