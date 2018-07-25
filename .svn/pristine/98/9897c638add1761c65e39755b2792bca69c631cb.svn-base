package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 还款计划表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-07 17:36:35
 */
public class ClBorrowRepayEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //用户id
    private Long              userId;
    //借款订单id
    private Long              borrowId;
    //应还本金
    private BigDecimal        realAmount;
    //利息+逾期利息
    private BigDecimal        interest;
    //
    private Integer           seq;
    //利率 百分之
    private BigDecimal        rate;
    //还款金额
    private BigDecimal        amount;
    //剩余本金
    private BigDecimal        realAmountBalance;
    //实际还款金额
    private BigDecimal        repayAmount;
    //应还款时间
    private Date              repayTime;
    //还款状态 10-已还款 20-未还款,30 部分还款，40还款中
    private String            state;
    //逾期罚金
    private BigDecimal        penaltyAmout;
    //逾期天数
    private Integer           penaltyDay;
    //创建时间
    private Date              createTime;
    //是否通知用户 10 没通知  20通知
    private String            isnotityUser;
    //计算逾期时间
    private Date              overdueTime;
    //该周期已逾期标记，1-已满期
    private Integer           overdue;
    //
    private BigDecimal        sourceInterest;
    //提前还款违约金
    private BigDecimal        advanceAmount;
    //线下还款图片凭证
    private String            offlineRepaymentVoucherPic;
    //线下还款备注
    private String            offlineRepaymentRemark;
    //是否提前还款,1:是，0：否
    private String            preState;
    //实还利息
    private BigDecimal        repayInterest;
    //服务费
    private BigDecimal        serviceAmoumt;
    //手术费
    private BigDecimal        proceduresAmount;

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
     * 设置：应还本金
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 获取：应还本金
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * 设置：利息+逾期利息
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * 获取：利息+逾期利息
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * 设置：
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取：
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置：利率 百分之
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取：利率 百分之
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置：还款金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取：还款金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置：剩余本金
     */
    public void setRealAmountBalance(BigDecimal realAmountBalance) {
        this.realAmountBalance = realAmountBalance;
    }

    /**
     * 获取：剩余本金
     */
    public BigDecimal getRealAmountBalance() {
        return realAmountBalance;
    }

    /**
     * 设置：实际还款金额
     */
    public void setRepayAmount(BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }

    /**
     * 获取：实际还款金额
     */
    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    /**
     * 设置：应还款时间
     */
    public void setRepayTime(Date repayTime) {
        this.repayTime = repayTime;
    }

    /**
     * 获取：应还款时间
     */
    public Date getRepayTime() {
        return repayTime;
    }

    /**
     * 设置：还款状态 10-已还款 20-未还款,30 部分还款，40还款中
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：还款状态 10-已还款 20-未还款,30 部分还款，40还款中
     */
    public String getState() {
        return state;
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

    /**
     * 设置：是否通知用户 10 没通知  20通知
     */
    public void setIsnotityUser(String isnotityUser) {
        this.isnotityUser = isnotityUser;
    }

    /**
     * 获取：是否通知用户 10 没通知  20通知
     */
    public String getIsnotityUser() {
        return isnotityUser;
    }

    /**
     * 设置：计算逾期时间
     */
    public void setOverdueTime(Date overdueTime) {
        this.overdueTime = overdueTime;
    }

    /**
     * 获取：计算逾期时间
     */
    public Date getOverdueTime() {
        return overdueTime;
    }

    /**
     * 设置：该周期已逾期标记，1-已满期
     */
    public void setOverdue(Integer overdue) {
        this.overdue = overdue;
    }

    /**
     * 获取：该周期已逾期标记，1-已满期
     */
    public Integer getOverdue() {
        return overdue;
    }

    /**
     * 设置：
     */
    public void setSourceInterest(BigDecimal sourceInterest) {
        this.sourceInterest = sourceInterest;
    }

    /**
     * 获取：
     */
    public BigDecimal getSourceInterest() {
        return sourceInterest;
    }

    /**
     * 设置：提前还款违约金
     */
    public void setAdvanceAmount(BigDecimal advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    /**
     * 获取：提前还款违约金
     */
    public BigDecimal getAdvanceAmount() {
        return advanceAmount;
    }

    /**
     * 设置：线下还款图片凭证
     */
    public void setOfflineRepaymentVoucherPic(String offlineRepaymentVoucherPic) {
        this.offlineRepaymentVoucherPic = offlineRepaymentVoucherPic;
    }

    /**
     * 获取：线下还款图片凭证
     */
    public String getOfflineRepaymentVoucherPic() {
        return offlineRepaymentVoucherPic;
    }

    /**
     * 设置：线下还款备注
     */
    public void setOfflineRepaymentRemark(String offlineRepaymentRemark) {
        this.offlineRepaymentRemark = offlineRepaymentRemark;
    }

    /**
     * 获取：线下还款备注
     */
    public String getOfflineRepaymentRemark() {
        return offlineRepaymentRemark;
    }

    /**
     * 设置：是否提前还款,1:是，0：否
     */
    public void setPreState(String preState) {
        this.preState = preState;
    }

    /**
     * 获取：是否提前还款,1:是，0：否
     */
    public String getPreState() {
        return preState;
    }

    /**
     * 设置：实还利息
     */
    public void setRepayInterest(BigDecimal repayInterest) {
        this.repayInterest = repayInterest;
    }

    /**
     * 获取：实还利息
     */
    public BigDecimal getRepayInterest() {
        return repayInterest;
    }

    /**
     * 设置：服务费
     */
    public void setServiceAmoumt(BigDecimal serviceAmoumt) {
        this.serviceAmoumt = serviceAmoumt;
    }

    /**
     * 获取：服务费
     */
    public BigDecimal getServiceAmoumt() {
        return serviceAmoumt;
    }

    /**
     * 设置：手术费
     */
    public void setProceduresAmount(BigDecimal proceduresAmount) {
        this.proceduresAmount = proceduresAmount;
    }

    /**
     * 获取：手术费
     */
    public BigDecimal getProceduresAmount() {
        return proceduresAmount;
    }
}
