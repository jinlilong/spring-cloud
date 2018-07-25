/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.math.BigDecimal;

import org.apache.commons.codec.digest.DigestUtils;
import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.dao.ArcCreditDao;
import org.loan.core.dao.ClUserAuthDao;
import org.loan.core.dao.ClUserBaseInfoDao;
import org.loan.core.dao.ClUserDao;
import org.loan.core.domain.ArcCreditEntity;
import org.loan.core.domain.ClUserAuthEntity;
import org.loan.core.domain.ClUserBaseInfoEntity;
import org.loan.core.domain.ClUserEntity;
import org.loan.core.service.ClUserCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: ClUserCoreServiceImpl.java, v 0.1 2018年3月30日 上午10:57:17 jinlilong Exp $
 */
@Service("clUserCoreService")
public class ClUserCoreServiceImpl implements ClUserCoreService {

    /**  */
    @Autowired
    private ClUserDao         clUserDao;

    /**  */
    @Autowired
    private ArcCreditDao      arcCreditDao;

    /**  */
    @Autowired
    private ClUserBaseInfoDao clUserBaseInfoDao;

    @Autowired
    private ClUserAuthDao     clUserAuthDao;

    /** 
     * @see com.hwc.framework.modules.service.ClUserCoreService#queryClUser(java.lang.Long)
     */
    @Override
    public ClUserEntity queryClUser(Long id) {
        ClUserEntity entity = clUserDao.queryObject(id);
        if (entity == null) {
            throw new ServiceException("查询用户不存在");
        }
        return entity;
    }

    /** 
     * @see com.hwc.framework.modules.service.ClUserCoreService#queryUserIsFrozen(java.lang.Long)
     */
    @Override
    public ArcCreditEntity queryUserIsFrozen(Long clUserId) {
        ArcCreditEntity arcCreditEntity = arcCreditDao.queryCreditByUserId(clUserId);
        if (arcCreditEntity == null) {
            throw new ServiceException("查询用户不存在");
        }
        //状态10 正常，20冻结
        if (StringUtils.equals(arcCreditEntity.getState(), BaseBizConstants.STATE_20)) {
            throw new ServiceException("此用户额度已被冻结,请联系我们的工作人员");
        }
        return arcCreditEntity;
    }

    /** 
     * @see com.hwc.framework.modules.service.ClUserCoreService#queryUserUnUseCredit(java.lang.Long)
     */
    @Override
    public BigDecimal queryUserUnUseCredit(Long clUserId) {
        ArcCreditEntity arcCreditEntity = queryUserIsFrozen(clUserId);
        //校验额度是否正确
        /*BigDecimal total = arcCreditEntity.getUnuse().add(arcCreditEntity.getUsed());
        if (total.doubleValue() != arcCreditEntity.getTotal().doubleValue()) {
            throw new ServiceException("额度异常，请联系客服");
        }*/
        return arcCreditEntity.getUnuse();
    }

    /** 
     * @see com.hwc.framework.modules.service.ClUserCoreService#checkPwd(java.lang.Long, java.lang.String)
     */
    @Override
    public void checkPwd(Long userId, String pwd) {
        ClUserEntity clUserEntity = clUserDao.queryObject(userId);
        if (clUserEntity == null) {
            throw new ServiceException("查询用户不存在");
        }
        if (StringUtils.isEmpty(clUserEntity.getTradePwd())) {
            throw new ServiceException("您还未设置交易密码");
        }
        if (!StringUtils.equals(clUserEntity.getTradePwd(), DigestUtils.md5Hex(pwd))) {
            throw new ServiceException("您输入的交易密码不正确!请重新输入");
        }
    }

    /** 
     * @see com.hwc.framework.modules.service.ClUserCoreService#checkIsBlackUser(java.lang.Long)
     */
    @Override
    public void checkIsBlackUser(Long userId) {
        ClUserBaseInfoEntity entity = queryUserBaseInfoByUserId(userId);
        if (!"20".equals(entity.getState())) {
            throw new ServiceException("很抱歉，您暂不可申请，请联系客服!");
        }
    }

    /** 
     * @see com.hwc.framework.modules.service.ClUserCoreService#queryUserBaseInfoByUserId(java.lang.Long)
     */
    @Override
    public ClUserBaseInfoEntity queryUserBaseInfoByUserId(Long userId) {
        ClUserBaseInfoEntity entity = clUserBaseInfoDao.queryObjectByUserId(userId);
        if (entity == null) {
            throw new ServiceException("用户还未完成实名认证");
        }
        return entity;
    }

    /** 
     * @see com.hwc.framework.modules.service.ClUserCoreService#updateUserAuth(java.lang.Long)
     */
    @Override
    public void updateUserAuth(Long userId) {
        ClUserAuthEntity clUserAuthEntity = clUserAuthDao.queryByUserId(userId);
        clUserAuthEntity.setBankCardState("30");
        clUserAuthEntity.setContactState("30");
        clUserAuthEntity.setIdState("30");
        clUserAuthEntity.setPhoneState("30");
        clUserAuthDao.update(clUserAuthEntity);
    }

    /**
     * 
     * @param userId
     * @param realName
     * @param idNo
     */
    @Override
    public void updateUserBaseInfo(Long userId, String realName, String idNo, String phone) {
        ClUserBaseInfoEntity baseInfo = clUserBaseInfoDao.queryObjectByUserId(userId);
        baseInfo.setIdNo(idNo);
        baseInfo.setRealName(realName);
        baseInfo.setPhone(phone);
        clUserBaseInfoDao.update(baseInfo);
    }

}
