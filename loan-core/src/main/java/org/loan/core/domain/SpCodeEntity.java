package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统数据字典
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
public class SpCodeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private String            id;
    //码值唯一标识, 例如，SEX、SEX_1、SEX_2
    private String            mark;
    //码值的中文表示， 例如：是、否      、性别
    private String            name;
    //码值 的数字表示，例如：1，2，3。。。。。、sex
    private String            value;
    //1：目录 2：字典码
    private String            type;
    //
    private String            parentId;
    //在同一级节点中的序号
    private String            sort;
    //备注，备用字段
    private String            remark;
    //创建人id
    private String            createId;
    //
    private Date              createTime;
    //
    private String            updateId;
    //
    private Date              updateTime;
    //是否展开 true是 false否
    private String            open;

    /**
     * 设置：
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取：
     */
    public String getId() {
        return id;
    }

    /**
     * 设置：码值唯一标识, 例如，SEX、SEX_1、SEX_2
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * 获取：码值唯一标识, 例如，SEX、SEX_1、SEX_2
     */
    public String getMark() {
        return mark;
    }

    /**
     * 设置：码值的中文表示， 例如：是、否      、性别
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：码值的中文表示， 例如：是、否      、性别
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：码值 的数字表示，例如：1，2，3。。。。。、sex
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取：码值 的数字表示，例如：1，2，3。。。。。、sex
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置：1：目录 2：字典码
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：1：目录 2：字典码
     */
    public String getType() {
        return type;
    }

    /**
     * 设置：
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取：
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置：在同一级节点中的序号
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * 获取：在同一级节点中的序号
     */
    public String getSort() {
        return sort;
    }

    /**
     * 设置：备注，备用字段
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：备注，备用字段
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：创建人id
     */
    public void setCreateId(String createId) {
        this.createId = createId;
    }

    /**
     * 获取：创建人id
     */
    public String getCreateId() {
        return createId;
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
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * 获取：
     */
    public String getUpdateId() {
        return updateId;
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
     * 设置：是否展开 true是 false否
     */
    public void setOpen(String open) {
        this.open = open;
    }

    /**
     * 获取：是否展开 true是 false否
     */
    public String getOpen() {
        return open;
    }
}
