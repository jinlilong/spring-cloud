package org.loan.core.common.enums;

/**
 * @author xlk
 * on 2018/4/25 0025.
 */
public enum ContractTypeEnums {

    /**  */
    CREDIT_DY_NO_CREDENTIALS("0", "抵押无证"),

    /**  */
    CREDIT_UNDERLINE_XY("1", "线下信用,精英贷和房屋贷"),

    /**  */
    CREDIT_ONLINE_XY("2", "线上信用"),

    /**  */
    CREDIT_DY_NO_CREDENTIALS_SINGLE("3", "车位抵押,无证,单笔");

    ContractTypeEnums(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * 
     * @param code
     * @return
     */
    public static ContractTypeEnums queryByCode(String code) {
        for (ContractTypeEnums enums : ContractTypeEnums.values()) {
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
