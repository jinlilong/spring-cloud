/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.constant.RedisKeyConstants;
import org.loan.core.common.constant.SpCodeKeyConstants;
import org.loan.core.common.enums.BorrowCatEnums;
import org.loan.core.common.enums.ContractTypeEnums;
import org.loan.core.common.enums.RateTypeEnums;
import org.loan.core.common.enums.RepaymentMethodEnums;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.model.req.RepaymentCalculationReq;
import org.loan.core.common.utils.RateUtils;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.dao.ClMortgageDao;
import org.loan.core.dao.ClUserDao;
import org.loan.core.dao.ClWContactsDao;
import org.loan.core.dao.SpCodeDao;
import org.loan.core.dao.SpCreditDao;
import org.loan.core.dao.SpCreditPeriodsDao;
import org.loan.core.domain.ClMortgageEntity;
import org.loan.core.domain.ClUserEntity;
import org.loan.core.domain.ClWContactsEntity;
import org.loan.core.domain.SpCodeEntity;
import org.loan.core.domain.SpCreditEntity;
import org.loan.core.domain.SpCreditPeriodsEntity;
import org.loan.core.service.RedisService;
import org.loan.core.service.SpCreditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * 
 * @author jinlilong
 * @version $Id: SpCreditServiceImpl.java, v 0.1 2018年4月2日 上午11:05:38 jinlilong Exp $
 */
@Service("spCreditService")
public class SpCreditServiceImpl implements SpCreditService {

    /**  */
    private static final Logger logger       = LoggerFactory.getLogger(SpCreditServiceImpl.class);

    /**  默认利率*/
    private static final String DEFAULT_RATE = "0.05";

    /**  */
    @Autowired
    private SpCreditDao         spCreditDao;

    /**  */
    @Autowired
    private SpCreditPeriodsDao  spCreditPeriodsDao;

    /**  */
    @Autowired
    private ClWContactsDao      clWContactsDao;

    /**  */
    @Autowired
    private ClUserDao           clUserDao;

    /**  */
    @Autowired
    private SpCodeDao           spCodeDao;

    /**  */
    @Autowired
    private ClMortgageDao       clMortgageDao;

    /**  */
    @Autowired
    private RedisService        redisService;

    /** 
     * @see com.hwc.framework.modules.service.SpCreditService#getUserRate(long)
     */
    @Override
    public BigDecimal getUserRate(long clUserId) {
        ClUserEntity clUserEntity = clUserDao.queryObject(clUserId);
        if (clUserEntity == null) {
            throw new ServiceException("查询用户不存在");
        }
        BigDecimal rate = null;
        SpCreditEntity spCreditEntity = querySpCreditByClUserId(clUserId);
        if (spCreditEntity != null) {
            //日利率
            if (spCreditEntity.getRate() != null && spCreditEntity.getRate().doubleValue() > 0) {
                rate = spCreditEntity.getRate();
            } else if (spCreditEntity.getMonthRate() != null
                       && spCreditEntity.getMonthRate().doubleValue() > 0) {
                rate = RateUtils.convertRateFromMonthToDay(spCreditEntity.getMonthRate());
            }
            return rate;
        }
        ClWContactsEntity clWContactsEntity = clWContactsDao
            .queryByPhone(clUserEntity.getLoginName());
        if (clWContactsEntity != null) {
            return clWContactsEntity.getBorrowRate();
        }
        return new BigDecimal(DEFAULT_RATE);
    }

