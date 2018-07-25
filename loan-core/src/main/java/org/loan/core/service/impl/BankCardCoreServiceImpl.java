/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import org.loan.core.dao.ClBankCardDao;
import org.loan.core.domain.ClBankCardEntity;
import org.loan.core.service.BankCardCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: BankCardCoreServiceImpl.java, v 0.1 2018年5月15日 上午9:21:25 jinlilong Exp $
 */
@Service("bankCardCoreService")
public class BankCardCoreServiceImpl implements BankCardCoreService {

    /**  */
    @Autowired
    private ClBankCardDao clBankCardDao;

    /** 
     * @see com.hwc.framework.modules.service.BankCardCoreService#queryUserBankCard(java.lang.Long)
     */
    @Override
    public ClBankCardEntity queryUserBankCard(Long userId) {
        return clBankCardDao.queryByClUserId(userId);
    }

}
