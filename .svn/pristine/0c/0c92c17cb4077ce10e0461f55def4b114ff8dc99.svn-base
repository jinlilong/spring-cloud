package org.loan.core.common.enums;

/**
 * @author xlk
 * on 2018/7/20 0020.
 */
public enum UserAuthStateEnums {

    /**
     * 未认证
     * */
    BEFORE("10","未认证"),

    DURING("20","认证中"),

    AFTER("30","已认证");

    UserAuthStateEnums(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     *
     * @param code
     * @return
     */
    public static UserAuthStateEnums queryByCode(String code) {
        for (UserAuthStateEnums enums : UserAuthStateEnums.values()) {
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
