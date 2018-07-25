package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpSysUserEntity;
import org.springframework.stereotype.Repository;

/**
 * 系统用户表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-14 18:49:40
 */
@Repository
public interface SpSysUserDao extends BaseDao<SpSysUserEntity> {

    /**
     * 查询系统用户表
     * @param workNumber
     * @return
     */
    SpSysUserEntity querySpSysUser(String workNumber);

}
