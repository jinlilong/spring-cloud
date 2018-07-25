package org.loan.core.domain;

import java.io.Serializable;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClDownloadCountUrlEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //id
    private Integer           id;
    //url
    private String            url;

    /**
     * 设置：id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取：url
     */
    public String getUrl() {
        return url;
    }
}
