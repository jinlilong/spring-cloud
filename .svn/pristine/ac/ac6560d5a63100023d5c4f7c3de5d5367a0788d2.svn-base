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
public class ClPayRespLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //商户订单编号
    private String            orderNo;
    //通知类型   1、TPP同步返回  2、Tpp异步响应
    private Integer           type;
    //Tpp通知信息
    private String            params;
    //添加时间
    private Date              createTime;

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
     * 设置：商户订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取：商户订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置：通知类型   1、TPP同步返回  2、Tpp异步响应
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取：通知类型   1、TPP同步返回  2、Tpp异步响应
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置：Tpp通知信息
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * 获取：Tpp通知信息
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置：添加时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：添加时间
     */
    public Date getCreateTime() {
        return createTime;
    }
}
