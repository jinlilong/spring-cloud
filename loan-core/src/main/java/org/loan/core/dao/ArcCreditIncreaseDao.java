package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ArcCreditIncreaseEntity;
import org.springframework.stereotype.Repository;

/**
 * 提额或减额记录
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-15 13:09:20
 */
@Repository
public interface ArcCreditIncreaseDao extends BaseDao<ArcCreditIncreaseEntity> {

    /**
     * 查询用户最后一条变更记录
     * @param userId
     * @return
     */
    ArcCreditIncreaseEntity queryLastByUserId(Long userId);

}
