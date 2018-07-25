package org.loan.core.common.utils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2018 All Rights Reserved.

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jinlilong
 * @version $Id: AverageCapitalPlusInterestUtils.java, v 0.1 2018年3月6日 下午4:27:56 jinlilong Exp $
 */
public class AverageCapitalPlusInterestUtils {
    /**  
     * 等额本息计算获取还款方式为等额本息的每月偿还本金和利息  
     *   
     * 公式：每月偿还本息=〔贷款本金×月利率×(1＋月利率)＾还款月数〕÷〔(1＋月利率)＾还款月数-1〕  
     *   
     * @param invest  
     *            总借款额（贷款本金）  
     * @param yearRate  
     *            年利率  
     * @param month  
     *            还款总月数  
     * @return 每月偿还本金和利息,不四舍五入，直接截取小数点最后两位  
     */
    public static double getPerMonthPrincipalInterest(double invest, double yearRate,
                                                      int totalmonth) {
        double monthRate = yearRate / 12;
        BigDecimal monthIncome = new BigDecimal(invest)
            .multiply(new BigDecimal(monthRate * Math.pow(1 + monthRate, totalmonth))).divide(
                new BigDecimal(Math.pow(1 + monthRate, totalmonth) - 1), 2, BigDecimal.ROUND_DOWN);
        return monthIncome.doubleValue();
    }

    /**  
     * 等额本息计算获取还款方式为等额本息的每月偿还利息  
     *   
     * 公式：每月偿还利息=贷款本金×月利率×〔(1+月利率)^还款月数-(1+月利率)^(还款月序号-1)〕÷〔(1+月利率)^还款月数-1〕  
     * @param invest  
     *            总借款额（贷款本金）  
     * @param yearRate  
     *            年利率  
     * @param month  
     *            还款总月数  
     * @return 每月偿还利息  
     */
    public static Map<Integer, BigDecimal> getPerMonthInterest(double invest, double yearRate,
                                                               int totalmonth) {
        Map<Integer, BigDecimal> map = new HashMap<Integer, BigDecimal>();
        double monthRate = yearRate / 12;
        BigDecimal monthInterest;
        for (int i = 1; i < totalmonth + 1; i++) {
            BigDecimal multiply = new BigDecimal(invest).multiply(new BigDecimal(monthRate));
            BigDecimal sub = new BigDecimal(Math.pow(1 + monthRate, totalmonth))
                .subtract(new BigDecimal(Math.pow(1 + monthRate, i - 1)));
            monthInterest = multiply.multiply(sub).divide(
                new BigDecimal(Math.pow(1 + monthRate, totalmonth) - 1), 6, BigDecimal.ROUND_DOWN);
            monthInterest = monthInterest.setScale(2, BigDecimal.ROUND_DOWN);
            map.put(i, monthInterest);
        }
        return map;
    }

    /**  
     * 等额本息计算获取还款方式为等额本息的每月偿还本金  
     *   
     * @param invest  
     *            总借款额（贷款本金）  
     * @param yearRate  
     *            年利率  
     * @param month  
     *            还款总月数  
     * @return 每月偿还本金  
     */
    public static Map<Integer, BigDecimal> getPerMonthPrincipal(double invest, double yearRate,
                                                                int totalmonth) {
        double monthRate = yearRate / 12;
        BigDecimal monthIncome = new BigDecimal(invest)
            .multiply(new BigDecimal(monthRate * Math.pow(1 + monthRate, totalmonth))).divide(
                new BigDecimal(Math.pow(1 + monthRate, totalmonth) - 1), 2, BigDecimal.ROUND_DOWN);
        Map<Integer, BigDecimal> mapInterest = getPerMonthInterest(invest, yearRate, totalmonth);
        Map<Integer, BigDecimal> mapPrincipal = new HashMap<Integer, BigDecimal>();

        for (Map.Entry<Integer, BigDecimal> entry : mapInterest.entrySet()) {
            mapPrincipal.put(entry.getKey(), monthIncome.subtract(entry.getValue()));
        }
        return mapPrincipal;
    }

    /**  
     * 等额本息计算获取还款方式为等额本息的总利息  
     *   
     * @param invest  
     *            总借款额（贷款本金）  
     * @param yearRate  
     *            年利率  
     * @param month  
     *            还款总月数  
     * @return 总利息  
     */
    public static double getInterestCount(double invest, double yearRate, int totalmonth) {
        BigDecimal count = new BigDecimal(0);
        Map<Integer, BigDecimal> mapInterest = getPerMonthInterest(invest, yearRate, totalmonth);

        for (Map.Entry<Integer, BigDecimal> entry : mapInterest.entrySet()) {
            count = count.add(entry.getValue());
        }
        return count.doubleValue();
    }

    /**  
     * 应还本金总和  
     * @param invest  
     *            总借款额（贷款本金）  
     * @param yearRate  
     *            年利率  
     * @param month  
     *            还款总月数  
     * @return 应还本金总和  
     */
    public static double getPrincipalInterestCount(double invest, double yearRate, int totalmonth) {
        double monthRate = yearRate / 12;
        BigDecimal perMonthInterest = new BigDecimal(invest)
            .multiply(new BigDecimal(monthRate * Math.pow(1 + monthRate, totalmonth))).divide(
                new BigDecimal(Math.pow(1 + monthRate, totalmonth) - 1), 2, BigDecimal.ROUND_DOWN);
        BigDecimal count = perMonthInterest.multiply(new BigDecimal(totalmonth));
        count = count.setScale(2, BigDecimal.ROUND_DOWN);
        return count.doubleValue();
    }

    /**  
     * @param args  
     */
    public static void main(String[] args) {
        double invest = 20000; // 本金  
        int month = 5;
        double yearRate = 0.0002 * 365; // 年利率  
        System.out.println(yearRate);
        double perMonthPrincipalInterest = getPerMonthPrincipalInterest(invest, yearRate, month);
        System.out.println("等额本息---每月还款本息：" + perMonthPrincipalInterest);
        Map<Integer, BigDecimal> mapInterest = getPerMonthInterest(invest, yearRate, month);
        System.out.println("等额本息---每月还款利息：" + mapInterest);
        Map<Integer, BigDecimal> mapPrincipal = getPerMonthPrincipal(invest, yearRate, month);
        System.out.println("等额本息---每月还款本金：" + mapPrincipal);
        double count = getInterestCount(invest, yearRate, month);
        System.out.println("等额本息---总利息：" + count);
        double principalInterestCount = getPrincipalInterestCount(invest, yearRate, month);
        System.out.println("等额本息---应还本息总和：" + principalInterestCount);
    }
}
