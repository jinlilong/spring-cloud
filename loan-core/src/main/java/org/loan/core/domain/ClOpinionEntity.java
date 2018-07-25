package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 意见反馈表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClOpinionEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//用户标识
	private Long userId;
	//意见
	private String opinion;
	//管理员标识
	private Long sysUserId;
	//反馈
	private String feedback;
	//状态 10待确认，20已确认
	private String state;
	//create_time
	private Date createTime;
	//
	private Date confirmTime;

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
	 * 设置：意见
	 */
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	/**
	 * 获取：意见
	 */
	public String getOpinion() {
		return opinion;
	}
	/**
	 * 设置：管理员标识
	 */
	public void setSysUserId(Long sysUserId) {
		this.sysUserId = sysUserId;
	}
	/**
	 * 获取：管理员标识
	 */
	public Long getSysUserId() {
		return sysUserId;
	}
	/**
	 * 设置：反馈
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	/**
	 * 获取：反馈
	 */
	public String getFeedback() {
		return feedback;
	}
	/**
	 * 设置：状态 10待确认，20已确认
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 获取：状态 10待确认，20已确认
	 */
	public String getState() {
		return state;
	}
	/**
	 * 设置：create_time
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}
	/**
	 * 获取：
	 */
	public Date getConfirmTime() {
		return confirmTime;
	}
}
