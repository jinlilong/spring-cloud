package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class SpCreditEffectEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long              id;
    //
    private Date              createTime;
    //
    private String            createName;
    //
    private Date              updateTime;
    //
    private String            updateName;
    //
    private String            createId;
    //额度审批id
    private Long              creditId;
    //流程状态
    private String            status;
    //任务名称
    private String            title;
    //可编辑状态,1:可编辑，1：不可
    private String            editState;

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
     * 设置：
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * 获取：
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置：
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置：
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    /**
     * 获取：
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 设置：
     */
    public void setCreateId(String createId) {
        this.createId = createId;
    }

    /**
     * 获取：
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * 设置：额度审批id
     */
    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    /**
     * 获取：额度审批id
     */
    public Long getCreditId() {
        return creditId;
    }

    /**
     * 设置：流程状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取：流程状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置：任务名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取：任务名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置：可编辑状态,1:可编辑，1：不可
     */
    public void setEditState(String editState) {
        this.editState = editState;
    }

    /**
     * 获取：可编辑状态,1:可编辑，1：不可
     */
    public String getEditState() {
        return editState;
    }
}
