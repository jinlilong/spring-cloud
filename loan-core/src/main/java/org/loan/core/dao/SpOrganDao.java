package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpOrganEntity;
import org.springframework.stereotype.Repository;

/**
 * 组织表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
@Repository
public interface SpOrganDao extends BaseDao<SpOrganEntity> {
    /**
     * 通过机构code查询机构实体
     * @param code 机构code
     *             @return SpOrganEntity
     * */
    SpOrganEntity queryByCode(String code);

}
