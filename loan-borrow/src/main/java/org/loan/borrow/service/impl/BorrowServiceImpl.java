/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.service.impl;

import java.math.BigDecimal;

import org.loan.borrow.model.resp.QueryPeriedsDetailResp;
import org.loan.borrow.model.resp.QueryUserIsSingleLoanResp;
import org.loan.borrow.service.BorrowService;
import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.constant.SpConfigKeyConstants;
import org.loan.core.common.enums.BorrowCatEnums;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.domain.ArcCreditEntity;
import org.loan.core.domain.ClBankCardEntity;
import org.loan.core.domain.SpConfigEntity;
import org.loan.core.domain.SpCreditEntity;
import org.loan.core.domain.SpPayChannelConfigEntity;
import org.loan.core.service.ArcCreditCoreService;
import org.loan.core.service.BankCardCoreService;
import org.loan.core.service.BorrowCoreService;
import org.loan.core.service.ClUserCoreService;
import org.loan.core.service.SpConfigService;
import org.loan.core.service.SpCreditService;
import org.loan.core.service.SpPayChannelConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: BorrowServiceImpl.java, v 0.1 2018年7月23日 上午11:16:47 jinlilong Exp $
 */
@Service("borrowService")
public class BorrowServiceImpl implements BorrowService {

    /**  */
    @Autowired
    private SpConfigService           spConfigService;

    /**  */
    @Autowired
    private ClUserCoreService         clUserCoreService;

    /**  */
    @Autowired
    private SpCreditService           spCreditService;

    /**  */
    @Autowired
    private BorrowCoreService         borrowCoreService;

    /**  */
    @Autowired
    private BankCardCoreService       bankCardCoreService;

    /**  */
    @Autowired
    private ArcCreditCoreService      arcCreditCoreService;

    /**  */
    @Autowired
    private SpPayChannelConfigService spPayChannelConfigService;

    /** 
     * @see org.loan.borrow.service.BorrowService#QueryUserIsSingleLoan(java.lang.Long)
     */
    @Override
    public QueryUserIsSingleLoanResp queryUserIsSingleLoan(Long userId) {

        //判断当前能否借款
        spConfigService.queryIsCanBorrow();

        SpConfigEntity spConfigEntity = spConfigService
            .querySpConfigByKey(SpConfigKeyConstants.MIN_BORROW_CREDIT);

        QueryUserIsSingleLoanResp bean = new QueryUserIsSingleLoanResp();
        //设置用户的最大额度
        bean.setMaxAmount(String.valueOf(clUserCoreService.queryUserUnUseCredit(userId)));

        //若用户的可用额度小于单笔最小额度，无法借款
        if (Double.valueOf(bean.getMaxAmount()) < Double.valueOf(spConfigEntity.getValue())) {
            throw new ServiceException("单笔最低借款金额不能低于" + spConfigEntity.getValue());
        }

        //判断用户是否为线上信用用户，线上信用用户需完全还款才能借第二笔
        SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(userId);
        if (spCreditEntity != null
            && StringUtils.equals(BorrowCatEnums.MORTGAGE_TYPE_ONLINE_CREDIT.getMortgageType(),
                spCreditEntity.getMortgageType())) {
            if (borrowCoreService.queryUserUnRepay(userId) != null) {
                throw new ServiceException("您的第一笔借款还未还清，无法再次借款");
            }
        }
        //判断是否为单笔额度
        if (spCreditEntity == null
            || StringUtils.equals(spCreditEntity.getSingleLoan(), BaseBizConstants.ONE)) {
            bean.setIsfixedBorrowAmount(BaseBizConstants.ZERO);
        } else {
            bean.setIsfixedBorrowAmount(BaseBizConstants.ONE);
            ClBankCardEntity userBankCard = bankCardCoreService.queryUserBankCard(userId);
            if (userBankCard == null) {
                throw new ServiceException("未查询到用户绑卡信息，请联系管理员");
            }
            SpPayChannelConfigEntity spPayChannelConfigEntity = spPayChannelConfigService
                .queryPayChannel(userBankCard.getPayCode(), userBankCard.getBankCode());
            ArcCreditEntity arcCreditEntity = arcCreditCoreService.queryByUserId(userId);
            if (spPayChannelConfigEntity != null) {
                BigDecimal bigDecimal = spPayChannelConfigEntity.getDfSingleLimit()
                    .multiply(new BigDecimal(10000))
                    .divide(new BigDecimal(1000), 0, BigDecimal.ROUND_DOWN)
                    .multiply(new BigDecimal(1000));
                if (bigDecimal.compareTo(arcCreditEntity.getUnuse()) > 0) {
                    bean.setAmount(String.valueOf(arcCreditEntity.getUnuse()));
                } else {
                    bean.setAmount(String.valueOf(bigDecimal));
                }
            } else {
                bean.setAmount(String.valueOf(spCreditEntity.getCredit()));
            }
        }
        return bean;
    }

