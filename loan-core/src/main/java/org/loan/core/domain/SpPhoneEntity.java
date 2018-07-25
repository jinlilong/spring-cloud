package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-13 15:36:34
 */
public class SpPhoneEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long              id;
    //手机号
    private String            phone;
    //线下名单：0，线上名单：1
    private String            type;
    //短信发送条数
    private Integer           msgTotal;
    //成功条数
    private Integer           msgSuccess;
    //失败条数
    private Integer           msgFail;
    //最后一次发送时间
    private Date              lastSendTime;
    //创建时间
    private Date              createTime;

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
     * 设置：手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取：手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置：线下名单：0，线上名单：1
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：线下名单：0，线上名单：1
     */
    public String getType() {
        return type;
    }

    /**
     * 设置：短信发送条数
     */
    public void setMsgTotal(Integer msgTotal) {
        this.msgTotal = msgTotal;
    }

    /**
     * 获取：短信发送条数
     */
    public Integer getMsgTotal() {
        return msgTotal;
    }

    /**
     * 设置：成功条数
     */
    public void setMsgSuccess(Integer msgSuccess) {
        this.msgSuccess = msgSuccess;
    }

    /**
     * 获取：成功条数
     */
    public Integer getMsgSuccess() {
        return msgSuccess;
    }

    /**
     * 设置：失败条数
     */
    public void setMsgFail(Integer msgFail) {
        this.msgFail = msgFail;
    }

    /**
     * 获取：失败条数
     */
    public Integer getMsgFail() {
        return msgFail;
    }

    /**
     * 设置：最后一次发送时间
     */
    public void setLastSendTime(Date lastSendTime) {
        this.lastSendTime = lastSendTime;
    }

    /**
     * 获取：最后一次发送时间
     */
    public Date getLastSendTime() {
        return lastSendTime;
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
}
