package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClBankCardEntity;
import org.springframework.stereotype.Repository;

/**
 * 银行卡信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface ClBankCardDao extends BaseDao<ClBankCardEntity> {

    /**
     * 根据用户id查询实体
     * @param clUserId
     * @return ClBankCardEntity
     * */
    ClBankCardEntity queryByClUserId(Long clUserId);
}
