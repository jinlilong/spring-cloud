/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.constant.SpConfigKeyConstants;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.dao.SpConfigDao;
import org.loan.core.domain.SpConfigEntity;
import org.loan.core.service.RedisService;
import org.loan.core.service.SpConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: SpConfigServiceImpl.java, v 0.1 2018年3月29日 下午6:01:14 jinlilong Exp $
 */
@Service("spConfigService")
public class SpConfigServiceImpl implements SpConfigService {

    /**  */
    @Autowired
    private SpConfigDao  spConfigDao;

    /**  */
    @Autowired
    private RedisService redisService;

    /** 
     * @see com.hwc.framework.modules.service.SpConfigService#querySpConfigByKey(long)
     */
    @Override
    public SpConfigEntity querySpConfigByKey(String key) {
        SpConfigEntity entity = redisService.get(key, SpConfigEntity.class);
        if (entity == null) {
            entity = spConfigDao.queryByKey(key);
            redisService.set(key, entity);
        }
        if (entity == null) {
            throw new ServiceException("查询系统配置参数不存在");
        }
        return entity;
    }

    /** 
     * @see com.hwc.framework.modules.service.SpConfigService#queryIsCanBorrow()
     */
    @Override
    public void queryIsCanBorrow() {
        SpConfigEntity entity = querySpConfigByKey(SpConfigKeyConstants.SYSTEM_BORROW_OPEN);
        if (entity != null && StringUtils.equals(entity.getValue(), BaseBizConstants.ZERO)) {
            throw new ServiceException("系统正在维护中，暂时无法借款，请联系我们的业务人员");
        }
    }

}
