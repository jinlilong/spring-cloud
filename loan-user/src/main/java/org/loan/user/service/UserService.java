/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.user.service;

import org.loan.user.model.req.UserLoginReq;
import org.loan.user.model.resp.UserLoginResp;

/**
 * 
 * @author jinlilong
 * @version $Id: UserService.java, v 0.1 2018年7月19日 下午2:44:46 jinlilong Exp $
 */
public interface UserService {

    /**
     * 
     * @param userId
     * @return
     */
    UserLoginResp login(UserLoginReq req);
}
