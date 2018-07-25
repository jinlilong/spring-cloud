package org.loan.core.common.enums;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author liuzx
 * @desc 同盾风险扫描结果
 * @create 2018-06-21 13:59
 */
public enum EnumTongdunRiskDesc {

    RISK_ACCEPT("Accept", "建议通过"),
    RISK_REVIEW("Review", "建议审核"),
    RISK_REJECT("Reject", "建议拒绝");

    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    EnumTongdunRiskDesc(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * 根据枚举名称得到枚举对象
     *
     * @param name
     * @return
     */
    public static EnumTongdunRiskDesc getEnumObject(String name) {
        return Arrays.stream(EnumTongdunRiskDesc.values())
                     .filter(e -> StringUtils.equals(name, e.getName()))
                     .findFirst()
                     .orElse(null);
    }

}
