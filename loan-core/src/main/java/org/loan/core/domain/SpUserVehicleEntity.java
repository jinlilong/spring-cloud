package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户车辆信息
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
public class SpUserVehicleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //id
    private Long              id;
    //用户id
    private Long              userId;
    //车辆所有人
    private String            name;
    //车辆型号
    private String            vehicleType;
    //裸车价格
    private BigDecimal        vehiclePrice;
    //上牌时间
    private Date              licenceTime;
    //出厂日期
    private Date              manufacturingTime;
    //公里数
    private Integer           kilometer;
    //是否按揭
    private String            mortgage;
    //是否法院执行
    private String            courthouseExecute;
    //信用情况
    private String            creditInfo;
    //创建时间
    private Date              createTiem;
    //修改时间
    private Date              updateTime;

    /**
     * 设置：id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：id
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
     * 设置：车辆所有人
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：车辆所有人
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：车辆型号
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * 获取：车辆型号
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 设置：裸车价格
     */
    public void setVehiclePrice(BigDecimal vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    /**
     * 获取：裸车价格
     */
    public BigDecimal getVehiclePrice() {
        return vehiclePrice;
    }

    /**
     * 设置：上牌时间
     */
    public void setLicenceTime(Date licenceTime) {
        this.licenceTime = licenceTime;
    }

    /**
     * 获取：上牌时间
     */
    public Date getLicenceTime() {
        return licenceTime;
    }

    /**
     * 设置：出厂日期
     */
    public void setManufacturingTime(Date manufacturingTime) {
        this.manufacturingTime = manufacturingTime;
    }

    /**
     * 获取：出厂日期
     */
    public Date getManufacturingTime() {
        return manufacturingTime;
    }

    /**
     * 设置：公里数
     */
    public void setKilometer(Integer kilometer) {
        this.kilometer = kilometer;
    }

    /**
     * 获取：公里数
     */
    public Integer getKilometer() {
        return kilometer;
    }

    /**
     * 设置：是否按揭
     */
    public void setMortgage(String mortgage) {
        this.mortgage = mortgage;
    }

    /**
     * 获取：是否按揭
     */
    public String getMortgage() {
        return mortgage;
    }

    /**
     * 设置：是否法院执行
     */
    public void setCourthouseExecute(String courthouseExecute) {
        this.courthouseExecute = courthouseExecute;
    }

    /**
     * 获取：是否法院执行
     */
    public String getCourthouseExecute() {
        return courthouseExecute;
    }

    /**
     * 设置：信用情况
     */
    public void setCreditInfo(String creditInfo) {
        this.creditInfo = creditInfo;
    }

    /**
     * 获取：信用情况
     */
    public String getCreditInfo() {
        return creditInfo;
    }

    /**
     * 设置：创建时间
     */
    public void setCreateTiem(Date createTiem) {
        this.createTiem = createTiem;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreateTiem() {
        return createTiem;
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
