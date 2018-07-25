package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
public class SpProcessEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//小区申请，额度申请对应表主键ID
	private Long tId;
	//小区申请，额度申请类型（village/credit）
	private String tType;
	//状态,0:未处理，1：已同意，2：已驳回,3：已否决
	private String status;
	//
	private Date createTime;
	//
	private Date updateTime;
	//创建人
	private String cretator;
	//创建人id
	private Long cretatorId;
	//备注
	private String remark;
	//流程类型
	private String processType;
	//节点名称(业务经理操作/项目信审/项目复审/项目终审/系统操作）
	private String processName;
	//操作人
	private String modifier;

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
	 * 设置：小区申请，额度申请对应表主键ID
	 */
	public void setTId(Long tId) {
		this.tId = tId;
	}
	/**
	 * 获取：小区申请，额度申请对应表主键ID
	 */
	public Long getTId() {
		return tId;
	}
	/**
	 * 设置：小区申请，额度申请类型（village/credit）
	 */
	public void setTType(String tType) {
		this.tType = tType;
	}
	/**
	 * 获取：小区申请，额度申请类型（village/credit）
	 */
	public String getTType() {
		return tType;
	}
	/**
	 * 设置：状态,0:未处理，1：已同意，2：已驳回,3：已否决
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：状态,0:未处理，1：已同意，2：已驳回,3：已否决
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCretator(String cretator) {
		this.cretator = cretator;
	}
	/**
	 * 获取：创建人
	 */
	public String getCretator() {
		return cretator;
	}
	/**
	 * 设置：创建人id
	 */
	public void setCretatorId(Long cretatorId) {
		this.cretatorId = cretatorId;
	}
	/**
	 * 获取：创建人id
	 */
	public Long getCretatorId() {
		return cretatorId;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：流程类型
	 */
	public void setProcessType(String processType) {
		this.processType = processType;
	}
	/**
	 * 获取：流程类型
	 */
	public String getProcessType() {
		return processType;
	}
	/**
	 * 设置：节点名称(业务经理操作/项目信审/项目复审/项目终审/系统操作）
	 */
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	/**
	 * 获取：节点名称(业务经理操作/项目信审/项目复审/项目终审/系统操作）
	 */
	public String getProcessName() {
		return processName;
	}
	/**
	 * 设置：操作人
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	/**
	 * 获取：操作人
	 */
	public String getModifier() {
		return modifier;
	}
}
