/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.req;

/**
 * 
 * @author jinlilong
 * @version $Id: BindCardBaofuReq.java, v 0.1 2018年5月11日 上午9:20:32 jinlilong Exp $
 */
public class BindCardBaofuReq {

    /**
     * 交易子类
     */
    private String txn_sub_type    = "11";
    /**
     * 接入类型
     */
    private String biz_type;
    /**
     * 终端号
     */
    private String terminal_id;
    /**
     * 商户号
     */
    private String member_id;
    /**
     * 商户流水号
     */
    private String trans_serial_no;
    /**
     * 商户订单号
     */
    private String trans_id;
    /**
     * 绑定卡号
     */
    private String acc_no;
    /**
     * 身份证类型
     */
    private String id_card_type    = "01";
    /**
     * 身份证号
     */
    private String id_card;
    /**
     * 持卡人姓名
     */
    private String id_holder;
    /**
     * 银行卡绑定手机号
     */
    private String mobile;
    /**
     * 卡有效期
     */
    private String valid_date      = "";
    /**
     * 卡安全码
     */
    private String valid_no        = "";
    /**
     * 银行编码
     */
    private String card_type       = "";
    /**
     * 订单日期 14 位定长。
                 格式：年年年年月月日日时时分分秒秒
     */
    private String trade_date      = "";
    /**
     * 附加字段
     */
    private String additional_info = "";
    /**
     * 请求方保留域
     */
    private String req_reserved    = "";

    private String acc_pwd         = "";

    /**  */
    private String trade_no;

    /**  */
    private String sms_code;

    /**
     * Getter method for property <tt>txn_sub_type</tt>.
     * 
     * @return property value of txn_sub_type
     */
    public String getTxn_sub_type() {
        return txn_sub_type;
    }

    /**
     * Setter method for property <tt>txn_sub_type</tt>.
     * 
     * @param txn_sub_type value to be assigned to property txn_sub_type
     */
    public void setTxn_sub_type(String txn_sub_type) {
        this.txn_sub_type = txn_sub_type;
    }

    /**
     * Getter method for property <tt>biz_type</tt>.
     * 
     * @return property value of biz_type
     */
    public String getBiz_type() {
        return biz_type;
    }

    /**
     * Setter method for property <tt>biz_type</tt>.
     * 
     * @param biz_type value to be assigned to property biz_type
     */
    public void setBiz_type(String biz_type) {
        this.biz_type = biz_type;
    }

    /**
     * Getter method for property <tt>terminal_id</tt>.
     * 
     * @return property value of terminal_id
     */
    public String getTerminal_id() {
        return terminal_id;
    }

    /**
     * Setter method for property <tt>terminal_id</tt>.
     * 
     * @param terminal_id value to be assigned to property terminal_id
     */
    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    /**
     * Getter method for property <tt>member_id</tt>.
     * 
     * @return property value of member_id
     */
    public String getMember_id() {
        return member_id;
    }

    /**
     * Setter method for property <tt>member_id</tt>.
     * 
     * @param member_id value to be assigned to property member_id
     */
    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    /**
     * Getter method for property <tt>trans_serial_no</tt>.
     * 
     * @return property value of trans_serial_no
     */
    public String getTrans_serial_no() {
        return trans_serial_no;
    }

    /**
     * Setter method for property <tt>trans_serial_no</tt>.
     * 
     * @param trans_serial_no value to be assigned to property trans_serial_no
     */
    public void setTrans_serial_no(String trans_serial_no) {
        this.trans_serial_no = trans_serial_no;
    }

    /**
     * Getter method for property <tt>trans_id</tt>.
     * 
     * @return property value of trans_id
     */
    public String getTrans_id() {
        return trans_id;
    }

    /**
     * Setter method for property <tt>trans_id</tt>.
     * 
     * @param trans_id value to be assigned to property trans_id
     */
    public void setTrans_id(String trans_id) {
        this.trans_id = trans_id;
    }

    /**
     * Getter method for property <tt>acc_no</tt>.
     * 
     * @return property value of acc_no
     */
    public String getAcc_no() {
        return acc_no;
    }

    /**
     * Setter method for property <tt>acc_no</tt>.
     * 
     * @param acc_no value to be assigned to property acc_no
     */
    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    /**
     * Getter method for property <tt>id_card_type</tt>.
     * 
     * @return property value of id_card_type
     */
    public String getId_card_type() {
        return id_card_type;
    }

