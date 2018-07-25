package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:38:00
 */
public class QrtzSchedulerStateEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String schedName;
	//
	private String instanceName;
	//
	private Long lastCheckinTime;
	//
	private Long checkinInterval;

	/**
	 * 设置：
	 */
	public void setSchedName(String schedName) {
		this.schedName = schedName;
	}
	/**
	 * 获取：
	 */
	public String getSchedName() {
		return schedName;
	}
	/**
	 * 设置：
	 */
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
	/**
	 * 获取：
	 */
	public String getInstanceName() {
		return instanceName;
	}
	/**
	 * 设置：
	 */
	public void setLastCheckinTime(Long lastCheckinTime) {
		this.lastCheckinTime = lastCheckinTime;
	}
	/**
	 * 获取：
	 */
	public Long getLastCheckinTime() {
		return lastCheckinTime;
	}
	/**
	 * 设置：
	 */
	public void setCheckinInterval(Long checkinInterval) {
		this.checkinInterval = checkinInterval;
	}
	/**
	 * 获取：
	 */
	public Long getCheckinInterval() {
		return checkinInterval;
	}
}
