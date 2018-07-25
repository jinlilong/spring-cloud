package org.loan.core.common.enums;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author liuzx
 * @desc 同盾接入场景
 * @create 2018-06-14 18:30
 */
public enum EnumTongdunEventType {

    EVENT_TYPE_OF_REGISTER("注册", "register", 10),

    EVENT_TYPE_OF_LOGIN("登录", "login", 20),

    EVENT_TYPE_OF_BINDING("绑卡", "binding", 30),

    EVENT_TYPE_OF_LOAN("借款", "loan", 40);

    private String  desc;
    private String  name;
    private Integer index;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    EnumTongdunEventType(String desc, String name, Integer index) {
        this.desc = desc;
        this.name = name;
        this.index = index;
    }

    public static EnumTongdunEventType getName(int index) {
        return Arrays.stream(EnumTongdunEventType.values())
            .filter(enumPaymentType -> enumPaymentType.getIndex() == index).findFirst()
            .orElse(null);
    }

    /**
     * 根据枚举名称得到枚举对象
     *
     * @param name
     * @return
     */
    public static EnumTongdunEventType getEnumObject(String name) {
        return Arrays.stream(EnumTongdunEventType.values())
            .filter(enumPaymentType -> StringUtils.equals(name, enumPaymentType.getName()))
            .findFirst().orElse(null);
    }

}
