/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.math.BigDecimal;
import java.util.List;

import org.loan.core.domain.SpPayChannelConfigEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: SpPayChannelConfigService.java, v 0.1 2018年5月14日 上午9:33:34 jinlilong Exp $
 */
public interface SpPayChannelConfigService {

    /**
     * 根据银行code查询配置 查询优先级最高的支付通道
     * @param bankCode
     * @return
     */
    public SpPayChannelConfigEntity queryHighLevelByBankCode(String bankCode, String channelCode,
                                                             Long userId);

    /**
     * 校验用户的借款额度
     * @param userId
     * @param amount
     */
    public void validteUserAmount(Long userId, BigDecimal amount);

    /**
     * 
     * @param userId
     * @param amount
     */
    public void validateRepayAmount(Long userId, BigDecimal amount);

    /**
     * 根据用户Id 查询
     * @param userId
     */
    public List<SpPayChannelConfigEntity> queryUserPayChannelConfig(Long userId);

    /**
     * 根据通道及银行code查询 银行限额配置
     * @param payChannel
     * @param channelCode
     * @return
     */
    public SpPayChannelConfigEntity queryPayChannel(String payChannel, String channelCode);

}
