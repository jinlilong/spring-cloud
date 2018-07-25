/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.req;

/**
 * 
 * @author jinlilong
 * @version $Id: BindCardReq.java, v 0.1 2018年5月14日 上午9:18:48 jinlilong Exp $
 */
public class BindCardReq {

    /**  身份证号*/
    private String idNo;

    /**  用户姓名*/
    private String userName;

    /**  手机号*/
    private String mobile;

    /**  银行编码*/
    private String bankCode;

    /**  银行名称*/
    private String bankName;

    /**  银行卡号*/
    private String cardNo;

    /**  短信验证码*/
    private String smsCode;

    /**  用户ID*/
    private Long   userId;

    /**  省市code、富友代付接口必传参数，需要在银行卡认证时保存下来*/
    private String cityCode;

    /**  通道code*/
    private String channelCode;

    /**
     * Getter method for property <tt>idNo</tt>.
     * 
     * @return property value of idNo
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * Setter method for property <tt>idNo</tt>.
     * 
     * @param idNo value to be assigned to property idNo
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * Getter method for property <tt>userName</tt>.
     * 
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>userName</tt>.
     * 
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property <tt>mobile</tt>.
     * 
     * @return property value of mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Setter method for property <tt>mobile</tt>.
     * 
     * @param mobile value to be assigned to property mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Getter method for property <tt>bankCode</tt>.
     * 
     * @return property value of bankCode
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Setter method for property <tt>bankCode</tt>.
     * 
     * @param bankCode value to be assigned to property bankCode
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * Getter method for property <tt>bankName</tt>.
     * 
     * @return property value of bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter method for property <tt>bankName</tt>.
     * 
     * @param bankName value to be assigned to property bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter method for property <tt>cardNo</tt>.
     * 
     * @return property value of cardNo
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Setter method for property <tt>cardNo</tt>.
     * 
     * @param cardNo value to be assigned to property cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * Getter method for property <tt>smsCode</tt>.
     * 
     * @return property value of smsCode
     */
    public String getSmsCode() {
        return smsCode;
    }

    /**
     * Setter method for property <tt>smsCode</tt>.
     * 
     * @param smsCode value to be assigned to property smsCode
     */
    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    /**
     * Getter method for property <tt>userId</tt>.
     * 
     * @return property value of userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     * 
     * @param userId value to be assigned to property userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>cityCode</tt>.
     * 
     * @return property value of cityCode
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Setter method for property <tt>cityCode</tt>.
     * 
     * @param cityCode value to be assigned to property cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * Getter method for property <tt>channelCode</tt>.
     * 
     * @return property value of channelCode
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Setter method for property <tt>channelCode</tt>.
     * 
     * @param channelCode value to be assigned to property channelCode
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

}
