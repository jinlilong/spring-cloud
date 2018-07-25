/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.convertor;

import java.util.Date;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.domain.ClUserBaseInfoEntity;
import org.loan.core.domain.ClUserEntity;
import org.loan.core.domain.SpUserEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: SpUserServiceConvertor.java, v 0.1 2018年4月13日 上午10:44:05 jinlilong Exp $
 */
public class SpUserServiceConvertor {

    /**
     * 
     * @param clUserId
     * @param clUserBaseInfoEntity
     * @param spUserEntity
     */
    public static void buildSpUser(long clUserId, ClUserBaseInfoEntity clUserBaseInfoEntity,
                                   SpUserEntity spUserEntity, ClUserEntity clUserEntity) {
        spUserEntity.setPhone(clUserEntity.getLoginName());
        spUserEntity.setIdNo(clUserBaseInfoEntity.getIdNo());
        spUserEntity.setName(clUserBaseInfoEntity.getRealName());
        spUserEntity.setAge(Long.valueOf(clUserBaseInfoEntity.getAge()));
        if (clUserBaseInfoEntity.getSex().equals("男")) {
            spUserEntity.setSex(BaseBizConstants.ZERO);
        } else {
            spUserEntity.setSex(BaseBizConstants.ONE);
        }
        spUserEntity.setEthnic(clUserBaseInfoEntity.getNational());
        spUserEntity.setOrganCode(BaseBizConstants.BASE_ORGAN_CODE);
        spUserEntity.setClUserId(clUserId);
        spUserEntity.setIsDel(0);
        spUserEntity.setCautionState(0);
        spUserEntity.setDefriendState(BaseBizConstants.ONE);
        //设置为网申用户
        spUserEntity.setChannel(Integer.valueOf(BaseBizConstants.ZERO));
        spUserEntity.setCreateTiem(new Date());
    }
}
