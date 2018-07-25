package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpCreditEntity;
import org.springframework.stereotype.Repository;

/**
 * 审批额度信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface SpCreditDao extends BaseDao<SpCreditEntity> {

    /**
     * 根据clUserId查询 SpCreditEntity
     * @param clUserId
     * @return
     */
    public SpCreditEntity querySpCreditByClUserId(Long clUserId);

    /**
     * 根据手机号查询sp_credit
     * @param phone
     * @return
     */
    public SpCreditEntity querySpCreditByPhone(String phone);

}
