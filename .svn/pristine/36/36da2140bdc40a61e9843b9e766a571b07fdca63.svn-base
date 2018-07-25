package org.loan.core.common.enums;

/**
 * Copyright (c) 2018 All Rights Reserved.
 */

/**
 * 
 * @author jinlilong
 * @version $Id: RepaymentMethodEnums.java, v 0.1 2018年3月6日 下午2:03:41 jinlilong Exp $
 */
public enum BorrowCatEnums {

    //mortgageType对应 sp_credit MORTGAGE_TYPE
    // code 对应cl_user cat

    /**  等额本金还款方式*/
    CREDIT("10", "信用类", ""),

    /**  等额本息*/
    MORTGAGE("20", "抵押类", "0"),

    /**  */
    MORTGAGE_TYPE_JY("30", "精英贷", "2"),

    /**  */
    MORTGAGE_TYPE_FW("40", "房屋贷", "1"),

    /**  */
    MORTGAGE_TYPE_ONLINE_CREDIT("50", "线上信用", "3"),

    /**  新车位*/
    MORTGAGE_TYPE_XCW("50", "新车位", "4");

    BorrowCatEnums(String code, String desc, String mortgageType) {
        this.desc = desc;
        this.code = code;
        this.mortgageType = mortgageType;
    }

    /**
     * 
     * @param code
     * @return
     */
    public static BorrowCatEnums queryByCode(String code) {
        for (BorrowCatEnums enums : BorrowCatEnums.values()) {
            if (enums.getCode().equals(code)) {
                return enums;
            }
        }
        return null;
    }

    /**
     * 
     * @param mortgageType
     * @return
     */
    public static BorrowCatEnums queryByMortgageType(String mortgageType) {
        for (BorrowCatEnums enums : BorrowCatEnums.values()) {
            if (enums.getMortgageType().equals(mortgageType)) {
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
    private String mortgageType;

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
