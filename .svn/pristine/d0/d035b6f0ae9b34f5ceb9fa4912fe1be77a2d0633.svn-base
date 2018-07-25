package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 我方与第三方新华金典还款记录对应表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClBorrowRepayThirdEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //订单号
    private String            orderNo;
    //还款id
    private Long              borrowRepayId;
    //还款第三方流水号（新华金典还款流水号）
    private String            thirdRepayNo;
    //本次还款总金额
    private BigDecimal        repayAmount;
    //状态 0未还款，1已还款，2还款中
    private Integer           status;
    //
    private Date              createTime;
    //
    private Date              updateTime;
    //利息
    private BigDecimal        interest;
    //逾期罚金
    private BigDecimal        penaltyAmout;
    //本次还款本金
    private BigDecimal        principleAmount;

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
     * 设置：还款id
     */
    public void setBorrowRepayId(Long borrowRepayId) {
        this.borrowRepayId = borrowRepayId;
    }

    /**
     * 获取：还款id
     */
    public Long getBorrowRepayId() {
        return borrowRepayId;
    }

    /**
     * 设置：还款第三方流水号（新华金典还款流水号）
     */
    public void setThirdRepayNo(String thirdRepayNo) {
        this.thirdRepayNo = thirdRepayNo;
    }

    /**
     * 获取：还款第三方流水号（新华金典还款流水号）
     */
    public String getThirdRepayNo() {
        return thirdRepayNo;
    }

    /**
     * 设置：本次还款总金额
     */
    public void setRepayAmount(BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }

    /**
     * 获取：本次还款总金额
     */
    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    /**
     * 设置：状态 0未还款，1已还款，2还款中
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取：状态 0未还款，1已还款，2还款中
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置：利息
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * 获取：利息
     */
    public BigDecimal getInterest() {
        return interest;
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
     * 设置：本次还款本金
     */
    public void setPrincipleAmount(BigDecimal principleAmount) {
        this.principleAmount = principleAmount;
    }

    /**
     * 获取：本次还款本金
     */
    public BigDecimal getPrincipleAmount() {
        return principleAmount;
    }
}
