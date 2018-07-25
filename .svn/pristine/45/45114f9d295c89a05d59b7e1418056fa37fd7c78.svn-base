/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.constant.BorrowStateConstant;
import org.loan.core.common.constant.ClMortgageOrderState;
import org.loan.core.common.enums.BorrowCatEnums;
import org.loan.core.common.enums.BorrowRepayStateEnums;
import org.loan.core.common.enums.PayChannelEnums;
import org.loan.core.common.enums.RepaymentMethodEnums;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.model.req.IncomeSuccessReq;
import org.loan.core.common.model.req.PayForReq;
import org.loan.core.common.model.req.RepaymentCalculationReq;
import org.loan.core.common.model.resp.IncomeResp;
import org.loan.core.common.model.resp.Repayment;
import org.loan.core.common.model.resp.RepaymentListResp;
import org.loan.core.common.utils.DateUtil;
import org.loan.core.common.utils.RepaymentCalculationUtils;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.convertor.BorrowServiceConvertor;
import org.loan.core.dao.ArcCreditDao;
import org.loan.core.dao.ClBorrowDao;
import org.loan.core.dao.ClBorrowRepayDao;
import org.loan.core.dao.ClBorrowRepayLogDao;
import org.loan.core.dao.ClMortgageDao;
import org.loan.core.dao.ClUserBaseInfoDao;
import org.loan.core.domain.ArcCreditEntity;
import org.loan.core.domain.ClBankCardEntity;
import org.loan.core.domain.ClBorrowEntity;
import org.loan.core.domain.ClBorrowRepayEntity;
import org.loan.core.domain.ClBorrowRepayLogEntity;
import org.loan.core.domain.ClMortgageEntity;
import org.loan.core.domain.ClPayLogEntity;
import org.loan.core.domain.ClUserBaseInfoEntity;
import org.loan.core.domain.SpCreditEntity;
import org.loan.core.service.ArcCreditCoreService;
import org.loan.core.service.BankCardCoreService;
import org.loan.core.service.BorrowCoreService;
import org.loan.core.service.ClPayLogCoreService;
import org.loan.core.service.ClUserCoreService;
import org.loan.core.service.SpCreditService;
import org.loan.core.service.SpPayChannelConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: BorrowCoreServiceImpl.java, v 0.1 2018年5月17日 上午10:38:41 jinlilong Exp $
 */
@Service("borrowCoreService")
public class BorrowCoreServiceImpl implements BorrowCoreService {

    /**  */
    private static final Logger       logger = LoggerFactory.getLogger(BorrowCoreServiceImpl.class);

    /**  */
    @Autowired
    private ClBorrowDao               clBorrowDao;

    /**  */
    @Autowired
    private SpCreditService           spCreditService;

    /**  */
    @Autowired
    private BankCardCoreService       bankCardCoreService;

    /**  */
    @Autowired
    private ClUserBaseInfoDao         clUserBaseInfoDao;

    /**  */
    @Autowired
    private ArcCreditCoreService      arcCreditCoreService;

    /**  */
    @Autowired
    private ClUserCoreService         clUserCoreService;

    /**  */
    @Autowired
    private ClMortgageDao             clMortgageDao;

    @Autowired
    private SpPayChannelConfigService spPayChannelConfigService;

    /**  */
    @Autowired
    private ClBorrowRepayDao          clBorrowRepayDao;
    /**  */
    @Autowired
    private ClPayLogCoreService       clPayLogCoreService;
    /**  */
    @Autowired
    private ArcCreditDao              arcCreditDao;

