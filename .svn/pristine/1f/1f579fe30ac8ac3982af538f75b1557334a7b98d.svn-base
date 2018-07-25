/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.enums;

/**
 * 
 * @author jinlilong
 * @version $Id: RepaymentMethodEnums.java, v 0.1 2018年3月6日 下午2:03:41 jinlilong Exp $
 */
public enum PayChannelMethodEnums {

    /**  */
    PRE_BIND("pre_bind", "预绑卡"),

    /** */
    CONFIRM_BIND("confirm_bind", "确认绑卡"),

    /**  */
    PRE_REPAYMENT("pre_repayment", "预支付"),

    /**  */
    REPAYMENT("repayment", "确认支付"),;

    PayChannelMethodEnums(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * 
     * @param code
     * @return
     */
    public static PayChannelMethodEnums queryByCode(String code) {
        for (PayChannelMethodEnums enums : PayChannelMethodEnums.values()) {
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
