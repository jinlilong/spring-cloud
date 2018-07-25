package org.loan.core.service;

/**
 * Copyright (c) 2018 All Rights Reserved.
 */

import java.math.BigDecimal;

import org.loan.core.domain.ArcCreditEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: ArcCreditCoreService.java, v 0.1 2018年5月17日 下午3:03:35 jinlilong Exp $
 */
public interface ArcCreditCoreService {

    /**
     * 扣除额度和恢复额度
     * @param userId
     * @param amount
     */
    public void subtractQuota(Long userId, BigDecimal amount);

    /**
     * 判断用户的额度是否够用
     * @param userId
     * @param amount
     * @return
     */
    public void isQuota(Long userId, BigDecimal amount);

    /**
     * 恢复用户的额度
     * @param userId
     * @param amount
     */
    public void recoveryUserQuotaByRepayId(Long userId, Long repayId);

    /**
     * 恢复用户的额度
     * @param userId
     * @param amount
     */
    public void recoveryUserQuotaByBorrowId(Long userId, Long borrowId);

    /**
     * 查询用户额度
     * @param userId
     */
    public ArcCreditEntity queryByUserId(Long userId);

}
