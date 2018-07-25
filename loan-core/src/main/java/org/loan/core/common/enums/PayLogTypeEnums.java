/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.enums;

/**
 * 
 * @author jinlilong
 * @version $Id: RepaymentMethodEnums.java, v 0.1 2018年3月6日 下午2:03:41 jinlilong Exp $
 */
public enum PayLogTypeEnums {

    /**  */
    DF_ONLINE("10", "代付"),

    /**  */
    DQ_ONLINE("20", "代扣"),

    /**  */
    DF_UNDERLINE("30", "线下代付"),

    /**  */
    DQ_UNDERLINE("40", "线下代扣");

    PayLogTypeEnums(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * 
     * @param code
     * @return
     */
    public static PayLogTypeEnums queryByCode(String code) {
        for (PayLogTypeEnums enums : PayLogTypeEnums.values()) {
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
