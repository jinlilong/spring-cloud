/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.enums.BorrowCatEnums;
import org.loan.core.common.enums.PayChannelEnums;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.utils.DateUtil;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.dao.ClBorrowDao;
import org.loan.core.dao.ClUserDao;
import org.loan.core.dao.SpPayChannelConfigDao;
import org.loan.core.dao.SpPhoneDao;
import org.loan.core.domain.ClBankCardEntity;
import org.loan.core.domain.ClUserEntity;
import org.loan.core.domain.SpCreditEntity;
import org.loan.core.domain.SpPayChannelConfigEntity;
import org.loan.core.domain.SpPhoneEntity;
import org.loan.core.service.BankCardCoreService;
import org.loan.core.service.SpCreditService;
import org.loan.core.service.SpPayChannelConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: SpPayChannelConfigServiceImpl.java, v 0.1 2018年5月14日 上午9:34:30 jinlilong Exp $
 */
@Service("spPayChannelConfigService")
public class SpPayChannelConfigServiceImpl implements SpPayChannelConfigService {

    /**  */
    @Autowired
    private SpPayChannelConfigDao spPayChannelConfigDao;

    /**  */
    @Autowired
    private BankCardCoreService   bankCardCoreService;

    @Autowired
    private ClBorrowDao           clBorrowDao;

    @Autowired
    private SpPhoneDao            spPhoneDao;

    @Autowired
    private ClUserDao             clUserDao;

    @Autowired
    private SpCreditService       spCreditService;

    /** 
     * @see com.hwc.framework.modules.service.SpPayChannelConfigService#queryHighLevelByBankCode(java.lang.String)
     */
    @Override
    public SpPayChannelConfigEntity queryHighLevelByBankCode(String bankCode, String channelCode,
                                                             Long userId) {
        SpPayChannelConfigEntity entity = null;

        ClUserEntity clUserEntity = clUserDao.queryObject(userId);
        SpPhoneEntity spPhoneEntity = spPhoneDao.queryByPhone(clUserEntity.getLoginName());
        //若在线上名单库，走富友通道
        Map<String, Object> map = new HashMap<>();
        if (spPhoneEntity != null
            && StringUtils.equals(spPhoneEntity.getType(), BaseBizConstants.ONE)) {
            map.put("payChannel", PayChannelEnums.FUYOU.getCode());
        } else {
            map.put("payChannel", PayChannelEnums.BAOFU.getCode());
        }
        map.put("bankCode", bankCode);
        entity = spPayChannelConfigDao.queryDefaultChannel(map);
        if (entity == null) {
            throw new ServiceException("查询配置不存在,暂不支持此银行卡,请联系我的业务人员");
        }
        return entity;
    }

    /** 
     * @see com.hwc.framework.modules.service.SpPayChannelConfigService#validteUserAmount(java.lang.Long, java.math.BigDecimal)
     */
    @Override
    public void validteUserAmount(Long userId, BigDecimal amount) {
        ClBankCardEntity clBankCardEntity = bankCardCoreService.queryUserBankCard(userId);

        Map<String, Object> map = new HashMap<>();
        map.put("payChannel", clBankCardEntity.getPayCode());
        map.put("channelCode", clBankCardEntity.getBankCode());
        List<SpPayChannelConfigEntity> list = spPayChannelConfigDao.queryList(map);
        if (org.springframework.util.CollectionUtils.isEmpty(list)) {
            return;
        }
        //校验单笔是否大于单日单笔限制
        SpPayChannelConfigEntity spPayChannelConfigEntity = list.get(0);
        double maxSingleLimit = spPayChannelConfigEntity.getDfSingleLimit().doubleValue() * 10000;
        if (maxSingleLimit > 0 && maxSingleLimit < amount.doubleValue()) {
            throw new ServiceException(
                spPayChannelConfigEntity.getBankName() + "单笔限额为" + maxSingleLimit + "元，请重新输入借款金额");
        }
        double maxDayLimit = spPayChannelConfigEntity.getDfDayLimit().doubleValue() * 10000;
        if (maxDayLimit > 0) {
            Map<String, Object> queryMap = new HashMap<>();
            queryMap.put("userId", userId);
            queryMap.put("startDate", DateUtil.getDayStartTime(new Date()));
            queryMap.put("endDate", DateUtil.getDayEndTime(new Date()));
            BigDecimal borrowAmount = clBorrowDao.queryUserDayBorrowAmount(queryMap);
            if (borrowAmount != null && borrowAmount.doubleValue() > maxDayLimit) {
                throw new ServiceException(spPayChannelConfigEntity.getBankName() + "单日限额为"
                                           + maxDayLimit + "元，今日已无法借款，请明天再试");
            }

        }

        double maxMonthLimit = spPayChannelConfigEntity.getDfMonthLimit().doubleValue() * 10000;
        if (maxMonthLimit > 0) {
            Map<String, Object> queryMap = new HashMap<>();
            queryMap.put("userId", userId);
            queryMap.put("startDate", DateUtil.getMonthStartTime(new Date()));
            queryMap.put("endDate", DateUtil.getMonthEndTime(new Date()));
            BigDecimal borrowAmount = clBorrowDao.queryUserDayBorrowAmount(queryMap);
            if (borrowAmount != null && borrowAmount.doubleValue() > maxMonthLimit) {
                throw new ServiceException(spPayChannelConfigEntity.getBankName() + "单月限额为"
                                           + maxMonthLimit + "元，本月已无法借款，请下一个月再试");
            }
        }

    }

