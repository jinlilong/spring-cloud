package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 风控规则配置表
 *
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-07-05 15:51:00
 */
public class RiskRuleEntity implements Serializable {
    private static final long   serialVersionUID            = 1L;

    public static final Integer RISK_RULE_OF_REJECTED_ORDER = 0;

    //规则主键
    private Long                id;
    //规则名称
    private String              ruleName;
    //规则优先级，越大优先级越高
    private Integer             priority;
    //分组类型 如:rejected_order
    private Integer             groupType;
    //分组名称 如：拒单
    private String              groupName;
    //规则执行内容
    private String              executeContent;
    //是否删除 0 未删除 1已删除
    private Integer             delFlag;
    //操作时间
    private Date                opTime;

    /**
     * 设置：规则主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：规则主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：规则名称
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * 获取：规则名称
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * 设置：规则优先级，越大优先级越高
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取：规则优先级，越大优先级越高
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置：分组类型 如:rejected_order
     */
    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    /**
     * 获取：分组类型 如:rejected_order
     */
    public Integer getGroupType() {
        return groupType;
    }

    /**
     * 设置：分组名称 如：拒单
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 获取：分组名称 如：拒单
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置：规则执行内容
     */
    public void setExecuteContent(String executeContent) {
        this.executeContent = executeContent;
    }

    /**
     * 获取：规则执行内容
     */
    public String getExecuteContent() {
        return executeContent;
    }

    /**
     * 设置：是否删除 0 未删除 1已删除
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取：是否删除 0 未删除 1已删除
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置：操作时间
     */
    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    /**
     * 获取：操作时间
     */
    public Date getOpTime() {
        return opTime;
    }
}
