package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 提额或减额记录
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-15 13:09:20
 */
public class ArcCreditIncreaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //cl_user表主键ID
    private Long              id;
    //
    private Long              userId;
    //提额或减额备注
    private String            mark;
    //额度，，负数代表减额
    private BigDecimal        credit;
    //操作时间
    private Date              createTime;
    //操作人
    private String            createName;

    /**
     * 设置：cl_user表主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：cl_user表主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：提额或减额备注
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * 获取：提额或减额备注
     */
    public String getMark() {
        return mark;
    }

    /**
     * 设置：额度，，负数代表减额
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * 获取：额度，，负数代表减额
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * 设置：操作时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：操作时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：操作人
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * 获取：操作人
     */
    public String getCreateName() {
        return createName;
    }
}
