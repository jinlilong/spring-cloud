package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 借款进度表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClBorrowProgressEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //关联用户id
    private Long              userId;
    //借款信息id
    private Long              borrowId;
    //借款进度状态 10申请成功待审核  20自动审核通过 21自动审核不通过  22自动审核未决待人工复审 26人工复审通过 27人工复审不通过    30放款成功  31放款失败   40还款成功    50逾期  90坏账
    private String            state;
    //进度描述
    private String            remark;
    //进度生成时间
    private Date              createTime;
    //放款日期
    private Date              loanTime;
    //还款日期
    private Date              repayTime;

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
     * 设置：关联用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：关联用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：借款信息id
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * 获取：借款信息id
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * 设置：借款进度状态 10申请成功待审核  20自动审核通过 21自动审核不通过  22自动审核未决待人工复审 26人工复审通过 27人工复审不通过    30放款成功  31放款失败   40还款成功    50逾期  90坏账
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：借款进度状态 10申请成功待审核  20自动审核通过 21自动审核不通过  22自动审核未决待人工复审 26人工复审通过 27人工复审不通过    30放款成功  31放款失败   40还款成功    50逾期  90坏账
     */
    public String getState() {
        return state;
    }

    /**
     * 设置：进度描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：进度描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：进度生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：进度生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：放款日期
     */
    public void setLoanTime(Date loanTime) {
        this.loanTime = loanTime;
    }

    /**
     * 获取：放款日期
     */
    public Date getLoanTime() {
        return loanTime;
    }

    /**
     * 设置：还款日期
     */
    public void setRepayTime(Date repayTime) {
        this.repayTime = repayTime;
    }

    /**
     * 获取：还款日期
     */
    public Date getRepayTime() {
        return repayTime;
    }
}