    /** 
     * @see com.hwc.framework.modules.service.SpCreditService#getRate(java.lang.Long)
     */
    @Override
    public void getRate(Long clUserId, RepaymentCalculationReq req) {
        SpCreditEntity spCreditEntity = querySpCreditByClUserId(clUserId);
        if (spCreditEntity != null && spCreditEntity.getMonthRate() != null
            && spCreditEntity.getMonthRate().doubleValue() > 0) {
            req.setRateType(RateTypeEnums.MONTH_RATE.getCode());
            req.setRate(String.valueOf(spCreditEntity.getMonthRate()));
        } else {
            req.setRateType(RateTypeEnums.DAY_RATE.getCode());
            if (spCreditEntity != null) {
                req.setRate(String.valueOf(spCreditEntity.getRate()));
            } else {
                ClUserEntity clUserEntity = clUserDao.queryObject(clUserId);
                if (clUserEntity == null) {
                    throw new ServiceException("查询用户不存在");
                }
                ClWContactsEntity clWContactsEntity = clWContactsDao
                    .queryByPhone(clUserEntity.getLoginName());
                if (clWContactsEntity != null) {
                    req.setRate(String.valueOf(clWContactsEntity.getBorrowRate()));
                }
            }
        }
    }

    /** 
     * @see com.hwc.framework.modules.service.SpCreditService#queryUserContractDate(java.lang.Long)
     */
    @Override
    public Date queryUserContractDate(Long clUserId) {
        //走审批系统直接查询表sp_credit 的
        ClMortgageEntity clMortgageEntity = clMortgageDao.queryByUserId(clUserId);
        if (clMortgageEntity != null) {
            return clMortgageEntity.getExpireDate();
        } else {
            logger.warn("查询用户车位信息表不存在,userId=" + clUserId);
            throw new ServiceException("系统异常，查询用户数据不存在");
        }

    }

    /** 
     * @see com.hwc.framework.modules.service.SpCreditService#queryCreditPeriodsList(java.lang.Long)
     */
    @Override
    public List<SpCreditPeriodsEntity> queryCreditPeriodsList(Long creditId) {
        Map<String, Object> map = new HashMap<>();
        map.put("creditId", creditId);
        //走审批系统的用户  有分期配置信息，老用户没有这些数据。需要兼容
        List<SpCreditPeriodsEntity> list = spCreditPeriodsDao.queryCreditPeriodsList(map);
        Collections.sort(list, new Comparator<SpCreditPeriodsEntity>() {

            @Override
            public int compare(SpCreditPeriodsEntity o1, SpCreditPeriodsEntity o2) {
                if (Integer.valueOf(o1.getPeriods()) > Integer.valueOf(o2.getPeriods())) {
                    return 1;
                } else {
                    return -1;
                }
            }

        });
        return list;
    }

    /** 
     * @see com.hwc.framework.modules.service.SpCreditService#queryCreditPeriodsListByUserId(java.lang.Long)
     */
    @Override
    public List<SpCreditPeriodsEntity> queryCreditPeriodsListByUserId(Long clUserId) {
        SpCreditEntity spCreditEntity = querySpCreditByClUserId(clUserId);
        List<SpCreditPeriodsEntity> periodsList = null;
        if (spCreditEntity != null) {
            periodsList = queryCreditPeriodsList(spCreditEntity.getId());
        }

        if (CollectionUtils.isEmpty(periodsList)) {
            periodsList = new ArrayList<>();
            //等额本金分期查询
            buildSpCreditPeriodsList(periodsList,
                spCodeDao.queryCodeListByParentCode(SpCodeKeyConstants.PERIODS_DEBJ_LIST),
                RepaymentMethodEnums.AVERAGE_CAPITAL);
            //等额本息查询
            buildSpCreditPeriodsList(periodsList,
                spCodeDao.queryCodeListByParentCode(SpCodeKeyConstants.PERIODS_DEBX_LIST),
                RepaymentMethodEnums.AVERAGE_CAPITAL_PLUS_INTEREST);
            //先息后本
            buildSpCreditPeriodsList(periodsList,
                spCodeDao.queryCodeListByParentCode(SpCodeKeyConstants.PERIODS_XXHB_LIST),
                RepaymentMethodEnums.AFTER_THE_FIRST_REST);
            //等本等息
            /*buildSpCreditPeriodsList(periodsList,
                spCodeDao.queryCodeListByParentCode(SpCodeKeyConstants.PERIODS_DBDX_LIST),
                RepaymentMethodEnums.EQUAL_INTEREST_AND_INTEREST);*/
        }

        return periodsList;
    }

