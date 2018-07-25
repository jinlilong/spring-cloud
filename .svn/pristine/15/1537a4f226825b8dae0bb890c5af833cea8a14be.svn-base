package org.loan.core.common.model;

import java.util.List;

import lombok.Data;

/**
 * @author liuzx
 * @desc 审核风控解析结果
 * @create 2018-07-05 11:39
 */
@Data
public class ApprovalRuleAnalysis {

    /**
     * 多头借贷次数
     */
    private Integer       seven_days_platform_count = 0;

    /**
     * 手机归属地
     */
    private String        phone_attribution;

    /**
     * 信贷逾期次数
     */
    private List<Integer> discredit_times;

    /**
     * 黑中介分数
     */
    private Integer       phone_gray_score          = 0;

    /**
     * 入网时长
     */
    private Integer       net_time                  = 0;

    /**
     * 居住地址
     */
    private String        live_address;

    /**
     * 工作地址
     */
    private String        work_address;

    /**
     * 是否违法
     */
    private boolean       Illegal                   = Boolean.FALSE;

}
