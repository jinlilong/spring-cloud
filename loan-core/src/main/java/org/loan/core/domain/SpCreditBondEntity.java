package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 审批担保人信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
public class SpCreditBondEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //用户标识
    private Long              userId;
    //额度信息id
    private Long              creditId;
    //保证人姓名
    private String            bondName;
    //保证人手机号码
    private String            bondPhone;
    //保证人身份证号码
    private String            bondIdNo;
    //保证人身份证正反面照片
    private String            bondIdIdenImg;
    //担保人状态:0:失效,1:正常
    private String            bondState;
    //添加时间
    private Date              addTime;
    //修改时间
    private Date              updateTime;

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
     * 设置：用户标识
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户标识
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：额度信息id
     */
    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    /**
     * 获取：额度信息id
     */
    public Long getCreditId() {
        return creditId;
    }

    /**
     * 设置：保证人姓名
     */
    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    /**
     * 获取：保证人姓名
     */
    public String getBondName() {
        return bondName;
    }

    /**
     * 设置：保证人手机号码
     */
    public void setBondPhone(String bondPhone) {
        this.bondPhone = bondPhone;
    }

    /**
     * 获取：保证人手机号码
     */
    public String getBondPhone() {
        return bondPhone;
    }

    /**
     * 设置：保证人身份证号码
     */
    public void setBondIdNo(String bondIdNo) {
        this.bondIdNo = bondIdNo;
    }

    /**
     * 获取：保证人身份证号码
     */
    public String getBondIdNo() {
        return bondIdNo;
    }

    /**
     * 设置：保证人身份证正反面照片
     */
    public void setBondIdIdenImg(String bondIdIdenImg) {
        this.bondIdIdenImg = bondIdIdenImg;
    }

    /**
     * 获取：保证人身份证正反面照片
     */
    public String getBondIdIdenImg() {
        return bondIdIdenImg;
    }

    /**
     * 设置：担保人状态:0:失效,1:正常
     */
    public void setBondState(String bondState) {
        this.bondState = bondState;
    }

    /**
     * 获取：担保人状态:0:失效,1:正常
     */
    public String getBondState() {
        return bondState;
    }

    /**
     * 设置：添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取：添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置：修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }
}