    /**
     * Setter method for property <tt>id_card_type</tt>.
     * 
     * @param id_card_type value to be assigned to property id_card_type
     */
    public void setId_card_type(String id_card_type) {
        this.id_card_type = id_card_type;
    }

    /**
     * Getter method for property <tt>id_card</tt>.
     * 
     * @return property value of id_card
     */
    public String getId_card() {
        return id_card;
    }

    /**
     * Setter method for property <tt>id_card</tt>.
     * 
     * @param id_card value to be assigned to property id_card
     */
    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    /**
     * Getter method for property <tt>id_holder</tt>.
     * 
     * @return property value of id_holder
     */
    public String getId_holder() {
        return id_holder;
    }

    /**
     * Setter method for property <tt>id_holder</tt>.
     * 
     * @param id_holder value to be assigned to property id_holder
     */
    public void setId_holder(String id_holder) {
        this.id_holder = id_holder;
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
     * Getter method for property <tt>valid_date</tt>.
     * 
     * @return property value of valid_date
     */
    public String getValid_date() {
        return valid_date;
    }

    /**
     * Setter method for property <tt>valid_date</tt>.
     * 
     * @param valid_date value to be assigned to property valid_date
     */
    public void setValid_date(String valid_date) {
        this.valid_date = valid_date;
    }

    /**
     * Getter method for property <tt>valid_no</tt>.
     * 
     * @return property value of valid_no
     */
    public String getValid_no() {
        return valid_no;
    }

    /**
     * Setter method for property <tt>valid_no</tt>.
     * 
     * @param valid_no value to be assigned to property valid_no
     */
    public void setValid_no(String valid_no) {
        this.valid_no = valid_no;
    }

    /**
     * Getter method for property <tt>card_type</tt>.
     * 
     * @return property value of card_type
     */
    public String getCard_type() {
        return card_type;
    }

    /**
     * Setter method for property <tt>card_type</tt>.
     * 
     * @param card_type value to be assigned to property card_type
     */
    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    /**
     * Getter method for property <tt>trade_date</tt>.
     * 
     * @return property value of trade_date
     */
    public String getTrade_date() {
        return trade_date;
    }

    /**
     * Setter method for property <tt>trade_date</tt>.
     * 
     * @param trade_date value to be assigned to property trade_date
     */
    public void setTrade_date(String trade_date) {
        this.trade_date = trade_date;
    }

    /**
     * Getter method for property <tt>additional_info</tt>.
     * 
     * @return property value of additional_info
     */
    public String getAdditional_info() {
        return additional_info;
    }

    /**
     * Setter method for property <tt>additional_info</tt>.
     * 
     * @param additional_info value to be assigned to property additional_info
     */
    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    /**
     * Getter method for property <tt>req_reserved</tt>.
     * 
     * @return property value of req_reserved
     */
    public String getReq_reserved() {
        return req_reserved;
    }

    /**
     * Setter method for property <tt>req_reserved</tt>.
     * 
     * @param req_reserved value to be assigned to property req_reserved
     */
    public void setReq_reserved(String req_reserved) {
        this.req_reserved = req_reserved;
    }

    /**
     * Getter method for property <tt>acc_pwd</tt>.
     * 
     * @return property value of acc_pwd
     */
    public String getAcc_pwd() {
        return acc_pwd;
    }

    /**
     * Setter method for property <tt>acc_pwd</tt>.
     * 
     * @param acc_pwd value to be assigned to property acc_pwd
     */
    public void setAcc_pwd(String acc_pwd) {
        this.acc_pwd = acc_pwd;
    }

    /**
     * Getter method for property <tt>trade_no</tt>.
     * 
     * @return property value of trade_no
     */
    public String getTrade_no() {
        return trade_no;
    }

    /**
     * Setter method for property <tt>trade_no</tt>.
     * 
     * @param trade_no value to be assigned to property trade_no
     */
    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * Getter method for property <tt>sms_code</tt>.
     * 
     * @return property value of sms_code
     */
    public String getSms_code() {
        return sms_code;
    }

    /**
     * Setter method for property <tt>sms_code</tt>.
     * 
     * @param sms_code value to be assigned to property sms_code
     */
    public void setSms_code(String sms_code) {
        this.sms_code = sms_code;
    }

}
