/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import org.loan.core.domain.SpConfigEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: SpConfigService.java, v 0.1 2018年3月29日 下午6:00:17 jinlilong Exp $
 */
public interface SpConfigService {

    /**
     * 根据id查询SpConfig
     * @param id
     * @return
     */
    public SpConfigEntity querySpConfigByKey(String key);

    /**
     * 查询当前是否开启了借款
     */
    public void queryIsCanBorrow();
}
