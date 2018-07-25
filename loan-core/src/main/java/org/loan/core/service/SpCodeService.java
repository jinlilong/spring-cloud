/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.util.List;

import org.loan.core.domain.SpCodeEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: SpCodeService.java, v 0.1 2018年4月17日 上午10:39:36 jinlilong Exp $
 */
public interface SpCodeService {

    /**
     * 根据parent code 查询code list
     * @param code
     * @return
     */
    public List<SpCodeEntity> queryCodeListByParentCode(String code);

}
