/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.resp;

/**
 * 
 * @author jinlilong
 * @version $Id: PayforResp.java, v 0.1 2018年5月16日 下午7:09:03 jinlilong Exp $
 */
public class PayforResp {

    /**  支付通道*/
    private String  payChannel;

    /** 请求订单号  用于 订单 查询  我们请求的唯一流水号*/
    private String  orderNo;

    /**  支付通道生成返回的唯一订单号*/
    private String  channelOrderNo;

    /** 状态*/
    private boolean success;

    /** 备注*/
    private String  remark;

    /**
     * Getter method for property <tt>payChannel</tt>.
     * 
     * @return property value of payChannel
     */
    public String getPayChannel() {
        return payChannel;
    }

    /**
     * Setter method for property <tt>payChannel</tt>.
     * 
     * @param payChannel value to be assigned to property payChannel
     */
    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    /**
     * Getter method for property <tt>orderNo</tt>.
     * 
     * @return property value of orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Setter method for property <tt>orderNo</tt>.
     * 
     * @param orderNo value to be assigned to property orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * Getter method for property <tt>remark</tt>.
     * 
     * @return property value of remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Setter method for property <tt>remark</tt>.
     * 
     * @param remark value to be assigned to property remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
     * Getter method for property <tt>channelOrderNo</tt>.
     * 
     * @return property value of channelOrderNo
     */
    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    /**
     * Setter method for property <tt>channelOrderNo</tt>.
     * 
     * @param channelOrderNo value to be assigned to property channelOrderNo
     */
    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

}
