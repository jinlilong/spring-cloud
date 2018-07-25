package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 抵押物记录
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClMortgageEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long              id;
    //订单号
    private String            orderNo;
    //
    private Long              userId;
    //
    private String            mobile;
    //
    private String            name;
    //抵押物的描述，车位，房产 等
    private String            descript;
    //所在城市
    private String            dyCity;
    //所在地址
    private String            dyAddress;
    //
    private String            dyCommunity;
    //抵押物类型 10 车库  20 房产 
    private String            dyType;
    //面积
    private BigDecimal        dyArea;
    //购买时间
    private String            dyBuyYear;
    //购买价格
    private BigDecimal        dyBuyPrice;
    //
    private BigDecimal        marketValue;
    //要借款额度
    private BigDecimal        borrowAmount;
    //有效期
    private Date              expireDate;
    //状态  10 新申请 20 审核中 30 审核通过 40 终身通过 50 已提现 60 审核被拒绝  70 冻结
    private String            state;
    //是否有效 F 有效 T 无效
    private String            halt;
    //
    private String            remark;
    //申请时间
    private Date              applyDate;
    //
    private Long              applyby;
    //最终审核额度
    private BigDecimal        realQuota;
    //最终核定的 利率 0.05%
    private BigDecimal        realRate;
    //
    private Long              passBy;
    //
    private Date              updated;
    //创建时间
    private Date              created;

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
     * 设置：
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取：
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置：
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：抵押物的描述，车位，房产 等
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 获取：抵押物的描述，车位，房产 等
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 设置：所在城市
     */
    public void setDyCity(String dyCity) {
        this.dyCity = dyCity;
    }

    /**
     * 获取：所在城市
     */
    public String getDyCity() {
        return dyCity;
    }

    /**
     * 设置：所在地址
     */
    public void setDyAddress(String dyAddress) {
        this.dyAddress = dyAddress;
    }

    /**
     * 获取：所在地址
     */
    public String getDyAddress() {
        return dyAddress;
    }

    /**
     * 设置：
     */
    public void setDyCommunity(String dyCommunity) {
        this.dyCommunity = dyCommunity;
    }

    /**
     * 获取：
     */
    public String getDyCommunity() {
        return dyCommunity;
    }

    /**
     * 设置：抵押物类型 10 车库  20 房产 
     */
    public void setDyType(String dyType) {
        this.dyType = dyType;
    }

    /**
     * 获取：抵押物类型 10 车库  20 房产 
     */
    public String getDyType() {
        return dyType;
    }

    /**
     * 设置：面积
     */
    public void setDyArea(BigDecimal dyArea) {
        this.dyArea = dyArea;
    }

    /**
     * 获取：面积
     */
    public BigDecimal getDyArea() {
        return dyArea;
    }

    /**
     * 设置：购买时间
     */
    public void setDyBuyYear(String dyBuyYear) {
        this.dyBuyYear = dyBuyYear;
    }

    /**
     * 获取：购买时间
     */
    public String getDyBuyYear() {
        return dyBuyYear;
    }

    /**
     * 设置：购买价格
     */
    public void setDyBuyPrice(BigDecimal dyBuyPrice) {
        this.dyBuyPrice = dyBuyPrice;
    }

    /**
     * 获取：购买价格
     */
    public BigDecimal getDyBuyPrice() {
        return dyBuyPrice;
    }

    /**
     * 设置：
     */
    public void setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
    }

    /**
     * 获取：
     */
    public BigDecimal getMarketValue() {
        return marketValue;
    }

    /**
     * 设置：要借款额度
     */
    public void setBorrowAmount(BigDecimal borrowAmount) {
        this.borrowAmount = borrowAmount;
    }

    /**
     * 获取：要借款额度
     */
    public BigDecimal getBorrowAmount() {
        return borrowAmount;
    }

    /**
     * 设置：有效期
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * 获取：有效期
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * 设置：状态  10 新申请 20 审核中 30 审核通过 40 终身通过 50 已提现 60 审核被拒绝  70 冻结
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：状态  10 新申请 20 审核中 30 审核通过 40 终身通过 50 已提现 60 审核被拒绝  70 冻结
     */
    public String getState() {
        return state;
    }

    /**
     * 设置：是否有效 F 有效 T 无效
     */
    public void setHalt(String halt) {
        this.halt = halt;
    }

    /**
     * 获取：是否有效 F 有效 T 无效
     */
    public String getHalt() {
        return halt;
    }

    /**
     * 设置：
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：申请时间
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * 获取：申请时间
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * 设置：
     */
    public void setApplyby(Long applyby) {
        this.applyby = applyby;
    }

    /**
     * 获取：
     */
    public Long getApplyby() {
        return applyby;
    }

    /**
     * 设置：最终审核额度
     */
    public void setRealQuota(BigDecimal realQuota) {
        this.realQuota = realQuota;
    }

    /**
     * 获取：最终审核额度
     */
    public BigDecimal getRealQuota() {
        return realQuota;
    }

    /**
     * 设置：最终核定的 利率 0.05%
     */
    public void setRealRate(BigDecimal realRate) {
        this.realRate = realRate;
    }

    /**
     * 获取：最终核定的 利率 0.05%
     */
    public BigDecimal getRealRate() {
        return realRate;
    }

    /**
     * 设置：
     */
    public void setPassBy(Long passBy) {
        this.passBy = passBy;
    }

    /**
     * 获取：
     */
    public Long getPassBy() {
        return passBy;
    }

    /**
     * 设置：
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取：
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置：创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreated() {
        return created;
    }
}
