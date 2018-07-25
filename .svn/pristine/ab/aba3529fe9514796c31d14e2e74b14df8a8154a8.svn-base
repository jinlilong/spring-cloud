package org.loan.core.dao;

import java.util.List;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClFuyouCityCodeEntity;
import org.springframework.stereotype.Repository;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-05-16 10:25:03
 */
@Repository
public interface ClFuyouCityCodeDao extends BaseDao<ClFuyouCityCodeEntity> {

    /**
     * 根据parentId查询富友 city code
     * @param code
     * @return
     */
    public List<ClFuyouCityCodeEntity> queryFuyouCityCodeByParentId(String code);

    /**
     * 查询一级city code
     * @return
     */
    public List<ClFuyouCityCodeEntity> queryRootFuyouCityCode();

}
