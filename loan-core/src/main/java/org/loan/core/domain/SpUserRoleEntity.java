package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户角色关系表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:37
 */
public class SpUserRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//用户id
	private String userId;
	//角色id
	private String roleId;

	/**
	 * 设置：用户id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：角色id
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：角色id
	 */
	public String getRoleId() {
		return roleId;
	}
}
