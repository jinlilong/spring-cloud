/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loan.core.common.enums.PayChannelEnums;
import org.loan.core.common.model.req.BindCardReq;
import org.loan.core.common.model.req.PayForQueryOrderReq;
import org.loan.core.common.model.req.PayForReq;
import org.loan.core.common.model.resp.IncomeResp;
import org.loan.core.common.model.resp.PayforResp;
import org.loan.core.domain.ClPayLogEntity;

/**
 * 支付通道
 * @author jinlilong
 * @version $Id: PaymentChannelService.java, v 0.1 2018年5月11日 上午11:50:31 jinlilong Exp $
 */
public interface PaymentChannelService {

    /**
     * 预绑卡
     * @param map
     * @return
     */
    public void bindCard(BindCardReq req);

    /**
     * 确认绑卡
     * @param req
     */
    public void confirmBindCard(BindCardReq req);

    /**
     * 项目录入，仅富友
     */
    public IncomeResp inspro(PayForReq req);

    /**
     * 代付
     * @param req
     */
    public PayforResp payfor(PayForReq req);

    /**
     * 代付回调
     * @param req
     */
    public List<String> payforCallback(HttpServletRequest request, HttpServletResponse response,
                                       PayChannelEnums enums);

    /**
     * 代收
     * @param req
     */
    public IncomeResp income(PayForReq req);

    /**
     * 代收处理中状态的查询确认
     */
    public void incomeQuery(ClPayLogEntity clPayLogEntity);

    /**
     * 
     * @param req
     * @return
     */
    public void queryOrder(PayForQueryOrderReq req);
}
