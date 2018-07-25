package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 批量短信任务
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-13 14:07:08
 */
public class SpSmsRecordEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long              id;
    //短信模板ID
    private Long              smsTplId;
    //批次发送数量
    private Integer           counts;
    //成功次数
    private Integer           successCounts;
    //创建时间
    private Date              createTime;
    //短信通道名称,,,华信： HX
    private String            channelCode;
    //转化率
    private BigDecimal        percent;
    //1：成功，0：失败，2：部分成功
    private String            state;
    //订单号
    private String            taskId;
    //短信内容
    private String            content;
    //成功率
    private BigDecimal        successRate;

    /**
     * 设置：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：短信模板ID
     */
    public void setSmsTplId(Long smsTplId) {
        this.smsTplId = smsTplId;
    }

    /**
     * 获取：短信模板ID
     */
    public Long getSmsTplId() {
        return smsTplId;
    }

    /**
     * 设置：批次发送数量
     */
    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    /**
     * 获取：批次发送数量
     */
    public Integer getCounts() {
        return counts;
    }

    /**
     * 设置：成功次数
     */
    public void setSuccessCounts(Integer successCounts) {
        this.successCounts = successCounts;
    }

    /**
     * 获取：成功次数
     */
    public Integer getSuccessCounts() {
        return successCounts;
    }

    /**
     * 设置：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：短信通道名称,,,华信： HX
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    /**
     * 获取：短信通道名称,,,华信： HX
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * 设置：转化率
     */
    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    /**
     * 获取：转化率
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * 设置：1：成功，0：失败，2：部分成功
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：1：成功，0：失败，2：部分成功
     */
    public String getState() {
        return state;
    }

    /**
     * 设置：订单号
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取：订单号
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 设置：短信内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取：短信内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置：成功率
     */
    public void setSuccessRate(BigDecimal successRate) {
        this.successRate = successRate;
    }

    /**
     * 获取：成功率
     */
    public BigDecimal getSuccessRate() {
        return successRate;
    }
}
