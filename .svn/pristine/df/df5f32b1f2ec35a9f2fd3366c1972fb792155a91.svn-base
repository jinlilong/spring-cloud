package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 审批额度信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-04-18 19:02:12
 */
public class SpCreditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //用户标识
    private Long              userId;
    //合同订单号
    private String            contractNum;
    //项目id
    private Long              villageId;
    //录入人id
    private String            addId;
    //申请额度
    private BigDecimal        credit;
    //日利率
    private BigDecimal        rate;
    //申请有效开始时间
    private Date              declareTimeStart;
    //业务类型:Z:直租,H:回租,X:其他
    private String            serviceType;
    //业务品种:C:纯存量,M:存量含买断,X:增转存
    private String            serviceVariety;
    //修改时间
    private Date              updateTime;
    //业务流程状态 0:待审批状态
    private Integer           status;
    //流程发起时间
    private Date              startTime;
    //添加时间
    private Date              addTime;
    //序列号
    private String            xlz;
    //申请有效结束时间
    private Date              declareTimeEnd;
    //组织结构code
    private String            organCode;
    //省份code
    private String            provinceCode;
    //市code
    private String            cityCode;
    //区code
    private String            countryCode;
    //任务名称
    private String            title;
    //可编辑状态,1:可编辑，1：不可
    private String            editState;
    //创建人
    private String            addName;
    //机构名称
    private String            organName;
    //用户姓名
    private String            userName;
    //
    private String            areaName;
    //
    private String            cityName;
    //
    private String            countyName;
    //住址
    private String            address;
    //邮政编码
    private String            postalCode;
    //传真
    private String            faxNo;
    //配偶姓名
    private String            spouseName;
    //配偶身份证号
    private String            spouseNo;
    //购置时间
    private Date              buyTime;
    //是否需要走线下签合同  0:线下，1：线上
    private String            uploadContract;
    //是否有证，0：无，1：有
    private String            isCredentials;
    //是否可提前还款状态，1：可，0：不可
    private String            advanceState;
    //是否单笔借款/额度借款  单笔0：额度：1
    private String            singleLoan;
    //抵押类型，0：车位分期，车位信用抵押
    private String            mortgageType;
    //提前还款是否需要付违约金,0:不需要，1:需要
    private String            advancePay;
    //违约金比例
    private BigDecimal        advanceRate;
    //是否需要签约
    private String            isSign;
    //额度有效期月数
    private Integer           months;
    //
    private BigDecimal        monthRate;

    //服务费费率
    private BigDecimal        serviceRate;
    //手术费费率
    private BigDecimal        proceduresRate;

    private String            maritalStatus;
    private String            sourceChannel;

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSourceChannel() {
        return sourceChannel;
    }

    public void setSourceChannel(String sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

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
     * 设置：合同订单号
     */
    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    /**
     * 获取：合同订单号
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * 设置：项目id
     */
    public void setVillageId(Long villageId) {
        this.villageId = villageId;
    }

    /**
     * 获取：项目id
     */
    public Long getVillageId() {
        return villageId;
    }

    /**
     * 设置：录入人id
     */
    public void setAddId(String addId) {
        this.addId = addId;
    }

    /**
     * 获取：录入人id
     */
    public String getAddId() {
        return addId;
    }

    /**
     * 设置：申请额度
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * 获取：申请额度
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * 设置：日利率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取：日利率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置：业务类型:Z:直租,H:回租,X:其他
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 获取：业务类型:Z:直租,H:回租,X:其他
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * 设置：业务品种:C:纯存量,M:存量含买断,X:增转存
     */
    public void setServiceVariety(String serviceVariety) {
        this.serviceVariety = serviceVariety;
    }

    /**
     * 获取：业务品种:C:纯存量,M:存量含买断,X:增转存
     */
    public String getServiceVariety() {
        return serviceVariety;
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

    /**
     * 设置：业务流程状态 0:待审批状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取：业务流程状态 0:待审批状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：流程发起时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取：流程发起时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置：添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取：添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * Getter method for property <tt>xlz</tt>.
     * 
     * @return property value of xlz
     */
    public String getXlz() {
        return xlz;
    }

    /**
     * Setter method for property <tt>xlz</tt>.
     * 
     * @param xlz value to be assigned to property xlz
     */
    public void setXlz(String xlz) {
        this.xlz = xlz;
    }

    /**
     * 设置：组织结构code
     */
    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    /**
     * 获取：组织结构code
     */
    public String getOrganCode() {
        return organCode;
    }

    /**
     * 设置：省份code
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * 获取：省份code
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置：市code
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 获取：市code
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置：区code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 获取：区code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置：任务名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取：任务名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置：可编辑状态,1:可编辑，1：不可
     */
    public void setEditState(String editState) {
        this.editState = editState;
    }

    /**
     * 获取：可编辑状态,1:可编辑，1：不可
     */
    public String getEditState() {
        return editState;
    }

    /**
     * 设置：创建人
     */
    public void setAddName(String addName) {
        this.addName = addName;
    }

    /**
     * 获取：创建人
     */
    public String getAddName() {
        return addName;
    }

    /**
     * 设置：机构名称
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * 获取：机构名称
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 设置：用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取：用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置：
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 获取：
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设置：
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取：
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置：
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    /**
     * 获取：
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * 设置：住址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取：住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置：邮政编码
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 获取：邮政编码
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置：传真
     */
    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    /**
     * 获取：传真
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * 设置：配偶姓名
     */
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    /**
     * 获取：配偶姓名
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * 设置：配偶身份证号
     */
    public void setSpouseNo(String spouseNo) {
        this.spouseNo = spouseNo;
    }

    /**
     * 获取：配偶身份证号
     */
    public String getSpouseNo() {
        return spouseNo;
    }

    /**
     * 设置：购置时间
     */
    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    /**
     * 获取：购置时间
     */
    public Date getBuyTime() {
        return buyTime;
    }

    /**
     * 设置：是否需要走线下签合同  0:线下，1：线上
     */
    public void setUploadContract(String uploadContract) {
        this.uploadContract = uploadContract;
    }

    /**
     * 获取：是否需要走线下签合同  0:线下，1：线上
     */
    public String getUploadContract() {
        return uploadContract;
    }

    /**
     * 设置：是否有证，0：无，1：有
     */
    public void setIsCredentials(String isCredentials) {
        this.isCredentials = isCredentials;
    }

    /**
     * 获取：是否有证，0：无，1：有
     */
    public String getIsCredentials() {
        return isCredentials;
    }

    /**
     * 设置：是否可提前还款状态，1：可，0：不可
     */
    public void setAdvanceState(String advanceState) {
        this.advanceState = advanceState;
    }

    /**
     * 获取：是否可提前还款状态，1：可，0：不可
     */
    public String getAdvanceState() {
        return advanceState;
    }

    /**
     * 设置：是否单笔借款/额度借款  单笔0：额度：1
     */
    public void setSingleLoan(String singleLoan) {
        this.singleLoan = singleLoan;
    }

    /**
     * 获取：是否单笔借款/额度借款  单笔0：额度：1
     */
    public String getSingleLoan() {
        return singleLoan;
    }

    /**
     * 设置：抵押类型，0：车位分期，车位信用抵押
     */
    public void setMortgageType(String mortgageType) {
        this.mortgageType = mortgageType;
    }

    /**
     * 获取：抵押类型，0：车位分期，车位信用抵押
     */
    public String getMortgageType() {
        return mortgageType;
    }

    /**
     * 设置：提前还款是否需要付违约金,0:不需要，1:需要
     */
    public void setAdvancePay(String advancePay) {
        this.advancePay = advancePay;
    }

    /**
     * 获取：提前还款是否需要付违约金,0:不需要，1:需要
     */
    public String getAdvancePay() {
        return advancePay;
    }

    /**
     * 设置：违约金比例
     */
    public void setAdvanceRate(BigDecimal advanceRate) {
        this.advanceRate = advanceRate;
    }

    /**
     * 获取：违约金比例
     */
    public BigDecimal getAdvanceRate() {
        return advanceRate;
    }

    /**
     * 设置：是否需要签约
     */
    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }

    /**
     * 获取：是否需要签约
     */
    public String getIsSign() {
        return isSign;
    }

    /**
     * 设置：额度有效期月数
     */
    public void setMonths(Integer months) {
        this.months = months;
    }

    /**
     * 获取：额度有效期月数
     */
    public Integer getMonths() {
        return months;
    }

    /**
     * 设置：
     */
    public void setMonthRate(BigDecimal monthRate) {
        this.monthRate = monthRate;
    }

    /**
     * 获取：
     */
    public BigDecimal getMonthRate() {
        return monthRate;
    }

    /**
     * Getter method for property <tt>declareTimeStart</tt>.
     * 
     * @return property value of declareTimeStart
     */
    public Date getDeclareTimeStart() {
        return declareTimeStart;
    }

    /**
     * Setter method for property <tt>declareTimeStart</tt>.
     * 
     * @param declareTimeStart value to be assigned to property declareTimeStart
     */
    public void setDeclareTimeStart(Date declareTimeStart) {
        this.declareTimeStart = declareTimeStart;
    }

    /**
     * Getter method for property <tt>declareTimeEnd</tt>.
     * 
     * @return property value of declareTimeEnd
     */
    public Date getDeclareTimeEnd() {
        return declareTimeEnd;
    }

    /**
     * Setter method for property <tt>declareTimeEnd</tt>.
     * 
     * @param declareTimeEnd value to be assigned to property declareTimeEnd
     */
    public void setDeclareTimeEnd(Date declareTimeEnd) {
        this.declareTimeEnd = declareTimeEnd;
    }

    /**
     * Getter method for property <tt>serviceRate</tt>.
     * 
     * @return property value of serviceRate
     */
    public BigDecimal getServiceRate() {
        return serviceRate;
    }

    /**
     * Setter method for property <tt>serviceRate</tt>.
     * 
     * @param serviceRate value to be assigned to property serviceRate
     */
    public void setServiceRate(BigDecimal serviceRate) {
        this.serviceRate = serviceRate;
    }

    /**
     * Getter method for property <tt>proceduresRate</tt>.
     * 
     * @return property value of proceduresRate
     */
    public BigDecimal getProceduresRate() {
        return proceduresRate;
    }

    /**
     * Setter method for property <tt>proceduresRate</tt>.
     * 
     * @param proceduresRate value to be assigned to property proceduresRate
     */
    public void setProceduresRate(BigDecimal proceduresRate) {
        this.proceduresRate = proceduresRate;
    }

}
