package org.loan.core.service;

import java.util.ArrayList;
import java.util.List;

import org.loan.core.common.model.ApprovalRuleConfig;
import org.loan.core.common.model.ApprovalRuleRequest;

/**
 * @author liuzx
 * @desc 分控审核调度器
 * @create 2018-07-05 11:31
 */
public class RiskApprovalRuleChain implements RiskRuleEngineService {

    private final List<RiskRuleEngineService> interceptors = new ArrayList<>();

    private int                               index        = 0;

    public RiskApprovalRuleChain addInterceptor(RiskRuleEngineService interceptor) {
        interceptors.add(interceptor);
        return this;
    }

    @Override
    public void handle(ApprovalRuleRequest ruleRequest, ApprovalRuleConfig ruleConfig,
                       RiskApprovalRuleChain ruleChain) {
        if (index == interceptors.size())
            return;
        RiskRuleEngineService engine = interceptors.get(index);
        index++;
        engine.handle(ruleRequest, ruleConfig, ruleChain);
    }

}
