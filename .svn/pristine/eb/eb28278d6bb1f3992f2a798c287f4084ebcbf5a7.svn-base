package org.loan.core.dao;

import java.util.Map;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ArcCreditEntity;
import org.springframework.stereotype.Repository;

/**
 * 授信额度表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface ArcCreditDao extends BaseDao<ArcCreditEntity> {

    /**
     * 根据用户ID查询用户额度
     * @param userId
     * @return
     */
    public ArcCreditEntity queryCreditByUserId(Long userId);

    /**
     * 扣除额度
     * @param userId
     * @param amount
     */
    public void subtractQuota(Map<String, Object> map);

}
