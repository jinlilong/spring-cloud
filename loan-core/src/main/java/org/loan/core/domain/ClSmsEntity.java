package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 短信发送记录表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClSmsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //手机号码
    private String            phone;
    //发送时间
    private Date              sendTime;
    //发送信息
    private String            content;
    //响应时间
    private Date              respTime;
    //响应信息
    private String            resp;
    //短信类型
    private String            smsType;
    //验证码
    private String            code;
    //订单号
    private String            orderNo;
    //短信是否被使用 10-已使用 20-未使用
    private String            state;
    //短信验证次数
    private Integer           verifyTime;

    /**
     * 发送短信内容
     * */
    private String            sendContent;

    public String getSendContent() {
        return sendContent;
    }

    public void setSendContent(String sendContent) {
        this.sendContent = sendContent;
    }

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
     * 设置：手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取：手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置：发送时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取：发送时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置：发送信息
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取：发送信息
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置：响应时间
     */
    public void setRespTime(Date respTime) {
        this.respTime = respTime;
    }

    /**
     * 获取：响应时间
     */
    public Date getRespTime() {
        return respTime;
    }

    /**
     * 设置：响应信息
     */
    public void setResp(String resp) {
        this.resp = resp;
    }

    /**
     * 获取：响应信息
     */
    public String getResp() {
        return resp;
    }

    /**
     * 设置：短信类型
     */
    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    /**
     * 获取：短信类型
     */
    public String getSmsType() {
        return smsType;
    }

    /**
     * 设置：验证码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取：验证码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置：订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取：订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置：短信是否被使用 10-已使用 20-未使用
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：短信是否被使用 10-已使用 20-未使用
     */
    public String getState() {
        return state;
    }

    /**
     * 设置：短信验证次数
     */
    public void setVerifyTime(Integer verifyTime) {
        this.verifyTime = verifyTime;
    }

    /**
     * 获取：短信验证次数
     */
    public Integer getVerifyTime() {
        return verifyTime;
    }
}
