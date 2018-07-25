/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.enums;

/**
 * 
 * @author jinlilong
 * @version $Id: RepaymentMethodEnums.java, v 0.1 2018年3月6日 下午2:03:41 jinlilong Exp $
 */
public enum RepaymentMethodEnums {

    /**  等额本金还款方式*/
    AVERAGE_CAPITAL("0", "等额本金", "等额本金"),

    /**  等额本息*/
    AVERAGE_CAPITAL_PLUS_INTEREST("1", "等额本息", "等额本息"),

    /**  等本等息*/
    EQUAL_INTEREST_AND_INTEREST("3", "等本等息", "等本等息"),

    /**  先息后本*/
    AFTER_THE_FIRST_REST("2", "先息后本", "分期还息、到期还本");

    RepaymentMethodEnums(String code, String desc, String mark) {
        this.desc = desc;
        this.code = code;
        this.mark = mark;
    }

    /**
     * 
     * @param code
     * @return
     */
    public static RepaymentMethodEnums queryByCode(String code) {
        for (RepaymentMethodEnums enums : RepaymentMethodEnums.values()) {
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

    /**  */
    private String mark;

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

    /**
     * Getter method for property <tt>mark</tt>.
     * 
     * @return property value of mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * Setter method for property <tt>mark</tt>.
     * 
     * @param mark value to be assigned to property mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

}