    /**
     * 
     * @param list
     * @param codeList
     */
    private void buildSpCreditPeriodsList(List<SpCreditPeriodsEntity> list,
                                          List<SpCodeEntity> codeList, RepaymentMethodEnums enums) {
        for (SpCodeEntity spCodeEntity : codeList) {
            SpCreditPeriodsEntity spCreditPeriodsEntity = new SpCreditPeriodsEntity();
            spCreditPeriodsEntity.setPeriods(spCodeEntity.getValue());
            spCreditPeriodsEntity.setRepayment(enums.getCode());
            list.add(spCreditPeriodsEntity);
        }
    }

    /** 
     * @see com.hwc.framework.modules.service.SpCreditService#querySpCreditByClUserId(java.lang.Long)
     */
    @Override
    public SpCreditEntity querySpCreditByClUserId(Long clUserId) {
        String key = RedisKeyConstants.SP_CREDIT_ENTITY_CACHE + clUserId;
        SpCreditEntity credit = redisService.get(key, SpCreditEntity.class);
        if (credit == null) {
            credit = spCreditDao.querySpCreditByClUserId(clUserId);
            if (credit != null) {
                redisService.set(key, credit);
            }
        }
        return credit;
    }

    /** 
     * @see com.hwc.framework.modules.service.SpCreditService#querySpCreditByPhone(java.lang.String)
     */
    @Override
    public SpCreditEntity querySpCreditByPhone(String phone) {
        return spCreditDao.querySpCreditByPhone(phone);
    }

    /** 
     * @see com.hwc.framework.modules.service.SpCreditService#getContractType(java.lang.Long)
     */
    @Override
    public String getContractType(Long clUserId) {
        SpCreditEntity spCreditEntity = querySpCreditByClUserId(clUserId);
        if (spCreditEntity == null) {
            return ContractTypeEnums.CREDIT_DY_NO_CREDENTIALS.getCode();
        }
        BorrowCatEnums catEnums = BorrowCatEnums
            .queryByMortgageType(spCreditEntity.getMortgageType());

        //若是有证车位
        if (catEnums == BorrowCatEnums.MORTGAGE
            && StringUtils.equals(spCreditEntity.getIsCredentials(), BaseBizConstants.ONE)) {
            return ContractTypeEnums.CREDIT_DY_NO_CREDENTIALS.getCode();
        }

        //若是抵押无证
        if (catEnums == BorrowCatEnums.MORTGAGE
            && StringUtils.equals(spCreditEntity.getIsCredentials(), BaseBizConstants.ZERO)) {
            //单笔
            if (StringUtils.equals(spCreditEntity.getSingleLoan(), BaseBizConstants.ZERO)) {
                return ContractTypeEnums.CREDIT_DY_NO_CREDENTIALS_SINGLE.getCode();
            }
            //额度
            else if (StringUtils.equals(spCreditEntity.getSingleLoan(), BaseBizConstants.ONE)) {
                return ContractTypeEnums.CREDIT_DY_NO_CREDENTIALS.getCode();
            }
            logger.warn("抵押类合同,是否单笔借款参数错误======={}", spCreditEntity.getSingleLoan());
            throw new ServiceException("不支持合同类型，请联系我们的业务人员");
        } else if (catEnums == BorrowCatEnums.MORTGAGE_TYPE_FW
                   || catEnums == BorrowCatEnums.MORTGAGE_TYPE_JY) {
            return ContractTypeEnums.CREDIT_UNDERLINE_XY.getCode();
        } else if (catEnums == BorrowCatEnums.MORTGAGE_TYPE_ONLINE_CREDIT) {
            return ContractTypeEnums.CREDIT_ONLINE_XY.getCode();
        } else {
            throw new ServiceException("不支持线上签署合同，请联系我们的业务人员");
        }

    }

}
