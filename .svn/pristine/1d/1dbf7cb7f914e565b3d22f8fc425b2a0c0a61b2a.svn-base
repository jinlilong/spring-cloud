/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import org.loan.core.dao.ClUserDao;
import org.loan.core.domain.ClUserEntity;
import org.loan.core.service.UserCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: UserServiceImpl.java, v 0.1 2018年7月19日 下午2:57:18 jinlilong Exp $
 */
@Service("userCoreService")
public class UserCoreServiceImpl implements UserCoreService {

    /**  */
    @Autowired
    private ClUserDao clUserDao;

    /** 
     * @see org.loan.core.service.UserCoreService#queryUser(java.lang.Long)
     */
    @Override
    public ClUserEntity queryUser(String loginName) {
        return clUserDao.queryUser(loginName);
    }

}
