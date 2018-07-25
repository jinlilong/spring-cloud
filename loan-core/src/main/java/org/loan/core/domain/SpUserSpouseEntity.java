package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户配偶信息
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
public class SpUserSpouseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //id
    private Long              id;
    //用户id
    private Long              userId;
    //配偶姓名
    private String            name;
    //证件类型
    private String            credentialsType;
    //证件类型
    private String            credentialsNumber;
    //学历
    private String            education;
    //职务
    private String            duties;
    //政治面貌
    private String            politicalStatus;
    //联系电话
    private String            phone;
    //工作单位
    private String            company;
    //税后收人
    private BigDecimal        revenue;
    //单位性质
    private String            companyCharacter;
    //单位电话
    private String            companyPhone;
    //单位地址
    private String            companyAdress;
    //创建时间
    private Date              createTime;
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
     * 设置：配偶姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：配偶姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：证件类型
     */
    public void setCredentialsType(String credentialsType) {
        this.credentialsType = credentialsType;
    }

    /**
     * 获取：证件类型
     */
    public String getCredentialsType() {
        return credentialsType;
    }

    /**
     * 设置：证件类型
     */
    public void setCredentialsNumber(String credentialsNumber) {
        this.credentialsNumber = credentialsNumber;
    }

    /**
     * 获取：证件类型
     */
    public String getCredentialsNumber() {
        return credentialsNumber;
    }

    /**
     * 设置：学历
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 获取：学历
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设置：职务
     */
    public void setDuties(String duties) {
        this.duties = duties;
    }

    /**
     * 获取：职务
     */
    public String getDuties() {
        return duties;
    }

    /**
     * 设置：政治面貌
     */
    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    /**
     * 获取：政治面貌
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * 设置：联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取：联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置：工作单位
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取：工作单位
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置：税后收人
     */
    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    /**
     * 获取：税后收人
     */
    public BigDecimal getRevenue() {
        return revenue;
    }

    /**
     * 设置：单位性质
     */
    public void setCompanyCharacter(String companyCharacter) {
        this.companyCharacter = companyCharacter;
    }

    /**
     * 获取：单位性质
     */
    public String getCompanyCharacter() {
        return companyCharacter;
    }

    /**
     * 设置：单位电话
     */
    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    /**
     * 获取：单位电话
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * 设置：单位地址
     */
    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

    /**
     * 获取：单位地址
     */
    public String getCompanyAdress() {
        return companyAdress;
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
