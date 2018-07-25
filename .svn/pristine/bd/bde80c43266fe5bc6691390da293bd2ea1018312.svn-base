package org.loan.core.common.utils;

import java.math.BigDecimal;

import org.loan.core.common.exception.ServiceException;

/**
 * Created by   on 2017/11/29.
 */
public class RateUtils {
    /**
     * 计算日利率  万分之5
     *
     * @param rate
     * @return
     */
    public static Double getRate(Double rate) {

        return FsUtils.divideScale2(new BigDecimal(rate), new BigDecimal(100)).doubleValue();
    }

    /**
     * 获取新的利率
     * @param rate
     * @return
     */
    public static BigDecimal getRate(String rate) {
        return new BigDecimal(rate).divide(new BigDecimal(100));
    }

    /**
     * 将月利率转化为日利率
     * @param rate
     * @return
     */
    public static BigDecimal convertRateFromMonthToDay(BigDecimal rate) {
        if (rate == null) {
            throw new ServiceException("利率不能为空");
        }

        return rate.multiply(new BigDecimal(12)).divide(new BigDecimal(365), 4,
            BigDecimal.ROUND_UP);
    }

    /**
     * 获取年利率
     * @param rate
     * @return
     */
    public static BigDecimal getYearRate(String rate) {
        return new BigDecimal(rate).divide(new BigDecimal(100)).multiply(new BigDecimal(365));
    }

    /**
     * 获取月利率
     * @param rate
     * @return
     */
    public static BigDecimal getMonthRate(String rate) {
        return new BigDecimal(rate).divide(new BigDecimal(100)).multiply(new BigDecimal(365))
            .divide(new BigDecimal(12), 10, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 获取利率百分比  0.05%
     * @param rate
     * @return
     */
    public static String getRateDesc(String rate) {
        return rate + "%";
    }

    /**
     * 利率*100
     * @param value
     * @return
     */
    public static String getRateString(BigDecimal value) {
        if (value != null) {
            return StringUtils.subZeroAndDot(value.multiply(new BigDecimal(100)).toString());
        }
        return null;
    }
}
