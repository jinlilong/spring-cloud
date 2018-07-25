package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 授信额度表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ArcCreditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //用户标识
    private Long              userId;
    //总额度
    private BigDecimal        total;
    //额度类型
    private Long              creditType;
    //评分
    private String            grade;
    //已使用额度
    private BigDecimal        used;
    //可使用额度
    private BigDecimal        unuse;
    //状态 10 -正常 20-冻结
    private String            state;
    //扩展字段
    private String            reqExt;

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
     * 设置：总额度
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * 获取：总额度
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * 设置：额度类型
     */
    public void setCreditType(Long creditType) {
        this.creditType = creditType;
    }

    /**
     * 获取：额度类型
     */
    public Long getCreditType() {
        return creditType;
    }

    /**
     * 设置：评分
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取：评分
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置：已使用额度
     */
    public void setUsed(BigDecimal used) {
        this.used = used;
    }

    /**
     * 获取：已使用额度
     */
    public BigDecimal getUsed() {
        return used;
    }

    /**
     * 设置：可使用额度
     */
    public void setUnuse(BigDecimal unuse) {
        this.unuse = unuse;
    }

    /**
     * 获取：可使用额度
     */
    public BigDecimal getUnuse() {
        return unuse;
    }

    /**
     * 设置：状态 10 -正常 20-冻结
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：状态 10 -正常 20-冻结
     */
    public String getState() {
        return state;
    }

    /**
     * 设置：扩展字段
     */
    public void setReqExt(String reqExt) {
        this.reqExt = reqExt;
    }

    /**
     * 获取：扩展字段
     */
    public String getReqExt() {
        return reqExt;
    }
}
