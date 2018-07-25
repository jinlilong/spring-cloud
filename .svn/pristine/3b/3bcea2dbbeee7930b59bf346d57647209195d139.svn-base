package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpUserEntity;
import org.springframework.stereotype.Repository;

/**
 * 系统用户表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
@Repository
public interface SpUserDao extends BaseDao<SpUserEntity> {
    /**
     * 根据身份证号查询SpUser
     * @param idNo
     * @return
     */
    public SpUserEntity querySpUserByPhone(String phone);

    /**
     * 根据cluserId 查询spuser
     * @param clUserId
     * @return
     */
    public SpUserEntity querySpUserByClUserId(Long clUserId);
}
