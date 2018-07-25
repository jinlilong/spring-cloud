package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付记录表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClPayLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //请求订单标识
    private String            orderNo;
    //用户标识
    private Long              userId;
    //
    private String            mobile;
    //
    private String            name;
    //
    private Long              repayId;
    //借款标识
    private Long              borrowId;
    //支付金额
    private BigDecimal        amount;
    //用户银行卡卡号
    private String            cardNo;
    //用户银行卡开户行
    private String            bank;
    //第三方序列号
    private String            serialNumber;
    //确认码，实时付款确认交易使用
    private String            confirmCode;
    //资金来源 10:自有资金 20:其他资金
    private String            source;
    //支付方式 10:代付 20:代扣 30:线下代付  40:线下代扣
    private String            type;
    //业务场景  10、放款  11、分润 12、退还 20、还款 21、补扣
    private String            scenes;
    //支付状态   10:待支付 、15:待审核 、20:审核通过、 30:审核不通过 、40:支付成功、50:支付失败
    private String            state;
    //备注
    private String            remark;
    //支付请求时间
    private Date              payReqTime;
    //更新时间
    private Date              updateTime;
    //添加时间
    private Date              createTime;
    //支付通道
    private String            payCode;
    //违约金
    private BigDecimal        advanceAmount;
    //实还利息
    private BigDecimal        repayInterest;

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
     * 设置：请求订单标识
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取：请求订单标识
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置：用户标识
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户标识
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取：
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置：
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：
     */
    public void setRepayId(Long repayId) {
        this.repayId = repayId;
    }

    /**
     * 获取：
     */
    public Long getRepayId() {
        return repayId;
    }

    /**
     * 设置：借款标识
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * 获取：借款标识
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * 设置：支付金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取：支付金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置：用户银行卡卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * 获取：用户银行卡卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置：用户银行卡开户行
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * 获取：用户银行卡开户行
     */
    public String getBank() {
        return bank;
    }

    /**
     * 设置：第三方序列号
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * 获取：第三方序列号
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置：确认码，实时付款确认交易使用
     */
    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }

    /**
     * 获取：确认码，实时付款确认交易使用
     */
    public String getConfirmCode() {
        return confirmCode;
    }

    /**
     * 设置：资金来源 10:自有资金 20:其他资金
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取：资金来源 10:自有资金 20:其他资金
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置：支付方式 10:代付 20:代扣 30:线下代付  40:线下代扣
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：支付方式 10:代付 20:代扣 30:线下代付  40:线下代扣
     */
    public String getType() {
        return type;
    }

    /**
     * 设置：业务场景  10、放款  11、分润 12、退还 20、还款 21、补扣
     */
    public void setScenes(String scenes) {
        this.scenes = scenes;
    }

    /**
     * 获取：业务场景  10、放款  11、分润 12、退还 20、还款 21、补扣
     */
    public String getScenes() {
        return scenes;
    }

    /**
     * 设置：支付状态   10:待支付 、15:待审核 、20:审核通过、 30:审核不通过 、40:支付成功、50:支付失败
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：支付状态   10:待支付 、15:待审核 、20:审核通过、 30:审核不通过 、40:支付成功、50:支付失败
     */
    public String getState() {
        return state;
    }

    /**
     * 设置：备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：支付请求时间
     */
    public void setPayReqTime(Date payReqTime) {
        this.payReqTime = payReqTime;
    }

    /**
     * 获取：支付请求时间
     */
    public Date getPayReqTime() {
        return payReqTime;
    }

    /**
     * 设置：更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
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
     * Getter method for property <tt>payCode</tt>.
     * 
     * @return property value of payCode
     */
    public String getPayCode() {
        return payCode;
    }

    /**
     * Setter method for property <tt>payCode</tt>.
     * 
     * @param payCode value to be assigned to property payCode
     */
    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    /**
     * Getter method for property <tt>advanceAmount</tt>.
     * 
     * @return property value of advanceAmount
     */
    public BigDecimal getAdvanceAmount() {
        return advanceAmount;
    }

    /**
     * Setter method for property <tt>advanceAmount</tt>.
     * 
     * @param advanceAmount value to be assigned to property advanceAmount
     */
    public void setAdvanceAmount(BigDecimal advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    /**
     * Getter method for property <tt>repayInterest</tt>.
     * 
     * @return property value of repayInterest
     */
    public BigDecimal getRepayInterest() {
        return repayInterest;
    }

    /**
     * Setter method for property <tt>repayInterest</tt>.
     * 
     * @param repayInterest value to be assigned to property repayInterest
     */
    public void setRepayInterest(BigDecimal repayInterest) {
        this.repayInterest = repayInterest;
    }

}
