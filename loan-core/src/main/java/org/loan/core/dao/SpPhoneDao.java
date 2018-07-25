package org.loan.core.dao;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpPhoneEntity;
import org.springframework.stereotype.Repository;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-13 15:36:34
 */
@Repository
public interface SpPhoneDao extends BaseDao<SpPhoneEntity> {

    /**
     * 
     * @param map
     */
    public void updateSpPhoneSuccess(String phone);

    /**
     * 
     * @param map
     */
    public void updateSpPhoneFail(String phone);

    /**
     * 
     * @param phone
     */
    public SpPhoneEntity queryByPhone(String phone);
}
