package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 更新记录表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class SpUpdateInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//更新记录Type
	private String type;
	//相关表ID
	private Long tId;
	//更新备注
	private String mark;
	//更新前内容
	private String contentSource;
	//更新后数据
	private String contentNew;
	//
	private String createId;
	//
	private String createName;
	//
	private Date createTime;

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
	 * 设置：更新记录Type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：更新记录Type
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：相关表ID
	 */
	public void setTId(Long tId) {
		this.tId = tId;
	}
	/**
	 * 获取：相关表ID
	 */
	public Long getTId() {
		return tId;
	}
	/**
	 * 设置：更新备注
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}
	/**
	 * 获取：更新备注
	 */
	public String getMark() {
		return mark;
	}
	/**
	 * 设置：更新前内容
	 */
	public void setContentSource(String contentSource) {
		this.contentSource = contentSource;
	}
	/**
	 * 获取：更新前内容
	 */
	public String getContentSource() {
		return contentSource;
	}
	/**
	 * 设置：更新后数据
	 */
	public void setContentNew(String contentNew) {
		this.contentNew = contentNew;
	}
	/**
	 * 获取：更新后数据
	 */
	public String getContentNew() {
		return contentNew;
	}
	/**
	 * 设置：
	 */
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	/**
	 * 获取：
	 */
	public String getCreateId() {
		return createId;
	}
	/**
	 * 设置：
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	/**
	 * 获取：
	 */
	public String getCreateName() {
		return createName;
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
}
