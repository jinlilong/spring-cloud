/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.util.List;

import org.loan.core.domain.ClMortgageEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: ClMortgageService.java, v 0.1 2018年4月2日 下午3:17:10 jinlilong Exp $
 */
public interface ClMortgageService {

    /**
     * 
     * @param clMortgageMap
     * @return
     */
    List<ClMortgageEntity> queryMortgageByMobile(String phone);

    /**
     * 
     * @param entity
     * @return
     */
    int updateMortgage(ClMortgageEntity entity);

    /**
     * 插入默认的车位的信息
     * @param userId
     * @return
     */
    Long insertDefaultMortgage(Long userId, String mobile);

}
