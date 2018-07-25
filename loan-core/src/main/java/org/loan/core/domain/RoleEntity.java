package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 角色表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class RoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键id
	private Integer id;
	//序号
	private Integer num;
	//父角色id
	private Integer pid;
	//角色名称
	private String name;
	//部门名称
	private Integer deptid;
	//提示
	private String tips;
	//保留字段(暂时没用）
	private Integer version;

	/**
	 * 设置：主键id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：序号
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * 获取：序号
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 * 设置：父角色id
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * 获取：父角色id
	 */
	public Integer getPid() {
		return pid;
	}
	/**
	 * 设置：角色名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：角色名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：部门名称
	 */
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	/**
	 * 获取：部门名称
	 */
	public Integer getDeptid() {
		return deptid;
	}
	/**
	 * 设置：提示
	 */
	public void setTips(String tips) {
		this.tips = tips;
	}
	/**
	 * 获取：提示
	 */
	public String getTips() {
		return tips;
	}
	/**
	 * 设置：保留字段(暂时没用）
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	/**
	 * 获取：保留字段(暂时没用）
	 */
	public Integer getVersion() {
		return version;
	}
}
