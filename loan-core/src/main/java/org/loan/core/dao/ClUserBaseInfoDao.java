package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClUserBaseInfoEntity;
import org.springframework.stereotype.Repository;

/**
 * 用户详情表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface ClUserBaseInfoDao extends BaseDao<ClUserBaseInfoEntity> {
    /**
     * 根据userId查询baseinfo
     * @param userId
     * @return
     */
    public ClUserBaseInfoEntity queryObjectByUserId(Long userId);
}
