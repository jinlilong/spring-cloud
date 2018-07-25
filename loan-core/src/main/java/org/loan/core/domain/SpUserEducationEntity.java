package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户受教育情况
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
public class SpUserEducationEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//用户id
	private Long userId;
	//开始时间
	private Date startTime;
	//结束时间
	private Date stopTime;
	//就读学校
	private String school;
	//所获学位
	private String education;
	//所获奖励
	private String reward;
	//备注
	private String remarks;
	//创建时间
	private Date createTime;
	//修改时间
	private Date updateTime;

	/**
	 * 设置：id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * 获取：开始时间
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * 设置：结束时间
	 */
	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getStopTime() {
		return stopTime;
	}
	/**
	 * 设置：就读学校
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	/**
	 * 获取：就读学校
	 */
	public String getSchool() {
		return school;
	}
	/**
	 * 设置：所获学位
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * 获取：所获学位
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * 设置：所获奖励
	 */
	public void setReward(String reward) {
		this.reward = reward;
	}
	/**
	 * 获取：所获奖励
	 */
	public String getReward() {
		return reward;
	}
	/**
	 * 设置：备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注
	 */
	public String getRemarks() {
		return remarks;
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
