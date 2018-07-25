package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * banner配置
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-07-05 13:43:47
 */
public class ClBannerConfigEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long              id;
    //banner标题
    private String            title;
    //banner url
    private String            url;
    //排序
    private Integer           sort;
    //类型  0:适用所有，1：线上用户， 2：线下用户
    private String            type;
    //状态，1：启用，0：停用
    private String            state;
    //创建时间
    private Date              createTime;
    //创建人
    private String            addName;
    //活动开始时间
    private Date              startTime;

    //活动结束时间
    private Date              endTime;

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
     * 设置：banner标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取：banner标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置：banner url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取：banner url
     */
    public String getUrl() {
        return url;
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
     * 设置：类型  0:适用所有，1：线上用户， 2：线下用户
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：类型  0:适用所有，1：线上用户， 2：线下用户
     */
    public String getType() {
        return type;
    }

    /**
     * 设置：状态，1：启用，0：停用
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：状态，1：启用，0：停用
     */
    public String getState() {
        return state;
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
     * 设置：创建人
     */
    public void setAddName(String addName) {
        this.addName = addName;
    }

    /**
     * 获取：创建人
     */
    public String getAddName() {
        return addName;
    }

    /**
     * 设置：活动开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取：活动开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Getter method for property <tt>endTime</tt>.
     * 
     * @return property value of endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Setter method for property <tt>endTime</tt>.
     * 
     * @param endTime value to be assigned to property endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

}
