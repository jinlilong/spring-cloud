package org.loan.core.domain;

import java.io.Serializable;

/**
 * 紧急联系人表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClUserEmerContactsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //联系人
    private String            name;
    //联系号码
    private String            phone;
    //客户表 外键
    private Long              userId;
    //与本人关系
    private String            relation;
    //是否直系
    private String            type;

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
     * 设置：联系人
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：联系人
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：联系号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取：联系号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置：客户表 外键
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：客户表 外键
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：与本人关系
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * 获取：与本人关系
     */
    public String getRelation() {
        return relation;
    }

    /**
     * 设置：是否直系
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：是否直系
     */
    public String getType() {
        return type;
    }
}
