package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClUserEntity;
import org.springframework.stereotype.Repository;

/**
 * 用户表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface ClUserDao extends BaseDao<ClUserEntity> {

    /**
     * 根据登录名查询账号
     * @param loginName
     * @return
     */
    ClUserEntity queryUser(String loginName);

    /**
     * 根据id查实体
     * @param id
     * @return
     */
    ClUserEntity queryObject(Long id);
}
