package org.loan.core.dao;

import java.util.Map;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClSmsEntity;
import org.springframework.stereotype.Repository;

/**
 * 短信发送记录表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface ClSmsDao extends BaseDao<ClSmsEntity> {

    /**
     * 查询最新一条短信记录
     * @param data
     * @return
     */
    ClSmsEntity findTimeMsg(Map<String, Object> data);
}
