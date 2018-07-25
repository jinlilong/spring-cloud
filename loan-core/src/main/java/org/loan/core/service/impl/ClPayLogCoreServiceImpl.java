/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.loan.core.common.enums.PayLogScenesEnums;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.model.req.PayForReq;
import org.loan.core.common.model.resp.IncomeResp;
import org.loan.core.common.utils.DateUtil;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.convertor.PaymentChannelServiceConvertor;
import org.loan.core.dao.ClPayLogDao;
import org.loan.core.dao.ClUserBaseInfoDao;
import org.loan.core.domain.ClBankCardEntity;
import org.loan.core.domain.ClPayLogEntity;
import org.loan.core.domain.ClUserBaseInfoEntity;
import org.loan.core.service.BankCardCoreService;
import org.loan.core.service.ClPayLogCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: ClPayLogServiceImpl.java, v 0.1 2018年5月17日 下午5:17:00 jinlilong Exp $
 */
@Service("clPayLogCoreService")
public class ClPayLogCoreServiceImpl implements ClPayLogCoreService {

    /**  */
    @Autowired
    private ClPayLogDao         clPayLogDao;

    /**  */
    @Autowired
    private BankCardCoreService bankCardCoreService;

    /**  */
    @Autowired
    private ClUserBaseInfoDao   clUserBaseInfoDao;

    /** 
     * @see com.hwc.framework.modules.service.ClPayLogCoreService#queryByOrderNo(java.lang.String)
     */
    @Override
    public ClPayLogEntity queryByOrderNo(String orderNo) {
        ClPayLogEntity entity = clPayLogDao.queryByOrderNo(orderNo);
        if (entity == null) {
            throw new ServiceException("查询paylog不存在");
        }
        return entity;
    }

    /** 
     * @see com.hwc.framework.modules.service.ClPayLogCoreService#queryPendingPaymentPayLog()
     */
    @Override
    public List<ClPayLogEntity> queryPendingPaymentPayLog() {
        Map<String, Object> map = new HashMap<>();
        Date startDate = DateUtil.addDate(new Date(), -1);
        map.put("startTime", DateUtil.getDayStartTime(startDate));
        map.put("endTime", DateUtil.getDayEndTime(new Date()));
        map.put("scenes", PayLogScenesEnums.PAY.getCode());
        List<ClPayLogEntity> list = clPayLogDao.queryPendingPaymentPayLog(map);
        List<ClPayLogEntity> returnList = new ArrayList<>();
        Date date = DateUtil.addDateTime(new Date(), Calendar.MINUTE, -5);
        for (ClPayLogEntity clPayLogEntity : list) {
            if (clPayLogEntity.getCreateTime().before(date)) {
                returnList.add(clPayLogEntity);
            }
        }
        return returnList;
    }

    /** 
     * @see com.hwc.framework.modules.service.ClPayLogCoreService#queryByRepayId(java.lang.Long)
     */
    @Override
    public ClPayLogEntity queryBySuccessPayByRepayId(Long repayId) {
        return clPayLogDao.queryByRepayId(repayId);
    }

    /** 
     * @see com.hwc.framework.modules.service.ClPayLogCoreService#update(com.hwc.framework.modules.model.ClPayLogEntity)
     */
    @Override
    public void update(ClPayLogEntity clPayLogEntity) {
        clPayLogDao.update(clPayLogEntity);
    }

    /** 
     * @see com.hwc.framework.modules.service.ClPayLogCoreService#createUnlineRepayLog(java.lang.Long)
     */
    @Override
    public IncomeResp createUnlineRepayLog(PayForReq req) {

        ClBankCardEntity userBankCard = bankCardCoreService.queryUserBankCard(req.getUserId());

        ClUserBaseInfoEntity clUserBaseInfoEntity = clUserBaseInfoDao
            .queryObjectByUserId(req.getUserId());
        if (clUserBaseInfoEntity == null
            || StringUtils.isEmpty(clUserBaseInfoEntity.getRealName())) {
            throw new ServiceException("用户未完成实名认证");
        }
        //保存日志
        ClPayLogEntity clPayLogEntity = PaymentChannelServiceConvertor
            .buildClPayLogForUnderIncome(req, userBankCard, clUserBaseInfoEntity);
        clPayLogDao.save(clPayLogEntity);
        IncomeResp incomeResp = new IncomeResp();
        incomeResp.setSuccess(true);
        incomeResp.setHandleState(false);
        incomeResp.setRemark("线下还款成功");
        incomeResp.setOrderNo(clPayLogEntity.getOrderNo());
        return incomeResp;
    }

    /** 
     * @see com.hwc.framework.modules.service.ClPayLogCoreService#queryPendingRepayHandelPayLog()
     */
    @Override
    public List<ClPayLogEntity> queryPendingRepayHandelPayLog() {
        Map<String, Object> map = new HashMap<>();
        Date startDate = DateUtil.addDate(new Date(), -1);
        map.put("startTime", DateUtil.getDayStartTime(startDate));
        map.put("endTime", DateUtil.getDayEndTime(new Date()));
        map.put("scenes", PayLogScenesEnums.REPAY.getCode());
        List<ClPayLogEntity> list = clPayLogDao.queryPendingPaymentPayLog(map);
        List<ClPayLogEntity> returnList = new ArrayList<>();
        Date date = DateUtil.addDateTime(new Date(), Calendar.MINUTE, -5);
        for (ClPayLogEntity clPayLogEntity : list) {
            if (clPayLogEntity.getCreateTime().before(date)) {
                returnList.add(clPayLogEntity);
            }
        }
        return returnList;
    }

    /** 
     * @see com.hwc.framework.modules.service.ClPayLogCoreService#queryUnRepayStateLog(com.hwc.framework.modules.model.ClPayLogEntity)
     */
    @Override
    public ClPayLogEntity queryUnRepayStateLog(Long borrowId, Long repayId) {
        Map<String, Object> map = new HashMap<>();
        map.put("borrowId", borrowId);
        map.put("repayId", repayId);
        return clPayLogDao.queryUnRepayStateLog(map);
    }

}
