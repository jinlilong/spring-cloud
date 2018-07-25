/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.util.List;

import org.loan.core.domain.ClFuyouCityCodeEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: ClFuyouCityCodeService.java, v 0.1 2018年5月16日 上午10:30:36 jinlilong Exp $
 */
public interface ClFuyouCityCodeService {

    /**
     * 根据parentId查询富友 city code
     * @param code
     * @return
     */
    public List<ClFuyouCityCodeEntity> queryFuyouCityCodeByParentId(String code);

}
