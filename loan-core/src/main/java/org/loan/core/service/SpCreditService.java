/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.loan.core.common.model.req.RepaymentCalculationReq;
import org.loan.core.domain.SpCreditEntity;
import org.loan.core.domain.SpCreditPeriodsEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: SpCreditService.java, v 0.1 2018年4月2日 上午11:04:37 jinlilong Exp $
 */
public interface SpCreditService {

    /**
     * 根据userId 获取用户利率，，以后获取用户的利率统一方法
     * @param clUserId
     * @return
     */
    public BigDecimal getUserRate(long clUserId);

    /**
     * 获取用户的利率及利率类型
     * @param clUserId
     * @return
     */
    public void getRate(Long clUserId, RepaymentCalculationReq req);

    /**
     * 查询用户的合同到期时间
     * @param clUserId
     * @return
     */
    public Date queryUserContractDate(Long clUserId);

    /**
     * 根据clUserId查询  SpCreditEntity
     * @param clUserId
     * @return
     */
    public SpCreditEntity querySpCreditByClUserId(Long clUserId);

    /**
     * 根据手机号查询spcredit
     * @param phone
     * @return
     */
    public SpCreditEntity querySpCreditByPhone(String phone);

    /**
     * 根据creditId查询   用户分期配置
     * @param creditId
     * @return
     */
    public List<SpCreditPeriodsEntity> queryCreditPeriodsList(Long creditId);

    /**
     * 根据clUserId 查询用户分期
     * @param clUserId
     * @return
     */
    public List<SpCreditPeriodsEntity> queryCreditPeriodsListByUserId(Long clUserId);

    /**
     * 获取合同contractType
     * @param clUserId
     */
    public String getContractType(Long clUserId);

}
