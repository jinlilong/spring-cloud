package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClPayReqLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //第三方接口名称
    private String            service;
    //
    private Long              userId;
    //
    private Long              borrowId;
    //商户订单编号
    private String            orderNo;
    //请求参数
    private String            params;
    //请求tpp参数拼接
    private String            reqDetailParams;
    //页面返回/同步回调参数
    private String            returnParams;
    //页面返回/同步回调时间
    private Date              returnTime;
    //后台通知/异步回调参数
    private String            notifyParams;
    //后台通知/异步回调时间
    private Date              notifyTime;
    //响应结果：1成功，-1失败
    private Integer           result;
    //添加时间
    private Date              createTime;
    //请求IP
    private String            ip;

    /**
     * 设置：主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：第三方接口名称
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * 获取：第三方接口名称
     */
    public String getService() {
        return service;
    }

    /**
     * 设置：
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * 获取：
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * 设置：商户订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取：商户订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置：请求参数
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * 获取：请求参数
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置：请求tpp参数拼接
     */
    public void setReqDetailParams(String reqDetailParams) {
        this.reqDetailParams = reqDetailParams;
    }

    /**
     * 获取：请求tpp参数拼接
     */
    public String getReqDetailParams() {
        return reqDetailParams;
    }

    /**
     * 设置：页面返回/同步回调参数
     */
    public void setReturnParams(String returnParams) {
        this.returnParams = returnParams;
    }

    /**
     * 获取：页面返回/同步回调参数
     */
    public String getReturnParams() {
        return returnParams;
    }

    /**
     * 设置：页面返回/同步回调时间
     */
    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * 获取：页面返回/同步回调时间
     */
    public Date getReturnTime() {
        return returnTime;
    }

    /**
     * 设置：后台通知/异步回调参数
     */
    public void setNotifyParams(String notifyParams) {
        this.notifyParams = notifyParams;
    }

    /**
     * 获取：后台通知/异步回调参数
     */
    public String getNotifyParams() {
        return notifyParams;
    }

    /**
     * 设置：后台通知/异步回调时间
     */
    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    /**
     * 获取：后台通知/异步回调时间
     */
    public Date getNotifyTime() {
        return notifyTime;
    }

    /**
     * 设置：响应结果：1成功，-1失败
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * 获取：响应结果：1成功，-1失败
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置：添加时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：添加时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：请求IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取：请求IP
     */
    public String getIp() {
        return ip;
    }
}
