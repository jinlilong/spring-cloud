/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.util.Date;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.constant.SpConfigKeyConstants;
import org.loan.core.dao.ClUserMessageDao;
import org.loan.core.domain.ClUserMessageEntity;
import org.loan.core.service.ClUserMessageService;
import org.loan.core.service.SpConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: ClUserMessageServiceImpl.java, v 0.1 2018年5月17日 下午3:23:55 jinlilong Exp $
 */
@Service("clUserMessageService")
public class ClUserMessageServiceImpl implements ClUserMessageService {

    /**  */
    @Autowired
    private ClUserMessageDao clUserMessageDao;

    @Autowired
    private SpConfigService  spConfigService;

    /** 
     * @see com.hwc.framework.modules.service.ClUserMessageService#saveUserMessage(java.lang.String, java.lang.Long)
     */
    @Override
    public void saveUserMessage(String content, Long userId) {
        ClUserMessageEntity clUserMessageEntity = new ClUserMessageEntity();
        clUserMessageEntity.setCreateTime(new Date());
        clUserMessageEntity.setMessage(content);
        clUserMessageEntity.setState("0");
        clUserMessageEntity.setUserId(userId);
        clUserMessageDao.save(clUserMessageEntity);
    }

    /** 
     * @see com.hwc.framework.modules.service.ClUserMessageService#queryUserMessage(java.lang.Long)
     */
    @Override
    public String queryUserMessage(Long userId) {
        //查询最新创建的一条消息
        String message = BaseBizConstants.EMTPY_STR;
        ClUserMessageEntity clUserMessageEntity = clUserMessageDao.queryUserMessage(userId);
        if (clUserMessageEntity != null) {
            message = clUserMessageEntity.getMessage();
        } else {
            message = spConfigService.querySpConfigByKey(SpConfigKeyConstants.USER_TIPS_MESSAGE)
                .getValue();
        }
        return message;
    }

}
