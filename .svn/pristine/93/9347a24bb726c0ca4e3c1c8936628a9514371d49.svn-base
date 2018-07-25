/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.math.BigDecimal;

import org.loan.core.domain.ArcCreditEntity;
import org.loan.core.domain.ClUserBaseInfoEntity;
import org.loan.core.domain.ClUserEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: ClUserCoreService.java, v 0.1 2018年3月30日 上午10:52:51 jinlilong Exp $
 */
public interface ClUserCoreService {

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    public ClUserEntity queryClUser(Long id);

    /**
     * 校验用户是否被冻结
     * @param clUserId
     * @return
     */
    public ArcCreditEntity queryUserIsFrozen(Long clUserId);

    /**
     * 查询用户的最大可用额度
     * @param clUserId
     * @return
     */
    public BigDecimal queryUserUnUseCredit(Long clUserId);

    /**
     * 校验用户密码交易密码是否正确
     * @param userId
     * @param pwd
     */
    public void checkPwd(Long userId, String pwd);

    /**
     * 校验是否黑名单用户
     * @param userId
     */
    public void checkIsBlackUser(Long userId);

    /**
     * 根据用户ID查询baseInfo
     * @param userId
     * @return
     */
    public ClUserBaseInfoEntity queryUserBaseInfoByUserId(Long userId);

    /**
     * 更新用户为已认证状态
     * @param userId
     */
    public void updateUserAuth(Long userId);

    /**
     * 更新用户的身份信息
     * @param userId
     * @param realName
     * @param idNo
     */
    public void updateUserBaseInfo(Long userId, String realName, String idNo, String phone);

}
