package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 营销短信发送记录
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-13 14:07:08
 */
public class SpSmsRecordListEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long              id;
    //手机号
    private String            phone;
    //批次发送短信ID
    private Long              recordId;
    //短信内容
    private String            content;
    //状态，1:成功，0：失败,-1:未知
    private String            state;
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
     * 设置：批次发送短信ID
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 获取：批次发送短信ID
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 设置：短信内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取：短信内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置：状态，1:成功，0：失败,-1:未知
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：状态，1:成功，0：失败,-1:未知
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
}
