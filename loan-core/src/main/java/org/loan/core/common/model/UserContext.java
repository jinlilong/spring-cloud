package org.loan.core.common.model;

/**
 * Copyright (c) 2018 All Rights Reserved.
 */

/**
 * 
 * @author jinlilong
 * @version $Id: UserContext.java, v 0.1 2018年7月17日 下午3:21:50 jinlilong Exp $
 */
public class UserContext {

    /**  用户Id*/
    private Long   userId;

    /**  用户姓名*/
    private String realName;

    /**  用户手机号*/
    private String loginName;

    /**  用户的产品类型 对应borrowCatEnums  mortgageType*/
    private String mortgageType;

    /**
     * Getter method for property <tt>userId</tt>.
     * 
     * @return property value of userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     * 
     * @param userId value to be assigned to property userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>realName</tt>.
     * 
     * @return property value of realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * Setter method for property <tt>realName</tt>.
     * 
     * @param realName value to be assigned to property realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * Getter method for property <tt>loginName</tt>.
     * 
     * @return property value of loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Setter method for property <tt>loginName</tt>.
     * 
     * @param loginName value to be assigned to property loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * Getter method for property <tt>mortgageType</tt>.
     * 
     * @return property value of mortgageType
     */
    public String getMortgageType() {
        return mortgageType;
    }

    /**
     * Setter method for property <tt>mortgageType</tt>.
     * 
     * @param mortgageType value to be assigned to property mortgageType
     */
    public void setMortgageType(String mortgageType) {
        this.mortgageType = mortgageType;
    }

}
