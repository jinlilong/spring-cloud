package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 渠道信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClChannelEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键Id
	private Long id;
	//渠道代码
	private String code;
	//渠道名称
	private String name;
	//联系人
	private String linker;
	//联系电话
	private String phone;
	//渠道类型   10 推广渠道,20 应用市场
	private String type;
	//状态 10：启用20：禁用
	private String state;
	//添加时间
	private Date createTime;

	/**
	 * 设置：主键Id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键Id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：渠道代码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：渠道代码
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：渠道名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：渠道名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：联系人
	 */
	public void setLinker(String linker) {
		this.linker = linker;
	}
	/**
	 * 获取：联系人
	 */
	public String getLinker() {
		return linker;
	}
	/**
	 * 设置：联系电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：渠道类型   10 推广渠道,20 应用市场
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：渠道类型   10 推广渠道,20 应用市场
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：状态 10：启用20：禁用
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 获取：状态 10：启用20：禁用
	 */
	public String getState() {
		return state;
	}
	/**
	 * 设置：添加时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：添加时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
}
