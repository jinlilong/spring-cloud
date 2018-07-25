package org.loan.core.common.enums;

/**
 * @author xlk
 * on 2018/7/20 0020.
 */
public enum UserAuthTypeEnums {

    /**  实名认证*/
    ID("id", "实名认证"),

    /**  真实信息*/
    BASE_INFO("baseInfo", "真实信息"),

    /**  运营商*/
    PHONE("phone", "运营商"),

    CREDIT("credit","征信"),

    PARK("park ","车位"),

    SECURITY("security","社保"),

    ACCUMULATION("accumulation","公积金"),

    HOME("home","房产证");

    UserAuthTypeEnums(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     *
     * @param code
     * @return
     */
    public static UserAuthTypeEnums queryByCode(String code) {
        for (UserAuthTypeEnums enums : UserAuthTypeEnums.values()) {
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
