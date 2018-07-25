package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 还款记录表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClBorrowRepayLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //还款计划id
    private Long              repayId;
    //借款订单id
    private Long              borrowId;
    //用户id
    private Long              userId;
    //实际还款金额
    private BigDecimal        amount;
    //逾期天数
    private Integer           penaltyDay;
    //逾期罚金
    private BigDecimal        penaltyAmout;
    //还款方式   10代扣，20银行卡转账，30支付宝转账
    private String            repayWay;
    //还款账号
    private String            repayAccount;
    //还款流水号
    private String            serialNumber;
    //退还或补扣金额
    private BigDecimal        refundDeduction;
    //退还或补扣支付时间
    private Date              payTime;
    //实际还款时间
    private Date              repayTime;
    //创建时间
    private Date              createTime;

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
     * 设置：还款计划id
     */
    public void setRepayId(Long repayId) {
        this.repayId = repayId;
    }

    /**
     * 获取：还款计划id
     */
    public Long getRepayId() {
        return repayId;
    }

    /**
     * 设置：借款订单id
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * 获取：借款订单id
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * 设置：用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：实际还款金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取：实际还款金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置：逾期天数
     */
    public void setPenaltyDay(Integer penaltyDay) {
        this.penaltyDay = penaltyDay;
    }

    /**
     * 获取：逾期天数
     */
    public Integer getPenaltyDay() {
        return penaltyDay;
    }

    /**
     * 设置：逾期罚金
     */
    public void setPenaltyAmout(BigDecimal penaltyAmout) {
        this.penaltyAmout = penaltyAmout;
    }

    /**
     * 获取：逾期罚金
     */
    public BigDecimal getPenaltyAmout() {
        return penaltyAmout;
    }

    /**
     * 设置：还款方式   10代扣，20银行卡转账，30支付宝转账
     */
    public void setRepayWay(String repayWay) {
        this.repayWay = repayWay;
    }

    /**
     * 获取：还款方式   10代扣，20银行卡转账，30支付宝转账
     */
    public String getRepayWay() {
        return repayWay;
    }

    /**
     * 设置：还款账号
     */
    public void setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
    }

    /**
     * 获取：还款账号
     */
    public String getRepayAccount() {
        return repayAccount;
    }

    /**
     * 设置：还款流水号
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * 获取：还款流水号
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置：退还或补扣金额
     */
    public void setRefundDeduction(BigDecimal refundDeduction) {
        this.refundDeduction = refundDeduction;
    }

    /**
     * 获取：退还或补扣金额
     */
    public BigDecimal getRefundDeduction() {
        return refundDeduction;
    }

    /**
     * 设置：退还或补扣支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取：退还或补扣支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置：实际还款时间
     */
    public void setRepayTime(Date repayTime) {
        this.repayTime = repayTime;
    }

    /**
     * 获取：实际还款时间
     */
    public Date getRepayTime() {
        return repayTime;
    }

    /**
     * 设置：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }
}
