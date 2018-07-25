/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.constant.BorrowStateConstant;
import org.loan.core.common.enums.BorrowCatEnums;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.dao.ArcCreditDao;
import org.loan.core.domain.ArcCreditEntity;
import org.loan.core.domain.ClBorrowEntity;
import org.loan.core.domain.ClBorrowRepayEntity;
import org.loan.core.domain.ClUserEntity;
import org.loan.core.domain.SpCreditEntity;
import org.loan.core.service.ArcCreditCoreService;
import org.loan.core.service.BorrowCoreService;
import org.loan.core.service.ClUserCoreService;
import org.loan.core.service.SpCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: ArcCreditCoreService.java, v 0.1 2018年5月17日 下午3:03:35 jinlilong Exp $
 */
@Service("arcCreditCoreService")
public class ArcCreditCoreServiceImpl implements ArcCreditCoreService {

    /**  */
    @Autowired
    private ArcCreditDao      arcCreditDao;
    /**  */
    @Autowired
    private SpCreditService   spCreditService;

    /**  */
    @Autowired
    private ClUserCoreService clUserCoreService;

    @Autowired
    private BorrowCoreService borrowCoreService;

    /** 
     * @see com.hwc.framework.modules.service.ArcCreditCoreService#subtractQuota(java.lang.Long, java.math.BigDecimal)
     */
    @Override
    public void subtractQuota(Long userId, BigDecimal amount) {

        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("amount", amount);
        arcCreditDao.subtractQuota(map);
    }

    /** 
     * @see com.hwc.framework.modules.service.ArcCreditCoreService#isQuota(java.lang.Long, java.math.BigDecimal)
     */
    @Override
    public void isQuota(Long userId, BigDecimal amount) {

        ArcCreditEntity arcCreditEntity = arcCreditDao.queryCreditByUserId(userId);
        if (amount.doubleValue() > arcCreditEntity.getUnuse().doubleValue()) {
            throw new ServiceException("对不起，您的额度不够，无法借款");
        }
    }

    /** 
     * @see com.hwc.framework.modules.service.ArcCreditCoreService#recoveryUserQuotaByRepayId(java.lang.Long, java.math.BigDecimal)
     */
    @Override
    public void recoveryUserQuotaByRepayId(Long userId, Long repayId) {
        //若是走审批且是单笔类用户，不需要恢复额度
        SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(userId);
        ClBorrowRepayEntity clBorrowRepayEntity = borrowCoreService.queryByRepayId(repayId);
        ClBorrowEntity clBorrowEntity = borrowCoreService
            .queryById(clBorrowRepayEntity.getBorrowId());
        int hasRepayCount = borrowCoreService.countHasRepay(clBorrowRepayEntity.getBorrowId());
        //判断是否需要更新borrorRepay
        if (hasRepayCount + 1 == clBorrowEntity.getPeriods().intValue()) {
            ClBorrowEntity clBorrowEntityUpdate = new ClBorrowEntity();
            clBorrowEntityUpdate.setId(clBorrowEntity.getId());
            clBorrowEntityUpdate.setRemark("还款成功");
            clBorrowEntityUpdate.setState(BorrowStateConstant.STATE_FINISH);
            borrowCoreService.updateBorrow(clBorrowEntityUpdate);
        }
        if (spCreditEntity != null
            && StringUtils.equals(spCreditEntity.getSingleLoan(), BaseBizConstants.ZERO)) {
            return;
        }
        BigDecimal amount = null;
        //若不是车位抵押类需要换完所有才恢复额度
        if (spCreditEntity != null && !StringUtils.equals(spCreditEntity.getMortgageType(),
            BorrowCatEnums.MORTGAGE.getMortgageType())) {
            //若未还完不恢复额度
            if (hasRepayCount + 1 < clBorrowEntity.getPeriods().intValue()) {
                return;
            } else {
                amount = clBorrowEntity.getRealAmount();
            }
        } else {
            //若期数全部还清
            if (hasRepayCount + 1 == clBorrowEntity.getPeriods().intValue()) {
                //全部还完，计算恢复额度用总本金-已还本金。防止因为除不尽导致恢复额度有小数点
                amount = clBorrowEntity.getRealAmount()
                    .subtract(borrowCoreService.sumHasRepayRealAmount(clBorrowEntity.getId()));
            } else {
                amount = clBorrowRepayEntity.getRealAmount();
            }
        }
        //对老数据兼容，  若是以前的信用类需要还完才恢复额度
        ClUserEntity clUserEntity = clUserCoreService.queryClUser(userId);
        if (StringUtils.equals(clUserEntity.getCat(), BorrowCatEnums.CREDIT.getCode())) {
            //若未还完
            if (hasRepayCount + 1 < clBorrowEntity.getPeriods().intValue()) {
                return;
            } else {
                amount = clBorrowEntity.getRealAmount();
            }
        }
        subtractQuota(userId, new BigDecimal(0).subtract(amount));
    }

    /** 
     * @see com.hwc.framework.modules.service.ArcCreditCoreService#recoveryUserQuotaByBorrowId(java.lang.Long, java.lang.Long)
     */
    @Override
    public void recoveryUserQuotaByBorrowId(Long userId, Long borrowId) {

        ClBorrowEntity clBorrowEntity = borrowCoreService.queryById(borrowId);

        //更新borrow状态
        ClBorrowEntity clBorrowEntityUpdate = new ClBorrowEntity();
        clBorrowEntityUpdate.setId(clBorrowEntity.getId());
        clBorrowEntityUpdate.setState(BorrowStateConstant.STATE_FINISH);
        clBorrowEntityUpdate.setRemark("还款成功");
        borrowCoreService.updateBorrow(clBorrowEntityUpdate);

        //若是走审批且是单笔类用户，不需要恢复额度
        SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(userId);
        if (spCreditEntity != null
            && StringUtils.equals(spCreditEntity.getSingleLoan(), BaseBizConstants.ZERO)) {
            return;
        }
        BigDecimal realAmount = null;
        //若是非车位抵押类   提前还款，恢复额度为全部额度
        if (spCreditEntity != null && !StringUtils.equals(spCreditEntity.getMortgageType(),
            BorrowCatEnums.MORTGAGE.getMortgageType())) {
            realAmount = clBorrowEntity.getRealAmount();
        }
        ClUserEntity clUserEntity = clUserCoreService.queryClUser(userId);
        //若是信用类提前还款
        if (StringUtils.equals(clUserEntity.getCat(), BorrowCatEnums.CREDIT.getCode())) {
            realAmount = clBorrowEntity.getRealAmount();
        }
        //非以上情况，即车位抵押，获取未还款本金总和
        if (realAmount == null) {
            realAmount = clBorrowEntity.getRealAmount()
                .subtract(borrowCoreService.sumHasRepayRealAmount(borrowId));
        }
        //恢复额度
        subtractQuota(userId, new BigDecimal(0).subtract(realAmount));

    }

    /** 
     * @see com.hwc.framework.modules.service.ArcCreditCoreService#queryByUserId(java.lang.Long)
     */
    @Override
    public ArcCreditEntity queryByUserId(Long userId) {
        return arcCreditDao.queryCreditByUserId(userId);
    }

}
