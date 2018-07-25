/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import org.loan.core.common.utils.StringUtils;
import org.loan.core.dao.ClUserAuthDao;
import org.loan.core.dao.ClUserDao;
import org.loan.core.domain.ClUserAuthEntity;
import org.loan.core.domain.ClUserEntity;
import org.loan.core.service.UserAuthCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: UserAuthCoreServiceImpl.java, v 0.1 2018年7月4日 下午3:03:54 jinlilong Exp $
 */
@Service("userAuthCoreService")
public class UserAuthCoreServiceImpl implements UserAuthCoreService {

    /**  */
    @Autowired
    private ClUserAuthDao clUserAuthDao;

    @Autowired
    private ClUserDao     clUserDao;

    /** 
     * @see com.hwc.framework.modules.service.UserAuthCoreService#queryUserHaveMoreAuthentication(java.lang.Long)
     */
    @Override
    public boolean queryUserHaveMoreAuthentication(Long userId) {
        ClUserAuthEntity clUserAuthEntity = clUserAuthDao.queryByUserId(userId);
        if (clUserAuthEntity != null) {
            if (StringUtils.equals(clUserAuthEntity.getSecurityState(), "30")
                && StringUtils.equals(clUserAuthEntity.getAccumulationState(), "30")) {
                return true;
            }
        }
        return false;
    }

    /** 
     * @see com.hwc.framework.modules.service.UserAuthCoreService#queryUserHaveAuthentication(java.lang.Long)
     */
    @Override
    public boolean queryUserHaveAuthentication(Long userId) {
        ClUserAuthEntity clUserAuthEntity = clUserAuthDao.queryByUserId(userId);
        if (clUserAuthEntity != null) {
            if (StringUtils.equals(clUserAuthEntity.getIdState(), "30")
                && StringUtils.equals(clUserAuthEntity.getContactState(), "30")
                && StringUtils.equals(clUserAuthEntity.getBankCardState(), "30")
                && StringUtils.equals(clUserAuthEntity.getPhoneState(), "30")) {
                return true;
            }
        }
        return false;
    }

    /** 
     * @see com.hwc.framework.modules.service.UserAuthCoreService#queryUserHaveSetPwd(java.lang.Long)
     */
    @Override
    public boolean queryUserHaveSetPwd(Long userId) {
        ClUserEntity clUserEntity = clUserDao.queryObject(userId);
        if (clUserEntity != null && !StringUtils.isEmpty(clUserEntity.getTradePwd())) {
            return true;
        }
        return false;
    }

}
