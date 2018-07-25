package org.loan.core.common.model;

import lombok.Data;

/**
 * @author liuzx
 * @desc 审核风控条件
 * @create 2018-07-05 11:39
 */
@Data
public class ApprovalRuleConfig {

    /**
     * 多头借贷次数
     */
    private Integer seven_days_platform_count;

    /**
     * 手机归属地
     */
    private String  phone_attribution;

    /**
     * 信贷逾期次数
     */
    private Integer discredit_times;

    /**
     * 黑中介分数
     */
    private Integer phone_gray_score;

    /**
     * 入网时长
     */
    private Integer net_time;

    /**
     * 居住地址
     */
    private String  live_address;

    /**
     * 工作地址
     */
    private String  work_address;

    /**
     * 身份证命中法院失信模糊名单
     */
    private boolean court_discredit;

    /**
     * 身份证命中犯罪通缉名单
     */
    private boolean criminal_wanted;

    /**
     * 身份证命中法院结案模糊名单
     */
    private boolean court_close;

    /**
     * 身份证命中法院执行名单
     */
    private boolean court_executive;

}
