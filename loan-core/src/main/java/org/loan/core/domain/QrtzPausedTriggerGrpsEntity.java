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
public class QrtzPausedTriggerGrpsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String schedName;
	//
	private String triggerGroup;

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
	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}
	/**
	 * 获取：
	 */
	public String getTriggerGroup() {
		return triggerGroup;
	}
}
