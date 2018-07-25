/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loan.core.common.model.resp.IncomeResp;
import org.loan.core.common.model.resp.PayChannelResp;
import org.loan.core.common.model.resp.PayforCallbackResp;
import org.loan.core.common.model.resp.PayforResp;

/**
 * 支付通道
 * @author jinlilong
 * @version $Id: PayChannelService.java, v 0.1 2018年5月8日 下午3:37:03 jinlilong Exp $
 */
public interface PayChannelService {

    /**
     * 绑卡  
     * @param req
     * @return  处理成功code
     */
    public PayChannelResp bindCard(Map<String, Object> map, Long userId);

    /**
     * 确认绑卡
     * @param req
     * @return
     */
    public PayChannelResp confirmBindCard(Map<String, Object> map, Long userId);

    /**
     * 代付
     */
    public PayforResp payfor(Map<String, Object> map);

    /**
     * 项目录入。仅富友需要
     * @param map
     */
    public String inspro(Map<String, Object> map, Long userId);

    /**
     * 代付回调
     * @param req
     * @return  返回orderNo, 流水号
     */
    public List<PayforCallbackResp> payforCallback(HttpServletRequest req,
                                                   HttpServletResponse resp);

    /**
     * 代扣
     * @param map
     */
    public IncomeResp incomefor(Map<String, Object> map);

    /**
     * 代扣处理中查询确认
     * @param map
     * @return
     */
    public IncomeResp incomeforQuery(Map<String, Object> map);

    /**
     * 查询订单
     */
    public List<PayforCallbackResp> queryOrder(Map<String, Object> map);

}
