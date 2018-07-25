/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.convertor;

import java.math.BigDecimal;
import java.util.Date;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.constant.BorrowStateConstant;
import org.loan.core.common.model.req.PayForReq;
import org.loan.core.common.model.req.RepaymentCalculationReq;
import org.loan.core.common.model.resp.IncomeResp;
import org.loan.core.common.model.resp.Repayment;
import org.loan.core.common.utils.DateUtil;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.domain.ClBankCardEntity;
import org.loan.core.domain.ClBorrowEntity;
import org.loan.core.domain.ClBorrowRepayEntity;
import org.loan.core.domain.ClBorrowRepayLogEntity;
import org.loan.core.domain.ClUserBaseInfoEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: BorrowServiceConvertor.java, v 0.1 2018年5月17日 下午2:15:06 jinlilong Exp $
 */
public class BorrowServiceConvertor {

    /**
     * 
     * @param payForReq
     * @param req
     * @param repayment
     * @param clBankCardEntity
     * @param clUserBaseInfoEntity
     * @return
     */
    public static ClBorrowEntity buildBorrowEntity(PayForReq payForReq, RepaymentCalculationReq req,
                                                   Repayment repayment,
                                                   ClBankCardEntity clBankCardEntity,
                                                   ClUserBaseInfoEntity clUserBaseInfoEntity) {
        ClBorrowEntity clBorrowEntity = new ClBorrowEntity();
        clBorrowEntity.setAmount(payForReq.getAmount());
        clBorrowEntity.setUserId(payForReq.getUserId());
        clBorrowEntity.setBorrowType("D");
        clBorrowEntity.setMobile(clBankCardEntity.getPhone());
        clBorrowEntity.setName(clUserBaseInfoEntity.getRealName());
        clBorrowEntity.setRealAmount(payForReq.getAmount());
        clBorrowEntity.setScenes(payForReq.getScenes());
        clBorrowEntity.setCoordinate(payForReq.getCoordinate());
        clBorrowEntity.setExpireTime(DateUtil.addMonths(payForReq.getPeriods(), new Date()));
        clBorrowEntity.setCreateTime(new Date());
        clBorrowEntity.setIp(payForReq.getIp());
        clBorrowEntity.setPeriods(payForReq.getPeriods());
        //clBorrowEntity.setRate(new BigDecimal(req.getRate()));
        clBorrowEntity.setFee(new BigDecimal(0));
        if (StringUtils.isEmpty(payForReq.getState())) {
            clBorrowEntity.setState(BorrowStateConstant.STATE_PASS);
        } else {
            clBorrowEntity.setState(payForReq.getState());
        }
        clBorrowEntity.setOrderNo(payForReq.getOrderNo());
        clBorrowEntity.setIsnotify("F");
        clBorrowEntity.setContractId(payForReq.getContractId());
        clBorrowEntity.setRepaymentMethod(payForReq.getRepaymentMethod());
        int days = DateUtil.daysBetween(clBorrowEntity.getExpireTime(), new Date());
        clBorrowEntity.setTimeLimit(String.valueOf(days));
        clBorrowEntity.setInterest(new BigDecimal(repayment.getTotalInterest()));
        clBorrowEntity.setIsOnline(payForReq.getIsOnline());
        clBorrowEntity.setServiceFee(new BigDecimal(0));
        clBorrowEntity.setFlowFee(new BigDecimal(0));
        clBorrowEntity.setCardId(0L);
        clBorrowEntity.setClient("10");
        clBorrowEntity.setAddress(payForReq.getAddress());
        return clBorrowEntity;
    }

    /**
     * 
     * @return
     */
    public static ClBorrowRepayLogEntity buildClBorrowRepayLogEntity(BigDecimal amount,
                                                                     ClBorrowRepayEntity repay,
                                                                     IncomeResp incomeResp,
                                                                     String isUnderLine) {
        ClBorrowRepayLogEntity clBorrowRepayLogEntity = new ClBorrowRepayLogEntity();
        clBorrowRepayLogEntity.setAmount(amount);
        clBorrowRepayLogEntity.setBorrowId(repay.getBorrowId());
        clBorrowRepayLogEntity.setCreateTime(new Date());
        clBorrowRepayLogEntity.setPayTime(new Date());
        clBorrowRepayLogEntity.setPenaltyAmout(repay.getPenaltyAmout());
        clBorrowRepayLogEntity.setPenaltyDay(repay.getPenaltyDay());
        clBorrowRepayLogEntity.setRefundDeduction(new BigDecimal(0));
        clBorrowRepayLogEntity.setRepayId(repay.getId());
        clBorrowRepayLogEntity.setRepayTime(repay.getRepayTime());
        clBorrowRepayLogEntity.setSerialNumber(incomeResp.getOrderNo());
        clBorrowRepayLogEntity.setRepayAccount(incomeResp.getAccount());
        if (isUnderLine != null && StringUtils.equals(isUnderLine, BaseBizConstants.ONE)) {
            //40线下还款
            clBorrowRepayLogEntity.setRepayWay("40");
        } else {
            clBorrowRepayLogEntity.setRepayWay("10");
        }

        clBorrowRepayLogEntity.setUserId(repay.getUserId());
        return clBorrowRepayLogEntity;
    }

}
