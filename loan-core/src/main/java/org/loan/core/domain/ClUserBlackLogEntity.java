package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户黑名单日志表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClUserBlackLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long              id;
    //用户ID
    private Long              userId;
    //操作.10拉黑,20解除拉黑,30骗贷拉黑,40逾期拉黑
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
     * 设置：用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：操作.10拉黑,20解除拉黑,30骗贷拉黑,40逾期拉黑
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：操作.10拉黑,20解除拉黑,30骗贷拉黑,40逾期拉黑
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
