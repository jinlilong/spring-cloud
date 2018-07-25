package org.loan.core.domain;

import java.io.Serializable;

/**
 * 角色和菜单关联表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class RelationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Integer           id;
    //菜单id
    private Integer           menuid;
    //角色id
    private Integer           roleid;

    /**
     * 设置：主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：菜单id
     */
    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    /**
     * 获取：菜单id
     */
    public Integer getMenuid() {
        return menuid;
    }

    /**
     * 设置：角色id
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取：角色id
     */
    public Integer getRoleid() {
        return roleid;
    }
}
