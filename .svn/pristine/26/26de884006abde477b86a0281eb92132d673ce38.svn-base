package org.loan.core.service;

import org.loan.core.common.model.ApprovalRuleConfig;
import org.loan.core.common.model.ApprovalRuleRequest;

/**
 * @author liuzx
 * @desc 审核风控规则
 * @create 2018-07-05 11:35
 */
public interface RiskRuleEngineService {

    /**
     * 处理请求的抽象方法
     *
     * @param ruleRequest
     * @param ruleConfig
     * @param ruleChain
     */
    void handle(ApprovalRuleRequest ruleRequest, ApprovalRuleConfig ruleConfig,
                RiskApprovalRuleChain ruleChain);
}
