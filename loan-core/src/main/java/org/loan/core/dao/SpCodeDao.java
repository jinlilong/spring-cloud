package org.loan.core.dao;

import java.util.List;
import java.util.Map;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpCodeEntity;
import org.springframework.stereotype.Repository;

/**
 * 系统数据字典
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
@Repository
public interface SpCodeDao extends BaseDao<SpCodeEntity> {

    /**
     * 根据parent code 查询 code
     * @param code
     * @return
     */
    public List<SpCodeEntity> queryCodeListByParentCode(String code);

    /**
     * 根据多个parent code 查询code
     * key是  items  ，值未arraylist类型
     * @param map
     * @return
     */
    public List<SpCodeEntity> queryByParentCodeList(Map<String, Object> map);
}
