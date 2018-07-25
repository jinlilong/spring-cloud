/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.math.BigDecimal;
import java.util.List;

import org.loan.core.common.model.req.IncomeSuccessReq;
import org.loan.core.common.model.req.PayForReq;
import org.loan.core.common.model.resp.IncomeResp;
import org.loan.core.domain.ClBorrowEntity;
import org.loan.core.domain.ClBorrowRepayEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: BorrowCoreService.java, v 0.1 2018年5月17日 上午10:37:51 jinlilong Exp $
 */
public interface BorrowCoreService {

    /**
     * 创建borrow_repay
     * @param borrowId
     */
    public void createBorrowRepay(Long borrowId);

    /**
     * 创建borrow 记录
     * @param req
     */
    public Long createBorrow(PayForReq req);

    /**
     * 根据borrowId查询订单
     * @param borrowId
     * @return
     */
    public ClBorrowEntity queryById(Long borrowId);

    /**
     * 根据唯一流水号查询订单
     * @param orderNo
     * @return
     */
    public ClBorrowEntity queryByOrderNo(String orderNo);

    /**
     * 校验用户是否可以借款
     * @param userId
     * @return
     */
    public void isCanBorrow(PayForReq req);

    /**
     * 根据repayId查询borrowRepay
     * @param repayId
     * @return
     */
    public ClBorrowRepayEntity queryByRepayId(Long repayId);

    /**
     * 
     * @param clBorrowRepayEntity
     */
    public void updateBorrowRepay(ClBorrowRepayEntity clBorrowRepayEntity);

    /**
     * 更新所有borrowRepay为已还款
     * @param borrowId
     * @param repayAmount  实际还款
     */
    public ClBorrowRepayEntity udpateBorrorRepayByBorrowId(Long borrowId, BigDecimal repayAmount,
                                                           String orderno,
                                                           String offlineRepaymentVoucherPic,
                                                           String offlineRepaymentRemark,
                                                           String advanceAmount, String Interest);

    /**
     * 更新borrow
     * @param clBorrowEntity
     */
    public void updateBorrow(ClBorrowEntity clBorrowEntity);

    /**
     * 计算已还款borrowReapy
     * @param reapyId
     * @return
     */
    public int countHasRepay(Long borrowId);

    /**
     * 计算已还款borrowRepay的本金之和
     * @param borrowId
     * @return
     */
    public BigDecimal sumHasRepayRealAmount(Long borrowId);

    /**
     * 更新逾期状态及用户冻结状态
     * @param borrowId
     */
    public void updateBorrowOverdue(Long borrowId, Long userId);

    /**
     * 根据用户ID查询用户是否有未还款的记录
     * @param userId
     * @return
     */
    public ClBorrowRepayEntity queryUserUnRepay(Long userId);

    /**
     * 当期还款成功需要处理的逻辑
     * @param req
     * @param clBorrowRepayEntity
     */
    public void currentPeriodRepayment(IncomeSuccessReq req,
                                       ClBorrowRepayEntity clBorrowRepayEntity, IncomeResp resp);

    /**
     * 提前还款成功需要处理的逻辑
     * @param req
     * @param clBorrowEntity
     * @param incomeResp
     */
    public void advancePeriodRepayment(IncomeSuccessReq req, ClBorrowEntity clBorrowEntity,
                                       IncomeResp incomeResp);

    /**
     * 计算提前还款手续费和服务费
     * @return
     */
    public ClBorrowRepayEntity calcPreRepayServiceAndProceduresAmount(Long userId, Long borrowId);

    /**
     * 根据borrowId查询borrowRepay
     * @param borrowId
     * @return
     */
    public List<ClBorrowRepayEntity> queryBorrowRepayByBorrowId(Long borrowId);

}
