package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户旗下公司
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
public class SpUserCompanyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //id
    private Long              id;
    //用户id
    private Long              userId;
    //公司名称
    private String            companyName;
    //组织机构号
    private String            organizationNumber;
    //关系
    private String            relation;
    //联系人
    private String            contacts;
    //联系人电话
    private String            contactsPhone;
    //注册时间
    private Date              registerTime;
    //注册资本
    private BigDecimal        registerCapital;
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
     * 设置：公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取：公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置：组织机构号
     */
    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    /**
     * 获取：组织机构号
     */
    public String getOrganizationNumber() {
        return organizationNumber;
    }

    /**
     * 设置：关系
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * 获取：关系
     */
    public String getRelation() {
        return relation;
    }

    /**
     * 设置：联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取：联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置：联系人电话
     */
    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    /**
     * 获取：联系人电话
     */
    public String getContactsPhone() {
        return contactsPhone;
    }

    /**
     * 设置：注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取：注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置：注册资本
     */
    public void setRegisterCapital(BigDecimal registerCapital) {
        this.registerCapital = registerCapital;
    }

    /**
     * 获取：注册资本
     */
    public BigDecimal getRegisterCapital() {
        return registerCapital;
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
