/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.enums;

/**
 * 
 * @author jinlilong
 * @version $Id: RepaymentMethodEnums.java, v 0.1 2018年3月6日 下午2:03:41 jinlilong Exp $
 */
public enum EnvironmentEnums {

    PRODUCT("product", "生产环境"),

    DEV("dev", "开发环境"),

    TEST("test", "测试环境");

    EnvironmentEnums(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * 
     * @param code
     * @return
     */
    public static EnvironmentEnums queryByCode(String code) {
        for (EnvironmentEnums enums : EnvironmentEnums.values()) {
            if (enums.getCode().equals(code)) {
                return enums;
            }
        }
        return null;
    }

    /**  */
    private String desc;

    /**  */
    private String code;

    /**
     * Getter method for property <tt>desc</tt>.
     * 
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     * 
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

}
