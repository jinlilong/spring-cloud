package org.loan.core.common.enums;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author liuzx
 * @desc
 * @create 2018-04-28 11:24
 */
public enum EnumRefundPattern {

    REPAY_BY_WITHHOLD("代扣", 10),
    REPAY_BY_BANKCARD("银行卡转账", 20),
    REPAY_BY_ALIPAY("支付宝转账", 30),
    REPAY_BY_OFFLINE("线下还款", 40);

    private String name;
    private Integer index;

    public String getName() {
        return name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    EnumRefundPattern(String name, Integer index) {
        this.name = name;
        this.index = index;
    }


    public static EnumRefundPattern getName(int index) {
        return Arrays.stream(EnumRefundPattern.values())
                .filter(enumPaymentType -> enumPaymentType.getIndex() == index)
                .findFirst()
                .orElse(null);
    }

    /**
     * 根据枚举名称得到枚举对象
     *
     * @param name
     * @return
     */
    public static EnumRefundPattern getEnumObject(String name) {
        return Arrays.stream(EnumRefundPattern.values())
                .filter(enumPaymentType -> StringUtils.equals(name, enumPaymentType.getName()))
                .findFirst()
                .orElse(null);
    }


}
