package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户诉讼情况
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class SpUserLawsuitEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long              id;
    //用户id
    private Long              userId;
    //录入人id
    private String            sysUserId;
    //立案时间
    private Date              registerTime;
    //立案原因
    private String            registerCause;
    //金额
    private BigDecimal        amount;
    //角色
    private String            role;
    //录入时间
    private Date              createTime;
    //修改时间
    private Date              updateTime;

    /**
     * 设置：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：
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
     * 设置：录入人id
     */
    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * 获取：录入人id
     */
    public String getSysUserId() {
        return sysUserId;
    }

    /**
     * 设置：立案时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取：立案时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置：立案原因
     */
    public void setRegisterCause(String registerCause) {
        this.registerCause = registerCause;
    }

    /**
     * 获取：立案原因
     */
    public String getRegisterCause() {
        return registerCause;
    }

    /**
     * 设置：金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取：金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置：角色
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取：角色
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置：录入时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：录入时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }
}
