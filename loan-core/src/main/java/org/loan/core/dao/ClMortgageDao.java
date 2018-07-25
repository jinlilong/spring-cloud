package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClMortgageEntity;
import org.springframework.stereotype.Repository;

/**
 * 抵押物记录
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface ClMortgageDao extends BaseDao<ClMortgageEntity> {

    /**
     * 根据userId 查询车位信息
     * @param clUserId
     * @return
     */
    public ClMortgageEntity queryByUserId(Long clUserId);

    /**
     * 根据mobile 查询车位信息
     * @param clUserId
     * @return
     */
    public ClMortgageEntity queryByMobile(String mobile);
}
