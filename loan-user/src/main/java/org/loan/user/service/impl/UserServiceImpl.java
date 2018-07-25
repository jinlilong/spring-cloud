/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.user.service.impl;

import org.loan.core.common.constant.RedisKeyConstants;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.model.UserContext;
import org.loan.core.common.utils.NidGenerator;
import org.loan.core.domain.ClUserEntity;
import org.loan.core.service.RedisService;
import org.loan.core.service.UserCoreService;
import org.loan.core.service.impl.RedisServiceImpl;
import org.loan.user.model.req.UserLoginReq;
import org.loan.user.model.resp.UserLoginResp;
import org.loan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: UserServiceImpl.java, v 0.1 2018年7月19日 下午2:44:14 jinlilong Exp $
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /**  */
    @Autowired
    private UserCoreService userCoreService;

    /**  */
    @Autowired
    private RedisService    redisService;

    /** 
     * @see org.loan.user.service.UserService#login(java.lang.Long)
     */
    @Override
    public UserLoginResp login(UserLoginReq req) {
        ClUserEntity clUser = userCoreService.queryUser(req.getLoginName());
        if (clUser == null) {
            throw new ServiceException("登录账号不存在,请重新输入");
        }

        UserLoginResp userLoginResp = new UserLoginResp();
        userLoginResp.setToken(NidGenerator.getUuId());

        //保存用户上下文
        UserContext userContext = new UserContext();
        userContext.setLoginName(clUser.getLoginName());
        userContext.setUserId(clUser.getId());
        redisService.set(RedisKeyConstants.REDIS_USER_TOKEN + userLoginResp.getToken(), userContext,
            RedisServiceImpl.TOKEN_TIME_OUT);

        return userLoginResp;
    }

}
