package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClWContactsEntity;
import org.springframework.stereotype.Repository;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface ClWContactsDao extends BaseDao<ClWContactsEntity> {

    /**
     * 根据手机号查询白名单
     * @param phone
     * @return
     */
    public ClWContactsEntity queryByPhone(String phone);

}
