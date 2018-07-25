/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.utils;

import java.math.BigDecimal;

/**
 * 
 * @author jinlilong
 * @version $Id: NumberCalculationUtils.java, v 0.1 2018年7月19日 下午12:54:36 jinlilong Exp $
 */
public class FsUtils {

    /**
     * 四舍五入 并且保留2位小数
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal divideScale2(BigDecimal b1, BigDecimal b2) {
        return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 进一位 并且保留2位小数
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal divideScale2Up(BigDecimal b1, BigDecimal b2) {
        return b1.divide(b2, 2, BigDecimal.ROUND_UP);
    }

    /**
     * 
     * @param b1
     * @param digit
     * @return
     */
    public static BigDecimal roundDecimal(BigDecimal b1, int digit) {
        return b1.setScale(digit, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal mulDecimal(BigDecimal b1, BigDecimal b2) {
        return b1.multiply(b2);
    }

    /**
     * 
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal subDecimal(BigDecimal b1, BigDecimal b2) {
        return b1.subtract(b2);
    }

    /**
     * 
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal addDecimal(BigDecimal b1, BigDecimal b2) {
        return b1.add(b2);
    }

    /**
     * 随机生成n位数字
     * @param digit
     * @return
     */
    public static String randomNumeric(int digit) {
        String rval = "";
        for (int i = 0; i < digit; i++) {
            rval += (int) (10 * (Math.random()));
        }
        return rval;
    }

    public static void main(String[] args) {
        System.out.println(randomNumeric(4));
    }

}
