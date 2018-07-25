package org.loan.core.dao;

import java.util.Map;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpSmsRecordListEntity;
import org.springframework.stereotype.Repository;

/**
 * 营销短信发送记录
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-13 14:07:08
 */
@Repository
public interface SpSmsRecordListDao extends BaseDao<SpSmsRecordListEntity> {

    /**
     * 根据手机号，taskId，更新状态
     * @param map
     */
    public void updateByTaskIdAndPhone(Map<String, Object> map);

}