    /** 
     * @see org.loan.borrow.service.BorrowService#queryBorrowDetail(java.lang.Long)
     */
    @Override
    public QueryPeriedsDetailResp queryBorrowDetail(Long userId) {
        QueryPeriedsDetailResp resp = new QueryPeriedsDetailResp();

        //判断当前能否借款
        spConfigService.queryIsCanBorrow();

        //判断是否为线上信用用户，线上信用用户只能借款1笔
        SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(userId);
        if (spCreditEntity != null
            && StringUtils.equals(BorrowCatEnums.MORTGAGE_TYPE_ONLINE_CREDIT.getMortgageType(),
                spCreditEntity.getMortgageType())) {
            if (borrowCoreService.queryUserUnRepay(userId) != null) {
                throw new ServiceException("您的第一笔借款还未还清，无法再次借款");
            }
        }

        //设置单笔最小借款额度，低于这个额度不可借款
        SpConfigEntity spConfigEntity = spConfigService
            .querySpConfigByKey(SpConfigKeyConstants.MIN_BORROW_CREDIT);
        if (spConfigEntity == null) {
            throw new ServiceException("单笔最小借款额度未配置");
        }
        resp.setMinSingleBorrowCredit(spConfigEntity.getValue());

        //设置用户的最大额度
        resp.setMaxCredit(String.valueOf(clUserCoreService.queryUserUnUseCredit(userId)));

        //设置用户是否有默认借款金额  ,用户额度为单笔时，需要赋一个默认的借款额度
        if (spCreditEntity != null
            && StringUtils.equals(spCreditEntity.getSingleLoan(), BaseBizConstants.ZERO)) {
            ClBankCardEntity userBankCard = bankCardCoreService.queryUserBankCard(userId);
            if (userBankCard == null) {
                throw new ServiceException("未查询到用户绑卡信息，请联系管理员");
            }
            SpPayChannelConfigEntity spPayChannelConfigEntity = spPayChannelConfigService
                .queryPayChannel(userBankCard.getPayCode(), userBankCard.getBankCode());
            if (spPayChannelConfigEntity != null) {
                BigDecimal bigDecimal = spPayChannelConfigEntity.getDfSingleLimit()
                    .multiply(new BigDecimal(10000))
                    .divide(new BigDecimal(1000), 0, BigDecimal.ROUND_DOWN)
                    .multiply(new BigDecimal(1000));
                if (bigDecimal.compareTo(new BigDecimal(resp.getMaxCredit())) > 0) {
                    resp.setDefaultAmount(resp.getMaxCredit());
                } else {
                    resp.setDefaultAmount(String.valueOf(bigDecimal));
                }
            } else {
                resp.setDefaultAmount(String.valueOf(resp.getMaxCredit()));
            }
        }

        //设置还款方式

        return null;
    }

}
