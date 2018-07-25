package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClOverdueFineLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键id
    private Integer           id;
    //借款订单id
    private Long              borrowId;
    //分期订单id
    private Long              repayId;
    //罚金基数
    private BigDecimal        total;
    //罚金利率
    private BigDecimal        rate;
    //逾期天数
    private Integer           day;
    //罚金金额
    private BigDecimal        fine;
    //本次计算后总金额
    private BigDecimal        amount;
    //创建时间
    private Date              createTime;

    /**
     * 设置：主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：主键id
     */
    public Integer getId() {
        return id;
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
     * 设置：分期订单id
     */
    public void setRepayId(Long repayId) {
        this.repayId = repayId;
    }

    /**
     * 获取：分期订单id
     */
    public Long getRepayId() {
        return repayId;
    }

    /**
     * 设置：罚金基数
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * 获取：罚金基数
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * 设置：罚金利率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取：罚金利率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置：逾期天数
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * 获取：逾期天数
     */
    public Integer getDay() {
        return day;
    }

    /**
     * 设置：罚金金额
     */
    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }

    /**
     * 获取：罚金金额
     */
    public BigDecimal getFine() {
        return fine;
    }

    /**
     * 设置：本次计算后总金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取：本次计算后总金额
     */
    public BigDecimal getAmount() {
        return amount;
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
