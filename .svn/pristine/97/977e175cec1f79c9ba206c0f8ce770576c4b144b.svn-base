/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.convertor;

import java.util.Date;

import org.loan.core.domain.ClPayReqLogEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: FuYouPayChannelServiceConvertor.java, v 0.1 2018年5月9日 下午2:00:04 jinlilong Exp $
 */
public class FuYouPayChannelServiceConvertor {

    public static ClPayReqLogEntity buildClPayReqLog(Long borrowId, String orderNo, String params,
                                                     String returnParams, Long userId) {
        ClPayReqLogEntity entity = new ClPayReqLogEntity();
        entity.setBorrowId(borrowId);
        entity.setCreateTime(new Date());
        entity.setOrderNo(orderNo);
        entity.setParams(params);
        entity.setReqDetailParams(returnParams);
        entity.setUserId(userId);
        return entity;
    }

}
