package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 额度审批租赁物信息
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-09 16:31:40
 */
public class SpCreditLeaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long              id;
    //租赁物名称
    private String            name;
    //品牌
    private String            logo;
    //坐落地址
    private String            address;
    //购置时间
    private String            buyTime;
    //原购买价
    private BigDecimal        price;
    //其他信息
    private String            info;
    //额度审批ID
    private Long              creditId;
    //创建时间
    private Date              createTime;
    //
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
     * 设置：租赁物名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：租赁物名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：品牌
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取：品牌
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置：坐落地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取：坐落地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置：购置时间
     */
    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    /**
     * 获取：购置时间
     */
    public String getBuyTime() {
        return buyTime;
    }

    /**
     * 设置：原购买价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取：原购买价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置：其他信息
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取：其他信息
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置：额度审批ID
     */
    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    /**
     * 获取：额度审批ID
     */
    public Long getCreditId() {
        return creditId;
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
}
