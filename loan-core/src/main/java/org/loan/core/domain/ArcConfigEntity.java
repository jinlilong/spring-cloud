package org.loan.core.domain;

import java.io.Serializable;

/**
 * 系统配置表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ArcConfigEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键ID
    private Long              id;
    //类型
    private String            type;
    //参数名称
    private String            name;
    //编号
    private String            code;
    //参数对应的值
    private String            value;
    //
    private Integer           seq;
    //状态  0不启用  1启用
    private String            state;
    //备注说明
    private String            remark;
    //创建者
    private Long              creator;

    /**
     * 设置：主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置：参数名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：参数名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取：编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置：参数对应的值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取：参数对应的值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置：
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取：
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置：状态  0不启用  1启用
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：状态  0不启用  1启用
     */
    public String getState() {
        return state;
    }

    /**
     * 设置：备注说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：备注说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：创建者
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 获取：创建者
     */
    public Long getCreator() {
        return creator;
    }
}
