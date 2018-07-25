/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import org.loan.core.domain.SpUserEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: SpUserService.java, v 0.1 2018年4月13日 上午10:34:31 jinlilong Exp $
 */
public interface SpUserService {

    /**
     * 根据cl_user_id 同步数据到sp_user
     * @param clUserId
     */
    public Long saveOrUpdateSpUser(long clUserId);

    /**
     * 根据手机号更新spuser
     * @param phone
     */
    public void updateSpUserUserId(String phone, Long clUserId);

    /**
     * 根据cluserId 查询spuser
     * @param clUserId
     * @return
     */
    public SpUserEntity querySpUserByClUserId(Long clUserId);

    /**
     * 查询用户合同号  序号
     * @param clUserId
     * @return
     */
    public String queryUserContractNum(Long clUserId);
}