    /** 
     * @see com.hwc.framework.modules.service.SpPayChannelConfigService#validateRepayAmount(java.lang.Long, java.math.BigDecimal)
     */
    @Override
    public void validateRepayAmount(Long userId, BigDecimal amount) {
        ClBankCardEntity clBankCardEntity = bankCardCoreService.queryUserBankCard(userId);

        Map<String, Object> map = new HashMap<>();
        map.put("payChannel", clBankCardEntity.getPayCode());
        map.put("channelCode", clBankCardEntity.getBankCode());
        List<SpPayChannelConfigEntity> list = spPayChannelConfigDao.queryList(map);
        if (org.springframework.util.CollectionUtils.isEmpty(list)) {
            return;
        }
        //校验单笔是否大于单日单笔限制
        SpPayChannelConfigEntity spPayChannelConfigEntity = list.get(0);
        int maxSingleLimit = spPayChannelConfigEntity.getDkSingleLimit().intValue() * 10000;
        if (maxSingleLimit > 0 && maxSingleLimit < amount.doubleValue()) {
            throw new ServiceException(spPayChannelConfigEntity.getBankName() + "单笔限额为"
                                       + maxSingleLimit + "元，无法还款，请联系我们业务人员");
        }

    }

    /** 
     * @see com.hwc.framework.modules.service.SpPayChannelConfigService#queryUserPayChannelConfig(java.lang.Long)
     */
    @Override
    public List<SpPayChannelConfigEntity> queryUserPayChannelConfig(Long userId) {
        List<SpPayChannelConfigEntity> list = null;
        SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(userId);
        Map<String, Object> map = new HashMap<>();
        //若是线上信用，取富友通道支持的银行卡配置
        if (spCreditEntity != null && StringUtils.equals(spCreditEntity.getMortgageType(),
            BorrowCatEnums.MORTGAGE_TYPE_ONLINE_CREDIT.getMortgageType())) {
            map.put("channel", PayChannelEnums.FUYOU.getCode());
        }
        if (spCreditEntity == null) {
            ClUserEntity clUserEntity = clUserDao.queryObject(userId);
            if (clUserEntity != null) {
                SpPhoneEntity spPhoneEntity = spPhoneDao.queryByPhone(clUserEntity.getLoginName());
                if (spPhoneEntity != null
                    && StringUtils.equals(spPhoneEntity.getType(), BaseBizConstants.ONE)) {
                    map.put("channel", PayChannelEnums.FUYOU.getCode());
                }
            }
        }
        if (!map.containsKey("channel")) {
            map.put("channel", PayChannelEnums.BAOFU.getCode());
        }
        list = spPayChannelConfigDao.queryList(map);
        if (list == null) {
            list = new ArrayList<>();
        }
        return list;
    }

    /** 
     * @see org.loan.core.service.SpPayChannelConfigService#queryPayChannel(java.lang.String, java.lang.String)
     */
    @Override
    public SpPayChannelConfigEntity queryPayChannel(String payChannel, String channelCode) {
        Map<String, Object> map = new HashMap<>();
        map.put("payChannel", payChannel);
        map.put("channelCode", channelCode);
        List<SpPayChannelConfigEntity> list = spPayChannelConfigDao.queryList(map);
        if (!org.springframework.util.CollectionUtils.isEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

}
