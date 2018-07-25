/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.resp;

/**
 * 
orderno  商户请求流水  c(10,30)    否   如果商户没传则为空字符串
merdt   请求日期    c(8)    否   交易日期
fuorderno   流水    c(10,30)    否   富友生成的交易流水
accntno 账号  c(8,28) 否   银行卡号
accntnm 账户名称    c(1,30) 否   银行卡持卡人姓名
bankno  总行代码    c(4)    否   参见总行代码表
amt 退票金额    n(1,12) 否   单位：分
state   状态  c(2)    否   参见交易状态码说明，1为付款成功
result  交易结果    c(1,8)  否   
reason  结果原因    c(1,1024)   是   
mac 校验值     否   商户号|富友分配给商户的密钥|商户请求流水|原请求日期|账号|退票金额，用竖线拼接后用MD5散列后的
16进制文本
Md5(merid+”|”+pwd+”|”+orderno+”|”+merdt+”|”+accntno+”|”amt”)

 * @author jinlilong
 * @version $Id: PayforCallbackResp.java, v 0.1 2018年5月10日 上午11:05:31 jinlilong Exp $
 */
public class PayforCallbackResp {

    private String  orderno;

    private String  merdt;

    private String  fuorderno;

    private String  accntno;

    private String  accntnm;

    private String  bankno;

    private String  amt;

    private String  state;

    private String  result;

    private String  reason;

    private String  mac;

    /**  通道*/
    private String  channel;

    /**  手续费*/
    private String  transFee;

    /**  是否交易成功*/
    public boolean  success;

    /**  是否不处理*/
    private boolean noHandle;

    /**
     * Getter method for property <tt>orderno</tt>.
     * 
     * @return property value of orderno
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * Setter method for property <tt>orderno</tt>.
     * 
     * @param orderno value to be assigned to property orderno
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    /**
     * Getter method for property <tt>merdt</tt>.
     * 
     * @return property value of merdt
     */
    public String getMerdt() {
        return merdt;
    }

    /**
     * Setter method for property <tt>merdt</tt>.
     * 
     * @param merdt value to be assigned to property merdt
     */
    public void setMerdt(String merdt) {
        this.merdt = merdt;
    }

    /**
     * Getter method for property <tt>fuorderno</tt>.
     * 
     * @return property value of fuorderno
     */
    public String getFuorderno() {
        return fuorderno;
    }

    /**
     * Setter method for property <tt>fuorderno</tt>.
     * 
     * @param fuorderno value to be assigned to property fuorderno
     */
    public void setFuorderno(String fuorderno) {
        this.fuorderno = fuorderno;
    }

    /**
     * Getter method for property <tt>accntno</tt>.
     * 
     * @return property value of accntno
     */
    public String getAccntno() {
        return accntno;
    }

    /**
     * Setter method for property <tt>accntno</tt>.
     * 
     * @param accntno value to be assigned to property accntno
     */
    public void setAccntno(String accntno) {
        this.accntno = accntno;
    }

    /**
     * Getter method for property <tt>accntnm</tt>.
     * 
     * @return property value of accntnm
     */
    public String getAccntnm() {
        return accntnm;
    }

    /**
     * Setter method for property <tt>accntnm</tt>.
     * 
     * @param accntnm value to be assigned to property accntnm
     */
    public void setAccntnm(String accntnm) {
        this.accntnm = accntnm;
    }

    /**
     * Getter method for property <tt>bankno</tt>.
     * 
     * @return property value of bankno
     */
    public String getBankno() {
        return bankno;
    }

    /**
     * Setter method for property <tt>bankno</tt>.
     * 
     * @param bankno value to be assigned to property bankno
     */
    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    /**
     * Getter method for property <tt>amt</tt>.
     * 
     * @return property value of amt
     */
    public String getAmt() {
        return amt;
    }

    /**
     * Setter method for property <tt>amt</tt>.
     * 
     * @param amt value to be assigned to property amt
     */
    public void setAmt(String amt) {
        this.amt = amt;
    }

    /**
     * Getter method for property <tt>state</tt>.
     * 
     * @return property value of state
     */
    public String getState() {
        return state;
    }

    /**
     * Setter method for property <tt>state</tt>.
     * 
     * @param state value to be assigned to property state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter method for property <tt>result</tt>.
     * 
     * @return property value of result
     */
    public String getResult() {
        return result;
    }

    /**
     * Setter method for property <tt>result</tt>.
     * 
     * @param result value to be assigned to property result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Getter method for property <tt>reason</tt>.
     * 
     * @return property value of reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Setter method for property <tt>reason</tt>.
     * 
     * @param reason value to be assigned to property reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Getter method for property <tt>mac</tt>.
     * 
     * @return property value of mac
     */
    public String getMac() {
        return mac;
    }

    /**
     * Setter method for property <tt>mac</tt>.
     * 
     * @param mac value to be assigned to property mac
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * Getter method for property <tt>transFee</tt>.
     * 
     * @return property value of transFee
     */
    public String getTransFee() {
        return transFee;
    }

    /**
     * Setter method for property <tt>transFee</tt>.
     * 
     * @param transFee value to be assigned to property transFee
     */
    public void setTransFee(String transFee) {
        this.transFee = transFee;
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
     * Getter method for property <tt>channel</tt>.
     * 
     * @return property value of channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Setter method for property <tt>channel</tt>.
     * 
     * @param channel value to be assigned to property channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * Getter method for property <tt>noHandle</tt>.
     * 
     * @return property value of noHandle
     */
    public boolean isNoHandle() {
        return noHandle;
    }

    /**
     * Setter method for property <tt>noHandle</tt>.
     * 
     * @param noHandle value to be assigned to property noHandle
     */
    public void setNoHandle(boolean noHandle) {
        this.noHandle = noHandle;
    }

}
