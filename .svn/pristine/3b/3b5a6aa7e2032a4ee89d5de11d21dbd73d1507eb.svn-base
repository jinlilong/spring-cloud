/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model;

import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.utils.StringUtils;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author jinlilong
 * @version $Id: PayChannelConfig.java, v 0.1 2018年5月9日 上午9:17:54 jinlilong Exp $
 */
public class PayChannelConfig {

    /**  绑卡url*/
    private String bindCardUrl;

    /**  绑卡通知短信url*/
    private String bindCardSendMsgUrl;

    /**  密钥*/
    private String key;

    /**  宝付AesKey*/
    private String aesKey;

    /**  商户号*/
    private String merchantNo;

    /**  商户名称*/
    private String merchantName;

    /**  宝付那边配置的终端号*/
    private String terminalId;

    /**  */
    private String pfxPwd;

    /**  数据类型 xml、json*/
    private String dataType;

    /**  项目录入url*/
    private String insproUrl;

    /**  代付url*/
    private String payUrl;

    /**  代扣url*/
    private String incomeUrl;

    /**  代扣查询确认url*/
    private String incomeQueryUrl;

    /**  代扣回调url*/
    private String incomeReturnUrl;

    /**  版本号*/
    private String version;

    /**  宝付私钥文件名称*/
    private String pfxFileName;

    /**  宝付公钥文件名称*/
    private String cerName;

    /**  */
    private String queryUrl;

    /**
     * 
     * @param config
     * @return
     */
    public static PayChannelConfig getConfig(String config) {
        if (StringUtils.isEmpty(config)) {
            throw new ServiceException("支付通道配置不能为空");
        }
        PayChannelConfig payChannelConfig = JSONObject.parseObject(config, PayChannelConfig.class);
        if (StringUtils.isEmpty("bindCardUrl")) {
            throw new ServiceException("绑卡url未配置");
        }

        if (StringUtils.isEmpty("bindCardSendMsgUrl")) {
            throw new ServiceException("绑卡短信验证url未配置");
        }
        return payChannelConfig;
    }

    /**
     * Getter method for property <tt>bindCardUrl</tt>.
     * 
     * @return property value of bindCardUrl
     */
    public String getBindCardUrl() {
        return bindCardUrl;
    }

    /**
     * Setter method for property <tt>bindCardUrl</tt>.
     * 
     * @param bindCardUrl value to be assigned to property bindCardUrl
     */
    public void setBindCardUrl(String bindCardUrl) {
        this.bindCardUrl = bindCardUrl;
    }

    /**
     * Getter method for property <tt>bindCardSendMsgUrl</tt>.
     * 
     * @return property value of bindCardSendMsgUrl
     */
    public String getBindCardSendMsgUrl() {
        return bindCardSendMsgUrl;
    }

    /**
     * Setter method for property <tt>bindCardSendMsgUrl</tt>.
     * 
     * @param bindCardSendMsgUrl value to be assigned to property bindCardSendMsgUrl
     */
    public void setBindCardSendMsgUrl(String bindCardSendMsgUrl) {
        this.bindCardSendMsgUrl = bindCardSendMsgUrl;
    }

    /**
     * Getter method for property <tt>key</tt>.
     * 
     * @return property value of key
     */
    public String getKey() {
        return key;
    }

    /**
     * Setter method for property <tt>key</tt>.
     * 
     * @param key value to be assigned to property key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter method for property <tt>merchantNo</tt>.
     * 
     * @return property value of merchantNo
     */
    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * Setter method for property <tt>merchantNo</tt>.
     * 
     * @param merchantNo value to be assigned to property merchantNo
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    /**
     * Getter method for property <tt>insproUrl</tt>.
     * 
     * @return property value of insproUrl
     */
    public String getInsproUrl() {
        return insproUrl;
    }

    /**
     * Setter method for property <tt>insproUrl</tt>.
     * 
     * @param insproUrl value to be assigned to property insproUrl
     */
    public void setInsproUrl(String insproUrl) {
        this.insproUrl = insproUrl;
    }

    /**
     * Getter method for property <tt>payUrl</tt>.
     * 
     * @return property value of payUrl
     */
    public String getPayUrl() {
        return payUrl;
    }

