package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-04-08 09:33:29
 */
public class SpCreditPeriodsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//额度Id
	private Long id;
	//
	private Long creditId;
	//还款方式，0，等额本金，1:等额本息,2:先息后本,3:等本等息，详情见枚举RepaymentMethodEnums，使用时请使用枚举。可多选，多个以逗号隔开
	private String repayment;
	//分期期数
	private String periods;
	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private String creator;
	//
	private String modifer;

	/**
	 * 设置：额度Id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：额度Id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}
	/**
	 * 获取：
	 */
	public Long getCreditId() {
		return creditId;
	}
	/**
	 * 设置：还款方式，0，等额本金，1:等额本息,2:先息后本,3:等本等息，详情见枚举RepaymentMethodEnums，使用时请使用枚举。可多选，多个以逗号隔开
	 */
	public void setRepayment(String repayment) {
		this.repayment = repayment;
	}
	/**
	 * 获取：还款方式，0，等额本金，1:等额本息,2:先息后本,3:等本等息，详情见枚举RepaymentMethodEnums，使用时请使用枚举。可多选，多个以逗号隔开
	 */
	public String getRepayment() {
		return repayment;
	}
	/**
	 * 设置：分期期数
	 */
	public void setPeriods(String periods) {
		this.periods = periods;
	}
	/**
	 * 获取：分期期数
	 */
	public String getPeriods() {
		return periods;
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
	 * 设置：
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * 获取：
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * 设置：
	 */
	public void setModifer(String modifer) {
		this.modifer = modifer;
	}
	/**
	 * 获取：
	 */
	public String getModifer() {
		return modifer;
	}
}
