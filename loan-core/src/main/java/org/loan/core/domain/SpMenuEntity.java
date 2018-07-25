package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜单表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
public class SpMenuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键id
    private String            id;
    //父菜单id
    private String            parentId;
    //所有父id
    private String            parentIds;
    //菜单名称
    private String            name;
    //菜单链接
    private String            url;
    //菜单图标
    private String            icon;
    //排序
    private Integer           sort;
    //状态（1显示，0隐藏)
    private String            status;
    //权限标识
    private String            permission;
    //备注
    private String            remark;
    //
    private Date              createTime;
    //
    private String            createId;
    //
    private String            updateId;
    //
    private Date              updateTime;
    //
    private String            type;
    //是否展开 true 是 false 否
    private String            open;
    //机构
    private String            bapid;
    //部门
    private String            baid;

    /**
     * 设置：主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取：主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置：父菜单id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取：父菜单id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置：所有父id
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * 获取：所有父id
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * 设置：菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：菜单链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取：菜单链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置：菜单图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取：菜单图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置：排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取：排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置：状态（1显示，0隐藏)
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取：状态（1显示，0隐藏)
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置：权限标识
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * 获取：权限标识
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置：备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：备注
     */
    public String getRemark() {
        return remark;
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
     * 设置：
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：
     */
    public String getType() {
        return type;
    }

    /**
     * 设置：是否展开 true 是 false 否
     */
    public void setOpen(String open) {
        this.open = open;
    }

    /**
     * 获取：是否展开 true 是 false 否
     */
    public String getOpen() {
        return open;
    }

    /**
     * 设置：机构
     */
    public void setBapid(String bapid) {
        this.bapid = bapid;
    }

    /**
     * 获取：机构
     */
    public String getBapid() {
        return bapid;
    }

    /**
     * 设置：部门
     */
    public void setBaid(String baid) {
        this.baid = baid;
    }

    /**
     * 获取：部门
     */
    public String getBaid() {
        return baid;
    }
}
