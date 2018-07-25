package org.loan.core.dao;

import java.util.List;
import java.util.Map;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpCreditPeriodsEntity;
import org.springframework.stereotype.Repository;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-04-08 09:33:29
 */
@Repository
public interface SpCreditPeriodsDao extends BaseDao<SpCreditPeriodsEntity> {

    /**
     * 根据额度表credit_id删除
     * @param creditId
     */
    public void deleteByCreditId(Long creditId);

    /**
     * 根据额度表Id查询分期期数
     * @param creditId
     * @return
     */
    public List<SpCreditPeriodsEntity> queryCreditPeriodsList(Map<String, Object> map);
}