    /**
     * Setter method for property <tt>payUrl</tt>.
     * 
     * @param payUrl value to be assigned to property payUrl
     */
    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    /**
     * Getter method for property <tt>incomeUrl</tt>.
     * 
     * @return property value of incomeUrl
     */
    public String getIncomeUrl() {
        return incomeUrl;
    }

    /**
     * Setter method for property <tt>incomeUrl</tt>.
     * 
     * @param incomeUrl value to be assigned to property incomeUrl
     */
    public void setIncomeUrl(String incomeUrl) {
        this.incomeUrl = incomeUrl;
    }

    /**
     * Getter method for property <tt>terminalId</tt>.
     * 
     * @return property value of terminalId
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Setter method for property <tt>terminalId</tt>.
     * 
     * @param terminalId value to be assigned to property terminalId
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * Getter method for property <tt>dataType</tt>.
     * 
     * @return property value of dataType
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Setter method for property <tt>dataType</tt>.
     * 
     * @param dataType value to be assigned to property dataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Getter method for property <tt>pfxPwd</tt>.
     * 
     * @return property value of pfxPwd
     */
    public String getPfxPwd() {
        return pfxPwd;
    }

    /**
     * Setter method for property <tt>pfxPwd</tt>.
     * 
     * @param pfxPwd value to be assigned to property pfxPwd
     */
    public void setPfxPwd(String pfxPwd) {
        this.pfxPwd = pfxPwd;
    }

    /**
     * Getter method for property <tt>version</tt>.
     * 
     * @return property value of version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter method for property <tt>version</tt>.
     * 
     * @param version value to be assigned to property version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter method for property <tt>pfxFileName</tt>.
     * 
     * @return property value of pfxFileName
     */
    public String getPfxFileName() {
        return pfxFileName;
    }

    /**
     * Setter method for property <tt>pfxFileName</tt>.
     * 
     * @param pfxFileName value to be assigned to property pfxFileName
     */
    public void setPfxFileName(String pfxFileName) {
        this.pfxFileName = pfxFileName;
    }

    /**
     * Getter method for property <tt>cerName</tt>.
     * 
     * @return property value of cerName
     */
    public String getCerName() {
        return cerName;
    }

    /**
     * Setter method for property <tt>cerName</tt>.
     * 
     * @param cerName value to be assigned to property cerName
     */
    public void setCerName(String cerName) {
        this.cerName = cerName;
    }

    /**
     * Getter method for property <tt>merchantName</tt>.
     * 
     * @return property value of merchantName
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Setter method for property <tt>merchantName</tt>.
     * 
     * @param merchantName value to be assigned to property merchantName
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * Getter method for property <tt>queryUrl</tt>.
     * 
     * @return property value of queryUrl
     */
    public String getQueryUrl() {
        return queryUrl;
    }

    /**
     * Setter method for property <tt>queryUrl</tt>.
     * 
     * @param queryUrl value to be assigned to property queryUrl
     */
    public void setQueryUrl(String queryUrl) {
        this.queryUrl = queryUrl;
    }

    /**
     * Getter method for property <tt>aesKey</tt>.
     * 
     * @return property value of aesKey
     */
    public String getAesKey() {
        return aesKey;
    }

    /**
     * Setter method for property <tt>aesKey</tt>.
     * 
     * @param aesKey value to be assigned to property aesKey
     */
    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    /**
     * Getter method for property <tt>incomeReturnUrl</tt>.
     * 
     * @return property value of incomeReturnUrl
     */
    public String getIncomeReturnUrl() {
        return incomeReturnUrl;
    }

    /**
     * Setter method for property <tt>incomeReturnUrl</tt>.
     * 
     * @param incomeReturnUrl value to be assigned to property incomeReturnUrl
     */
    public void setIncomeReturnUrl(String incomeReturnUrl) {
        this.incomeReturnUrl = incomeReturnUrl;
    }

    /**
     * Getter method for property <tt>incomeQueryUrl</tt>.
     * 
     * @return property value of incomeQueryUrl
     */
    public String getIncomeQueryUrl() {
        return incomeQueryUrl;
    }

    /**
     * Setter method for property <tt>incomeQueryUrl</tt>.
     * 
     * @param incomeQueryUrl value to be assigned to property incomeQueryUrl
     */
    public void setIncomeQueryUrl(String incomeQueryUrl) {
        this.incomeQueryUrl = incomeQueryUrl;
    }

}
