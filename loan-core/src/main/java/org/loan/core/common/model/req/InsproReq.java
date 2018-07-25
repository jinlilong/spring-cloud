/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.req;

/**
 * 项目录入请求类 
 * @author jinlilong
 * @version $Id: InsproReq.java, v 0.1 2018年5月9日 下午1:19:29 jinlilong Exp $
 */
public class InsproReq {

    /**  版本号*/
    private String ver;

    /** 请求流水 */
    private String orderno;

    /**  商户名称*/
    private String mchnt_nm;

    /**  项目序列号*/
    private String project_ssn;

    /**  项目金额*/
    private String project_amt;

    /**  商户借款合同编号*/
    private String contract_nm;

    /**  项目期限*/
    private String project_deadline;

    /**  借款人姓名*/
    private String bor_nm;

    /**  借款人证件类型*/
    private String id_tp;

    /**  证件号码*/
    private String id_no;

    /**  卡号*/
    private String card_no;

    /**  手机号码  和签约 时的手机号保持一致（银行 预留 ）*/
    private String mobile_no;

    private String max_invest_num;

    private String min_invest_num;

    /**
     * Getter method for property <tt>ver</tt>.
     * 
     * @return property value of ver
     */
    public String getVer() {
        return ver;
    }

    /**
     * Setter method for property <tt>ver</tt>.
     * 
     * @param ver value to be assigned to property ver
     */
    public void setVer(String ver) {
        this.ver = ver;
    }

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
     * Getter method for property <tt>mchnt_nm</tt>.
     * 
     * @return property value of mchnt_nm
     */
    public String getMchnt_nm() {
        return mchnt_nm;
    }

    /**
     * Setter method for property <tt>mchnt_nm</tt>.
     * 
     * @param mchnt_nm value to be assigned to property mchnt_nm
     */
    public void setMchnt_nm(String mchnt_nm) {
        this.mchnt_nm = mchnt_nm;
    }

    /**
     * Getter method for property <tt>project_ssn</tt>.
     * 
     * @return property value of project_ssn
     */
    public String getProject_ssn() {
        return project_ssn;
    }

    /**
     * Setter method for property <tt>project_ssn</tt>.
     * 
     * @param project_ssn value to be assigned to property project_ssn
     */
    public void setProject_ssn(String project_ssn) {
        this.project_ssn = project_ssn;
    }

    /**
     * Getter method for property <tt>project_amt</tt>.
     * 
     * @return property value of project_amt
     */
    public String getProject_amt() {
        return project_amt;
    }

    /**
     * Setter method for property <tt>project_amt</tt>.
     * 
     * @param project_amt value to be assigned to property project_amt
     */
    public void setProject_amt(String project_amt) {
        this.project_amt = project_amt;
    }

    /**
     * Getter method for property <tt>contract_nm</tt>.
     * 
     * @return property value of contract_nm
     */
    public String getContract_nm() {
        return contract_nm;
    }

    /**
     * Setter method for property <tt>contract_nm</tt>.
     * 
     * @param contract_nm value to be assigned to property contract_nm
     */
    public void setContract_nm(String contract_nm) {
        this.contract_nm = contract_nm;
    }

    /**
     * Getter method for property <tt>project_deadline</tt>.
     * 
     * @return property value of project_deadline
     */
    public String getProject_deadline() {
        return project_deadline;
    }

    /**
     * Setter method for property <tt>project_deadline</tt>.
     * 
     * @param project_deadline value to be assigned to property project_deadline
     */
    public void setProject_deadline(String project_deadline) {
        this.project_deadline = project_deadline;
    }

    /**
     * Getter method for property <tt>bor_nm</tt>.
     * 
     * @return property value of bor_nm
     */
    public String getBor_nm() {
        return bor_nm;
    }

    /**
     * Setter method for property <tt>bor_nm</tt>.
     * 
     * @param bor_nm value to be assigned to property bor_nm
     */
    public void setBor_nm(String bor_nm) {
        this.bor_nm = bor_nm;
    }

    /**
     * Getter method for property <tt>id_tp</tt>.
     * 
     * @return property value of id_tp
     */
    public String getId_tp() {
        return id_tp;
    }

    /**
     * Setter method for property <tt>id_tp</tt>.
     * 
     * @param id_tp value to be assigned to property id_tp
     */
    public void setId_tp(String id_tp) {
        this.id_tp = id_tp;
    }

    /**
     * Getter method for property <tt>id_no</tt>.
     * 
     * @return property value of id_no
     */
    public String getId_no() {
        return id_no;
    }

    /**
     * Setter method for property <tt>id_no</tt>.
     * 
     * @param id_no value to be assigned to property id_no
     */
    public void setId_no(String id_no) {
        this.id_no = id_no;
    }

    /**
     * Getter method for property <tt>card_no</tt>.
     * 
     * @return property value of card_no
     */
    public String getCard_no() {
        return card_no;
    }

    /**
     * Setter method for property <tt>card_no</tt>.
     * 
     * @param card_no value to be assigned to property card_no
     */
    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    /**
     * Getter method for property <tt>mobile_no</tt>.
     * 
     * @return property value of mobile_no
     */
    public String getMobile_no() {
        return mobile_no;
    }

    /**
     * Setter method for property <tt>mobile_no</tt>.
     * 
     * @param mobile_no value to be assigned to property mobile_no
     */
    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    /**
     * Getter method for property <tt>max_invest_num</tt>.
     * 
     * @return property value of max_invest_num
     */
    public String getMax_invest_num() {
        return max_invest_num;
    }

    /**
     * Setter method for property <tt>max_invest_num</tt>.
     * 
     * @param max_invest_num value to be assigned to property max_invest_num
     */
    public void setMax_invest_num(String max_invest_num) {
        this.max_invest_num = max_invest_num;
    }

    /**
     * Getter method for property <tt>min_invest_num</tt>.
     * 
     * @return property value of min_invest_num
     */
    public String getMin_invest_num() {
        return min_invest_num;
    }

    /**
     * Setter method for property <tt>min_invest_num</tt>.
     * 
     * @param min_invest_num value to be assigned to property min_invest_num
     */
    public void setMin_invest_num(String min_invest_num) {
        this.min_invest_num = min_invest_num;
    }

}
