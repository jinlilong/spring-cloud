package org.loan.core.domain;

import java.io.Serializable;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-05-16 10:25:03
 */
public class ClFuyouCityCodeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long              id;
    //
    private String            code;
    //地区名称
    private String            name;
    //
    private String            parentCode;

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
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取：
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置：地区名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：地区名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * 获取：
     */
    public String getParentCode() {
        return parentCode;
    }
}
