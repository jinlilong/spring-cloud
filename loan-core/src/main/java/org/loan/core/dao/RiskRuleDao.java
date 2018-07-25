package org.loan.core.dao;

import java.util.List;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.RiskRuleEntity;
import org.springframework.stereotype.Repository;

/**
 * 风控规则配置表
 *
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-07-05 15:51:00
 */
@Repository
public interface RiskRuleDao extends BaseDao<RiskRuleEntity> {

    /**
     * 根据分组类型查询规则列表
     *
     * @param groupType
     * @return
     */
    List<RiskRuleEntity> queryRuleList(Integer groupType);

}
