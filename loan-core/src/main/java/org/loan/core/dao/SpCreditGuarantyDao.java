package org.loan.core.dao;

import java.util.List;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpCreditGuarantyEntity;
import org.springframework.stereotype.Repository;

/**
 * 审批额度担抵押（车位）信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
@Repository
public interface SpCreditGuarantyDao extends BaseDao<SpCreditGuarantyEntity> {

    /**
     * 根据审批用户id查询车位信息
     * @param spUserId
     * @return SpCreditGuarantyEntity
     * */
    List<SpCreditGuarantyEntity> queryBySpUserId(Long spUserId);
}
