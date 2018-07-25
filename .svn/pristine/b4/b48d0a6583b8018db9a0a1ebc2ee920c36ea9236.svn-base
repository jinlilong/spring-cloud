/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.utils;

import java.math.BigDecimal;

/**
 * 
 * @author jinlilong
 * @version $Id: CentUtils.java, v 0.1 2018年5月15日 上午10:02:02 jinlilong Exp $
 */
public class CentUtils {

    /**
     * 将金额转换为分返回
     * @param amount
     * @return
     */
    public static final String convertToCent(BigDecimal amount) {
        if (amount == null) {
            return null;
        }
        BigDecimal money = FsUtils.roundDecimal(amount, 2);
        money = money.multiply(new BigDecimal(100));
        return StringUtils.subZeroAndDot(String.valueOf(money));
    }
}
