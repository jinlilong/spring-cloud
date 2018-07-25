package org.loan.core.dao;

import java.util.Map;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpPayChannelConfigEntity;
import org.springframework.stereotype.Repository;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-05-14 09:31:05
 */
@Repository
public interface SpPayChannelConfigDao extends BaseDao<SpPayChannelConfigEntity> {

    /**
     * 根据银行code查询配置 查询优先级最高的支付通道
     * @param bankCode
     * @return
     */
    public SpPayChannelConfigEntity queryHighLevelByBankCode(String bankCode);

    /**
     * 查询默认的支付通道
     * @param payCode
     * @return
     */
    public SpPayChannelConfigEntity queryDefaultChannel(Map<String, Object> map);

}
