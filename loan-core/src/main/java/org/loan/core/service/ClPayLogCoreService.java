/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.util.List;

import org.loan.core.common.model.req.PayForReq;
import org.loan.core.common.model.resp.IncomeResp;
import org.loan.core.domain.ClPayLogEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: ClPayLogService.java, v 0.1 2018年5月17日 下午5:16:15 jinlilong Exp $
 */
public interface ClPayLogCoreService {

    /**
     * 根据订单号查询日志
     * @param orderNo
     * @return
     */
    public ClPayLogEntity queryByOrderNo(String orderNo);

    /**
     * 查询所有待付待付款的paylog
     * @return
     */
    public List<ClPayLogEntity> queryPendingPaymentPayLog();

    /**
     * 查询所有代扣处理中状态的paylog
     * @return
     */
    public List<ClPayLogEntity> queryPendingRepayHandelPayLog();

    /**
     * 
     * @param repayId
     * @return
     */
    public ClPayLogEntity queryBySuccessPayByRepayId(Long repayId);

    /**
     * 更新
     * @param clPayLogEntity
     */
    public void update(ClPayLogEntity clPayLogEntity);

    /**
     * 创建一条默认线下还款成功日志
     * @return
     */
    public IncomeResp createUnlineRepayLog(PayForReq req);

    /**
     * 根据borrowId,repayId 查询代扣待支付的记录
     * @param clPayLogEntity
     * @return
     */
    public ClPayLogEntity queryUnRepayStateLog(Long borrowId, Long repayId);
}
