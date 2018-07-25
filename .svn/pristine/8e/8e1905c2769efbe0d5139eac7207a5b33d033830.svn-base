package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 定时任务执行记录表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClQuartzLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //定时任务id
    private Long              quartzId;
    //启动时间
    private Date              startTime;
    //任务用时
    private Integer           time;
    //执行是否成功 10-成功 20-失败
    private String            result;
    //备注信息
    private String            remark;

    /**
     * 设置：主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：定时任务id
     */
    public void setQuartzId(Long quartzId) {
        this.quartzId = quartzId;
    }

    /**
     * 获取：定时任务id
     */
    public Long getQuartzId() {
        return quartzId;
    }

    /**
     * 设置：启动时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取：启动时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置：任务用时
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 获取：任务用时
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 设置：执行是否成功 10-成功 20-失败
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取：执行是否成功 10-成功 20-失败
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置：备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：备注信息
     */
    public String getRemark() {
        return remark;
    }
}
