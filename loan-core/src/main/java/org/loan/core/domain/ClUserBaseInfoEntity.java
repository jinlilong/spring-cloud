package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户详情表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClUserBaseInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//客户表 外键
	private Long userId;
	//手机号码
	private String phone;
	//真实姓名
	private String realName;
	//年龄 
	private Integer age;
	//性别
	private String sex;
	//民族
	private String national;
	//证件号码
	private String idNo;
	//身份证地址
	private String idAddr;
	//自拍(人脸识别照片)
	private String livingImg;
	//身份证头像
	private String ocrImg;
	//身份证正面
	private String frontImg;
	//身份证反面
	private String backImg;
	//签名图片
	private String signatureImg;
	//学历
	private String education;
	//婚姻状况
	private String marryState;
	//公司名称
	private String companyName;
	//公司电话
	private String companyPhone;
	//公司地址
	private String companyAddr;
	//公司详细地址
	private String companyDetailAddr;
	//公司坐标(经度,纬度)
	private String companyCoordinate;
	//月薪范围
	private String salary;
	//工作年限
	private String workingYears;
	//工作照片
	private String workingImg;
	//居住时长
	private String liveTime;
	//居住地址
	private String liveAddr;
	//居住详细地址
	private String liveDetailAddr;
	//居住地坐标，(经度,纬度)
	private String liveCoordinate;
	//运营商服务密码
	private String phoneServerPwd;
	//注册地址
	private String registerAddr;
	//注册地坐标，(经度,纬度)
	private String registerCoordinate;
	//是否黑名单 ，10是20不是 30 骗贷
	private String state;
	//拉黑原因
	private String blackReason;
	//更新时间
	private Date updateTime;
	//创建时间
	private Date createTime;

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
	 * 设置：客户表 外键
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：客户表 外键
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：手机号码
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机号码
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：真实姓名
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * 获取：真实姓名
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * 设置：年龄 
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * 获取：年龄 
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * 设置：性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：性别
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：民族
	 */
	public void setNational(String national) {
		this.national = national;
	}
	/**
	 * 获取：民族
	 */
	public String getNational() {
		return national;
	}
	/**
	 * 设置：证件号码
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	/**
	 * 获取：证件号码
	 */
	public String getIdNo() {
		return idNo;
	}
	/**
	 * 设置：身份证地址
	 */
	public void setIdAddr(String idAddr) {
		this.idAddr = idAddr;
	}
	/**
	 * 获取：身份证地址
	 */
	public String getIdAddr() {
		return idAddr;
	}
	/**
	 * 设置：自拍(人脸识别照片)
	 */
	public void setLivingImg(String livingImg) {
		this.livingImg = livingImg;
	}
	/**
	 * 获取：自拍(人脸识别照片)
	 */
	public String getLivingImg() {
		return livingImg;
	}
	/**
	 * 设置：身份证头像
	 */
	public void setOcrImg(String ocrImg) {
		this.ocrImg = ocrImg;
	}
	/**
	 * 获取：身份证头像
	 */
	public String getOcrImg() {
		return ocrImg;
	}
	/**
	 * 设置：身份证正面
	 */
	public void setFrontImg(String frontImg) {
		this.frontImg = frontImg;
	}
	/**
	 * 获取：身份证正面
	 */
	public String getFrontImg() {
		return frontImg;
	}
	/**
	 * 设置：身份证反面
	 */
	public void setBackImg(String backImg) {
		this.backImg = backImg;
	}
	/**
	 * 获取：身份证反面
	 */
	public String getBackImg() {
		return backImg;
	}
	/**
	 * 设置：签名图片
	 */
	public void setSignatureImg(String signatureImg) {
		this.signatureImg = signatureImg;
	}
	/**
	 * 获取：签名图片
	 */
	public String getSignatureImg() {
		return signatureImg;
	}
	/**
	 * 设置：学历
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * 获取：学历
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * 设置：婚姻状况
	 */
	public void setMarryState(String marryState) {
		this.marryState = marryState;
	}
	/**
	 * 获取：婚姻状况
	 */
	public String getMarryState() {
		return marryState;
	}
	/**
	 * 设置：公司名称
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * 获取：公司名称
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * 设置：公司电话
	 */
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	/**
	 * 获取：公司电话
	 */
	public String getCompanyPhone() {
		return companyPhone;
	}
	/**
	 * 设置：公司地址
	 */
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	/**
	 * 获取：公司地址
	 */
	public String getCompanyAddr() {
		return companyAddr;
	}
	/**
	 * 设置：公司详细地址
	 */
	public void setCompanyDetailAddr(String companyDetailAddr) {
		this.companyDetailAddr = companyDetailAddr;
	}
	/**
	 * 获取：公司详细地址
	 */
	public String getCompanyDetailAddr() {
		return companyDetailAddr;
	}
	/**
	 * 设置：公司坐标(经度,纬度)
	 */
	public void setCompanyCoordinate(String companyCoordinate) {
		this.companyCoordinate = companyCoordinate;
	}
	/**
	 * 获取：公司坐标(经度,纬度)
	 */
	public String getCompanyCoordinate() {
		return companyCoordinate;
	}
	/**
	 * 设置：月薪范围
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}
	/**
	 * 获取：月薪范围
	 */
	public String getSalary() {
		return salary;
	}
	/**
	 * 设置：工作年限
	 */
	public void setWorkingYears(String workingYears) {
		this.workingYears = workingYears;
	}
	/**
	 * 获取：工作年限
	 */
	public String getWorkingYears() {
		return workingYears;
	}
	/**
	 * 设置：工作照片
	 */
	public void setWorkingImg(String workingImg) {
		this.workingImg = workingImg;
	}
	/**
	 * 获取：工作照片
	 */
	public String getWorkingImg() {
		return workingImg;
	}
	/**
	 * 设置：居住时长
	 */
	public void setLiveTime(String liveTime) {
		this.liveTime = liveTime;
	}
	/**
	 * 获取：居住时长
	 */
	public String getLiveTime() {
		return liveTime;
	}
	/**
	 * 设置：居住地址
	 */
	public void setLiveAddr(String liveAddr) {
		this.liveAddr = liveAddr;
	}
	/**
	 * 获取：居住地址
	 */
	public String getLiveAddr() {
		return liveAddr;
	}
	/**
	 * 设置：居住详细地址
	 */
	public void setLiveDetailAddr(String liveDetailAddr) {
		this.liveDetailAddr = liveDetailAddr;
	}
	/**
	 * 获取：居住详细地址
	 */
	public String getLiveDetailAddr() {
		return liveDetailAddr;
	}
	/**
	 * 设置：居住地坐标，(经度,纬度)
	 */
	public void setLiveCoordinate(String liveCoordinate) {
		this.liveCoordinate = liveCoordinate;
	}
	/**
	 * 获取：居住地坐标，(经度,纬度)
	 */
	public String getLiveCoordinate() {
		return liveCoordinate;
	}
	/**
	 * 设置：运营商服务密码
	 */
	public void setPhoneServerPwd(String phoneServerPwd) {
		this.phoneServerPwd = phoneServerPwd;
	}
	/**
	 * 获取：运营商服务密码
	 */
	public String getPhoneServerPwd() {
		return phoneServerPwd;
	}
	/**
	 * 设置：注册地址
	 */
	public void setRegisterAddr(String registerAddr) {
		this.registerAddr = registerAddr;
	}
	/**
	 * 获取：注册地址
	 */
	public String getRegisterAddr() {
		return registerAddr;
	}
	/**
	 * 设置：注册地坐标，(经度,纬度)
	 */
	public void setRegisterCoordinate(String registerCoordinate) {
		this.registerCoordinate = registerCoordinate;
	}
	/**
	 * 获取：注册地坐标，(经度,纬度)
	 */
	public String getRegisterCoordinate() {
		return registerCoordinate;
	}
	/**
	 * 设置：是否黑名单 ，10是20不是 30 骗贷
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 获取：是否黑名单 ，10是20不是 30 骗贷
	 */
	public String getState() {
		return state;
	}
	/**
	 * 设置：拉黑原因
	 */
	public void setBlackReason(String blackReason) {
		this.blackReason = blackReason;
	}
	/**
	 * 获取：拉黑原因
	 */
	public String getBlackReason() {
		return blackReason;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
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
}
