/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.convertor;

import java.math.BigDecimal;
import java.util.Date;

import org.loan.core.common.utils.DateUtil;
import org.loan.core.domain.ClMortgageEntity;
import org.loan.core.domain.ClWContactsEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: ClMortgageServiceConvertor.java, v 0.1 2018年4月13日 下午4:28:12 jinlilong Exp $
 */
public class ClMortgageServiceConvertor {

    /**
     * 
     * @return
     */
    public static ClMortgageEntity buildClMortgageEntity(Long userId,
                                                         ClWContactsEntity clWContactsEntity) {
        ClMortgageEntity clMortgageEntity = new ClMortgageEntity();
        clMortgageEntity.setOrderNo(clWContactsEntity.getBorrowid());
        clMortgageEntity.setUserId(userId);
        clMortgageEntity.setApplyDate(new Date());
        clMortgageEntity.setCreated(new Date());
        clMortgageEntity.setBorrowAmount(clWContactsEntity.getBorrowQuota());
        clMortgageEntity.setDyAddress(clWContactsEntity.getParkingPosition());
        clMortgageEntity.setMobile(clWContactsEntity.getPhone());
        clMortgageEntity.setName(clWContactsEntity.getName());
        clMortgageEntity.setDescript("车库");
        clMortgageEntity.setDyCity("");
        clMortgageEntity.setDyCommunity("");
        clMortgageEntity.setDyType("10");
        clMortgageEntity.setDyBuyYear(null);
        clMortgageEntity
            .setExpireDate(DateUtil.addMonths(clWContactsEntity.getQuotaExpire(), new Date()));
        clMortgageEntity.setState("40");
        clMortgageEntity.setHalt("F");
        clMortgageEntity.setRealQuota(clWContactsEntity.getBorrowQuota());
        clMortgageEntity.setRealRate(clWContactsEntity.getBorrowRate());
        clMortgageEntity.setUpdated(new Date());
        clMortgageEntity.setDyBuyPrice(new BigDecimal(0));
        clMortgageEntity.setMarketValue(new BigDecimal(0));
        clMortgageEntity.setDyArea(new BigDecimal(0));
        return clMortgageEntity;
    }
}
