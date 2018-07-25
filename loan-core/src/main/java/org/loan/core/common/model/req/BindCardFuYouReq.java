/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.req;

/**
 * 绑卡请求request
 * @author jinlilong
 * @version $Id: BindCardReq.java, v 0.1 2018年5月8日 下午4:49:28 jinlilong Exp $
 */
public class BindCardFuYouReq {

    /**  回拨标志，默认0不回拨*/
    private String isCallback = "0";

    /**  业务代码，默认AC01*/
    private String busiCd     = "AC01";

    /**  证件类型*/
    private String credtTp;

    /**  行别代码*/
    private String bankCd;

    /**  户名*/
    private String userNm;

    /**  证件号*/
    private String credtNo;

    /**  签约来源，取值APP*/
    private String srcChnl    = "APP";

    /**  账户类型*/
    private String acntTp;

    /**  银行卡绑定手机号*/
    private String mobileNo;

    /**  商户号*/
    private String mchntCd;

    /**  保留字段*/
    private String reserved1;

    /**  银行卡号*/
    private String acntNo;

    /**  签名字段*/
    private String signature;

    /**  手机验证码*/
    private String verifyCode;

    /**
     * Getter method for property <tt>isCallback</tt>.
     * 
     * @return property value of isCallback
     */
    public String getIsCallback() {
        return isCallback;
    }

    /**
     * Setter method for property <tt>isCallback</tt>.
     * 
     * @param isCallback value to be assigned to property isCallback
     */
    public void setIsCallback(String isCallback) {
        this.isCallback = isCallback;
    }

    /**
     * Getter method for property <tt>busiCd</tt>.
     * 
     * @return property value of busiCd
     */
    public String getBusiCd() {
        return busiCd;
    }

    /**
     * Setter method for property <tt>busiCd</tt>.
     * 
     * @param busiCd value to be assigned to property busiCd
     */
    public void setBusiCd(String busiCd) {
        this.busiCd = busiCd;
    }

    /**
     * Getter method for property <tt>credtTp</tt>.
     * 
     * @return property value of credtTp
     */
    public String getCredtTp() {
        return credtTp;
    }

    /**
     * Setter method for property <tt>credtTp</tt>.
     * 
     * @param credtTp value to be assigned to property credtTp
     */
    public void setCredtTp(String credtTp) {
        this.credtTp = credtTp;
    }

    /**
     * Getter method for property <tt>bankCd</tt>.
     * 
     * @return property value of bankCd
     */
    public String getBankCd() {
        return bankCd;
    }

    /**
     * Setter method for property <tt>bankCd</tt>.
     * 
     * @param bankCd value to be assigned to property bankCd
     */
    public void setBankCd(String bankCd) {
        this.bankCd = bankCd;
    }

    /**
     * Getter method for property <tt>userNm</tt>.
     * 
     * @return property value of userNm
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * Setter method for property <tt>userNm</tt>.
     * 
     * @param userNm value to be assigned to property userNm
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    /**
     * Getter method for property <tt>credtNo</tt>.
     * 
     * @return property value of credtNo
     */
    public String getCredtNo() {
        return credtNo;
    }

    /**
     * Setter method for property <tt>credtNo</tt>.
     * 
     * @param credtNo value to be assigned to property credtNo
     */
    public void setCredtNo(String credtNo) {
        this.credtNo = credtNo;
    }

    /**
     * Getter method for property <tt>srcChnl</tt>.
     * 
     * @return property value of srcChnl
     */
    public String getSrcChnl() {
        return srcChnl;
    }

    /**
     * Setter method for property <tt>srcChnl</tt>.
     * 
     * @param srcChnl value to be assigned to property srcChnl
     */
    public void setSrcChnl(String srcChnl) {
        this.srcChnl = srcChnl;
    }

    /**
     * Getter method for property <tt>acntTp</tt>.
     * 
     * @return property value of acntTp
     */
    public String getAcntTp() {
        return acntTp;
    }

    /**
     * Setter method for property <tt>acntTp</tt>.
     * 
     * @param acntTp value to be assigned to property acntTp
     */
    public void setAcntTp(String acntTp) {
        this.acntTp = acntTp;
    }

    /**
     * Getter method for property <tt>mobileNo</tt>.
     * 
     * @return property value of mobileNo
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Setter method for property <tt>mobileNo</tt>.
     * 
     * @param mobileNo value to be assigned to property mobileNo
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * Getter method for property <tt>mchntCd</tt>.
     * 
     * @return property value of mchntCd
     */
    public String getMchntCd() {
        return mchntCd;
    }

    /**
     * Setter method for property <tt>mchntCd</tt>.
     * 
     * @param mchntCd value to be assigned to property mchntCd
     */
    public void setMchntCd(String mchntCd) {
        this.mchntCd = mchntCd;
    }

    /**
     * Getter method for property <tt>reserved1</tt>.
     * 
     * @return property value of reserved1
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * Setter method for property <tt>reserved1</tt>.
     * 
     * @param reserved1 value to be assigned to property reserved1
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    /**
     * Getter method for property <tt>acntNo</tt>.
     * 
     * @return property value of acntNo
     */
    public String getAcntNo() {
        return acntNo;
    }

    /**
     * Setter method for property <tt>acntNo</tt>.
     * 
     * @param acntNo value to be assigned to property acntNo
     */
    public void setAcntNo(String acntNo) {
        this.acntNo = acntNo;
    }

    /**
     * Getter method for property <tt>signature</tt>.
     * 
     * @return property value of signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Setter method for property <tt>signature</tt>.
     * 
     * @param signature value to be assigned to property signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Getter method for property <tt>verifyCode</tt>.
     * 
     * @return property value of verifyCode
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    /**
     * Setter method for property <tt>verifyCode</tt>.
     * 
     * @param verifyCode value to be assigned to property verifyCode
     */
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

}
