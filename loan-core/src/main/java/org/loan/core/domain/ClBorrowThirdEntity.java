package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 我方借款订单号与新华金典放款对应表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClBorrowThirdEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //订单号
    private String            orderNo;
    //第三方放款流水号（新华金典放款流水号）
    private String            thirdNo;
    //状态：0成功，1放款失败
    private Integer           status;
    //
    private Date              createTime;
    //
    private Date              updateTime;
    //打款金额（新华金典返回的）
    private BigDecimal        payAmount;

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
     * 设置：第三方放款流水号（新华金典放款流水号）
     */
    public void setThirdNo(String thirdNo) {
        this.thirdNo = thirdNo;
    }

    /**
     * 获取：第三方放款流水号（新华金典放款流水号）
     */
    public String getThirdNo() {
        return thirdNo;
    }

    /**
     * 设置：状态：0成功，1放款失败
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取：状态：0成功，1放款失败
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
     * 设置：打款金额（新华金典返回的）
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取：打款金额（新华金典返回的）
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }
}
