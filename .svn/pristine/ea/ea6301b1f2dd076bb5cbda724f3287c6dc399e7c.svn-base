package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpUserSpouseEntity;
import org.springframework.stereotype.Repository;

/**
 * 用户配偶信息
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
@Repository
public interface SpUserSpouseDao extends BaseDao<SpUserSpouseEntity> {

    /**
     * 根据审批用户id查配偶信息
     * @param spUserId
     * @return SpUserSpouseEntity
     * */
    SpUserSpouseEntity querySpouseBySpUserId(Long spUserId);
}