    /**  */
    @Autowired
    private ClBorrowRepayLogDao       clBorrowRepayLogDao;

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#createBorrowRepay(java.lang.Long)
     */
    @Override
    public void createBorrowRepay(Long borrowId) {

        ClBorrowEntity borrow = queryById(borrowId);
        SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(borrow.getUserId());
        RepaymentCalculationReq req = new RepaymentCalculationReq();
        req.setAmount(borrow.getAmount());
        req.setRepaymentMethod(borrow.getRepaymentMethod());
        req.setStartDate(new Date());
        req.setTotalMonth(borrow.getPeriods());
        //设置利率和利率类型
        spCreditService.getRate(borrow.getUserId(), req);
        Repayment repayment = RepaymentCalculationUtils.calculation(req);
        List<RepaymentListResp> list = repayment.getList();
        for (RepaymentListResp repaymentListResp : list) {
            ClBorrowRepayEntity repay = new ClBorrowRepayEntity();
            repay.setUserId(borrow.getUserId());
            repay.setBorrowId(borrowId);
            repay.setCreateTime(new Date());
            repay.setState(BorrowRepayStateEnums.NO_PAY.getCode());
            repay.setSeq(Integer.valueOf(repaymentListResp.getSeq()));
            repay.setAmount(new BigDecimal(repaymentListResp.getTotal()));
            repay.setInterest(new BigDecimal(repaymentListResp.getInterest()));
            repay.setRate(borrow.getRate());
            repay.setRepayTime(DateUtil.getDayEndTime(repaymentListResp.getDate()));
            repay.setRealAmount(new BigDecimal(repaymentListResp.getMonthPri()));
            repay.setRealAmountBalance(new BigDecimal(repaymentListResp.getBalance()));
            repay.setPenaltyAmout(new BigDecimal(0));
            repay.setRepayAmount(new BigDecimal(0));
            repay.setPenaltyDay(0);
            repay.setAdvanceAmount(new BigDecimal(0));
            repay.setRepayInterest(new BigDecimal(0));
            repay.setServiceAmoumt(new BigDecimal(0));
            repay.setProceduresAmount(new BigDecimal(0));
            if (spCreditEntity != null) {
                repay.setServiceAmoumt(
                    spCreditEntity.getServiceRate().multiply(borrow.getRealAmount()));
                //第一期需要支付手术费
                if (repay.getSeq().intValue() == 1) {
                    repay.setProceduresAmount(
                        spCreditEntity.getProceduresRate().multiply(borrow.getRealAmount()));
                } else {
                    repay.setProceduresAmount(new BigDecimal(0));
                }
            }
            clBorrowRepayDao.save(repay);
        }
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#queryById(java.lang.Long)
     */
    @Override
    public ClBorrowEntity queryById(Long borrowId) {
        ClBorrowEntity entity = clBorrowDao.queryObject(borrowId);
        if (entity == null) {
            throw new ServiceException("查询订单不存在");
        }
        return entity;
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#queryByOrderNo(java.lang.String)
     */
    @Override
    public ClBorrowEntity queryByOrderNo(String orderNo) {
        ClBorrowEntity entity = clBorrowDao.queryByOrderNo(orderNo);
        if (entity == null) {
            logger.error("查询订单不存在=>" + orderNo);
            throw new ServiceException("查询订单不存在");
        }
        return entity;
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#createBorrow(com.hwc.framework.common.req.PayForReq)
     */
    @Override
    public Long createBorrow(PayForReq payForReq) {
        RepaymentCalculationReq req = new RepaymentCalculationReq();
        req.setAmount(payForReq.getAmount());
        req.setRepaymentMethod(payForReq.getRepaymentMethod());
        req.setStartDate(new Date());
        req.setTotalMonth(payForReq.getPeriods());
        //设置利率和利率类型
        spCreditService.getRate(payForReq.getUserId(), req);

        Repayment repayment = RepaymentCalculationUtils.calculation(req);
        ClBankCardEntity clBankCardEntity = bankCardCoreService
            .queryUserBankCard(payForReq.getUserId());
        ClUserBaseInfoEntity clUserBaseInfoEntity = clUserBaseInfoDao
            .queryObjectByUserId(payForReq.getUserId());
        ClBorrowEntity clBorrowEntity = BorrowServiceConvertor.buildBorrowEntity(payForReq, req,
            repayment, clBankCardEntity, clUserBaseInfoEntity);
        clBorrowEntity.setRate(spCreditService.getUserRate(payForReq.getUserId()));

        ClMortgageEntity clMortgageEntity = clMortgageDao.queryByUserId(payForReq.getUserId());
        clBorrowEntity.setMid(clMortgageEntity.getId());
        clBorrowDao.save(clBorrowEntity);
        return clBorrowEntity.getId();
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#isCanBorrow(com.hwc.framework.common.req.PayForReq)
     */
    @Override
    public void isCanBorrow(PayForReq req) {

        SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(req.getUserId());
        if (spCreditEntity != null) {
            if (StringUtils.equals(spCreditEntity.getMortgageType(),
                BorrowCatEnums.MORTGAGE_TYPE_ONLINE_CREDIT.getMortgageType())
                && req.getPeriods() > 12) {
                throw new ServiceException("线上信用用户最大支持12期");
            }
            if (StringUtils.equals(spCreditEntity.getMortgageType(),
                BorrowCatEnums.MORTGAGE_TYPE_ONLINE_CREDIT.getMortgageType())
                && !StringUtils.equals(req.getRepaymentMethod(),
                    RepaymentMethodEnums.AVERAGE_CAPITAL_PLUS_INTEREST.getCode())) {
                throw new ServiceException("线上信用只支持等额本息还款方式");
            }
        }
        //校验额度是否够用
        arcCreditCoreService.isQuota(req.getUserId(), req.getAmount());
        //校验交易密码是否正确
        clUserCoreService.checkPwd(req.getUserId(), req.getTradePwd());
        //查询用户额度是否被冻结
        clUserCoreService.queryUserIsFrozen(req.getUserId());
        //校验是否在黑名单
        clUserCoreService.checkIsBlackUser(req.getUserId());
        //校验还款方式是否正确
        RepaymentMethodEnums enums = RepaymentMethodEnums.queryByCode(req.getRepaymentMethod());
        if (enums == null) {
            throw new ServiceException("不支持此还款方式");
        }

        //校验用户输入的额度是否正确
        spPayChannelConfigService.validteUserAmount(req.getUserId(), req.getAmount());
        //校验车位审核是否通过
        ClMortgageEntity clMortgageEntity = clMortgageDao.queryByUserId(req.getUserId());
        if (clMortgageEntity == null) {
            throw new ServiceException("未查询到用户车位信息");
        }
        if (!(StringUtils.equals(clMortgageEntity.getState(), ClMortgageOrderState.STATE_PASS)
              || StringUtils.equals(clMortgageEntity.getState(),
                  ClMortgageOrderState.STATE_DRAWING))) {
            throw new ServiceException("您的车位还未审核通过！");
        }
        //校验银行卡绑定的通道是否正确,若是线上信用，必须绑定富有
        if (spCreditEntity != null && StringUtils.equals(spCreditEntity.getMortgageType(),
            BorrowCatEnums.MORTGAGE_TYPE_ONLINE_CREDIT.getMortgageType())) {
            ClBankCardEntity clBankCardEntity = bankCardCoreService
                .queryUserBankCard(req.getUserId());
            if (!StringUtils.equals(clBankCardEntity.getPayCode(),
                PayChannelEnums.FUYOU.getCode())) {
                throw new ServiceException("支付通道绑定不正确，请联系我们的业务人员!");
            }
        }
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#queryByRepayId(java.lang.Long)
     */
    @Override
    public ClBorrowRepayEntity queryByRepayId(Long repayId) {
        ClBorrowRepayEntity clBorrowRepayEntity = clBorrowRepayDao.queryObject(repayId);
        if (clBorrowRepayEntity == null) {
            throw new ServiceException("查询repay为空");
        }
        return clBorrowRepayEntity;
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#updateBorrowRepay(com.hwc.framework.modules.model.ClBorrowRepayEntity)
     */
    @Override
    public void updateBorrowRepay(ClBorrowRepayEntity clBorrowRepayEntity) {
        clBorrowRepayDao.update(clBorrowRepayEntity);
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#countHasRepay(java.lang.Long)
     */
    @Override
    public int countHasRepay(Long borrowId) {
        return clBorrowRepayDao.countHasRepay(borrowId);
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#updateBorrow(com.hwc.framework.modules.model.ClBorrowEntity)
     */
    @Override
    public void updateBorrow(ClBorrowEntity clBorrowEntity) {
        clBorrowDao.update(clBorrowEntity);
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#udpateBorrorRepayByBorrowId(java.lang.Long, java.math.BigDecimal, java.lang.String)
     */
    @Override
    public ClBorrowRepayEntity udpateBorrorRepayByBorrowId(Long borrowId, BigDecimal repayAmount,
                                                           String orderno,
                                                           String offlineRepaymentVoucherPic,
                                                           String offlineRepaymentRemark,
                                                           String advanceAmount, String interest) {
        //更新最近一期的未还款 
        ClBorrowRepayEntity clBorrowRepayEntity = clBorrowRepayDao.queryCurrentRepay(borrowId);
        clBorrowRepayEntity.setRepayAmount(repayAmount);
        if (advanceAmount != null) {
            clBorrowRepayEntity.setAdvanceAmount(new BigDecimal(advanceAmount));
        }
        clBorrowRepayEntity.setState(BorrowRepayStateEnums.PAIED.getCode());
        clBorrowRepayEntity.setPreState(BaseBizConstants.ONE);
        clBorrowRepayEntity.setOfflineRepaymentRemark(offlineRepaymentRemark);
        clBorrowRepayEntity.setOfflineRepaymentVoucherPic(offlineRepaymentVoucherPic);
        clBorrowRepayEntity.setRepayInterest(new BigDecimal(interest));
        clBorrowRepayDao.update(clBorrowRepayEntity);
        //更新其他几期未还款为已还款
        clBorrowRepayDao.updateAllBorrowRepayHasRepay(borrowId);

        ClPayLogEntity clPayLogEntity = clPayLogCoreService.queryByOrderNo(orderno);
        clPayLogEntity.setRepayId(clBorrowRepayEntity.getId());
        clPayLogCoreService.update(clPayLogEntity);

        return clBorrowRepayEntity;
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#sumNotRepayRealAmount(java.lang.Long)
     */
    @Override
    public BigDecimal sumHasRepayRealAmount(Long borrowId) {
        BigDecimal unRepayAmount = clBorrowRepayDao.sumHasRepayRealAmount(borrowId);
        if (unRepayAmount == null) {
            unRepayAmount = new BigDecimal(0);
        }
        return unRepayAmount;
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#updateBorrowOverdue(java.lang.Long)
     */
    @Override
    public void updateBorrowOverdue(Long borrowId, Long userId) {
        //判断此订单是否有逾期未还款的记录
        ClBorrowRepayEntity entity = clBorrowRepayDao.queryOverdueRepayByBorrowId(borrowId);
        if (entity == null) {
            ClBorrowEntity clBorrowEntity = clBorrowDao.queryObject(borrowId);
            //若状态为已逾期状态
            if (StringUtils.equals(clBorrowEntity.getState(), BorrowStateConstant.STATE_DELAY)) {
                ClBorrowEntity clBorrowEntityUpdate = new ClBorrowEntity();
                clBorrowEntityUpdate.setId(borrowId);
                clBorrowEntityUpdate.setState(BorrowStateConstant.STATE_REPAY);
                clBorrowDao.update(clBorrowEntityUpdate);
            }
            //更新用户的冻结状态
            ArcCreditEntity arcCreditEntity = arcCreditDao.queryCreditByUserId(userId);
            if (StringUtils.equals(arcCreditEntity.getState(), "20")) {
                ClBorrowRepayEntity entity1 = clBorrowRepayDao.queryOverdueRepayByUserId(userId);
                if (entity1 == null) {
                    arcCreditEntity.setState("10");
                    arcCreditDao.update(arcCreditEntity);
                }
            }

        }

    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#currentPeriodRepayment(com.hwc.framework.common.req.IncomeSuccessReq, com.hwc.framework.modules.model.ClBorrowRepayEntity)
     */
    @Override
    public void currentPeriodRepayment(IncomeSuccessReq req,
                                       ClBorrowRepayEntity clBorrowRepayEntity, IncomeResp resp) {

        //恢复额度，还清并更新borrow状态
        arcCreditCoreService.recoveryUserQuotaByRepayId(clBorrowRepayEntity.getUserId(),
            clBorrowRepayEntity.getId());

        clBorrowRepayEntity.setRepayAmount(req.getAmount());
        clBorrowRepayEntity.setState(BorrowRepayStateEnums.PAIED.getCode());
        clBorrowRepayEntity.setOfflineRepaymentRemark(req.getOfflineRepaymentRemark());
        clBorrowRepayEntity.setOfflineRepaymentVoucherPic(req.getOfflineRepaymentVoucherPic());
        clBorrowRepayEntity.setRepayInterest(clBorrowRepayEntity.getInterest());
        //本期还款
        clBorrowRepayEntity.setPreState(BaseBizConstants.ZERO);
        updateBorrowRepay(clBorrowRepayEntity);

        //插入borrowRepayLog
        ClBorrowRepayLogEntity cBorrowRepayLogEntity = BorrowServiceConvertor
            .buildClBorrowRepayLogEntity(req.getAmount(), clBorrowRepayEntity, resp,
                req.getIsUnderLine());
        clBorrowRepayLogDao.save(cBorrowRepayLogEntity);

        //更新逾期状态和用户冻结状态
        updateBorrowOverdue(clBorrowRepayEntity.getBorrowId(), clBorrowRepayEntity.getUserId());
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#advancePeriodRepayment(com.hwc.framework.common.req.IncomeSuccessReq, com.hwc.framework.modules.model.ClBorrowEntity, com.hwc.framework.common.resp.IncomeResp)
     */
    @Override
    public void advancePeriodRepayment(IncomeSuccessReq req, ClBorrowEntity clBorrowEntity,
                                       IncomeResp incomeResp) {

        //恢复额度，还清并更新borrow状态
        arcCreditCoreService.recoveryUserQuotaByBorrowId(clBorrowEntity.getUserId(),
            clBorrowEntity.getId());
        //更新所有borrowRepay
        ClBorrowRepayEntity clBorrowRepayEntity = udpateBorrorRepayByBorrowId(
            clBorrowEntity.getId(), req.getAmount(), incomeResp.getOrderNo(),
            req.getOfflineRepaymentVoucherPic(), req.getOfflineRepaymentRemark(),
            req.getAdvanceAmount(), req.getInterest());

        //插入borrowRepayLog
        ClBorrowRepayLogEntity cBorrowRepayLogEntity = BorrowServiceConvertor
            .buildClBorrowRepayLogEntity(req.getAmount(), clBorrowRepayEntity, incomeResp,
                req.getIsUnderLine());
        clBorrowRepayLogDao.save(cBorrowRepayLogEntity);
        //更新逾期状态和用户冻结状态
        updateBorrowOverdue(clBorrowRepayEntity.getBorrowId(), clBorrowRepayEntity.getUserId());
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#calcServiceAndProceduresAmount(java.lang.Long)
     */
    @Override
    public ClBorrowRepayEntity calcPreRepayServiceAndProceduresAmount(Long userId, Long borrowId) {
        ClBorrowEntity clBorrowEntity = clBorrowDao.queryObject(borrowId);
        ClBorrowRepayEntity clBorrowRepayEntity = new ClBorrowRepayEntity();
        clBorrowRepayEntity.setServiceAmoumt(new BigDecimal(0));
        clBorrowRepayEntity.setProceduresAmount(new BigDecimal(0));
        SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(userId);
        if (spCreditEntity == null) {
            return clBorrowRepayEntity;
        }
        //判断手术费是否已扣除
        if (spCreditEntity.getProceduresRate().doubleValue() > 0) {
            ClBorrowRepayEntity firstRepay = clBorrowRepayDao.queryFirstPeriodsRepay(borrowId);
            if (firstRepay == null) {
                throw new ServiceException("查询数据不存在");
            }
            //若第一期未还款，提前还款时需要计算手术费
            if (!StringUtils.equals(firstRepay.getState(), BorrowRepayStateEnums.PAIED.getCode())) {
                clBorrowRepayEntity.setProceduresAmount(
                    clBorrowEntity.getRealAmount().multiply(spCreditEntity.getProceduresRate()));
            }
        }
        //计算一期服务费
        if (spCreditEntity.getServiceRate().doubleValue() > 0) {
            clBorrowRepayEntity.setServiceAmoumt(
                clBorrowEntity.getRealAmount().multiply(spCreditEntity.getServiceRate()));
        }
        return clBorrowRepayEntity;
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#queryBorrowRepayByBorrowId(java.lang.Long)
     */
    @Override
    public List<ClBorrowRepayEntity> queryBorrowRepayByBorrowId(Long borrowId) {
        return clBorrowRepayDao.queryBorrowRepayByBorrowId(borrowId);
    }

    /** 
     * @see com.hwc.framework.modules.service.BorrowCoreService#queryUnRepay(java.lang.Long)
     */
    @Override
    public ClBorrowRepayEntity queryUserUnRepay(Long userId) {
        return clBorrowRepayDao.queryUserUnRepay(userId);
    }

}
