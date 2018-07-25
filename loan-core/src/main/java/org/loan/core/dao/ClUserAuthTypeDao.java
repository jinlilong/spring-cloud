package org.loan.core.dao;


import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClUserAuthTypeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 认证类型
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-07-20 11:28:43
 */
@Repository
public interface ClUserAuthTypeDao extends BaseDao<ClUserAuthTypeEntity> {

    /**
     * 根据是否启用查询认证项
     * @param isUsed
     * @return
     * */
    List<ClUserAuthTypeEntity> queryListByUse(String isUsed);
	
}
