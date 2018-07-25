package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户设备信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClUserEquipmentInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//uuid
	private String uuid;
	//用户id
	private Long userId;
	//操作系统
	private String operatingSystem;
	//系统版本
	private String systemVersions;
	//手机名
	private String phoneName;
	//手机型号
	private String phoneType;
	//手机品牌
	private String phoneBrand;
	//运营商
	private String mobilecarrier;
	//手机设备标识
	private String phoneMark;
	//mac
	private String mac;
	//屏幕分辨率
	private String screen;
	//应用版本号
	private String versionName;
	//应用build号
	private String versionCode;

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
	 * 设置：uuid
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：uuid
	 */
	public String getUuid() {
		return uuid;
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
	 * 设置：操作系统
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	/**
	 * 获取：操作系统
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}
	/**
	 * 设置：系统版本
	 */
	public void setSystemVersions(String systemVersions) {
		this.systemVersions = systemVersions;
	}
	/**
	 * 获取：系统版本
	 */
	public String getSystemVersions() {
		return systemVersions;
	}
	/**
	 * 设置：手机名
	 */
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	/**
	 * 获取：手机名
	 */
	public String getPhoneName() {
		return phoneName;
	}
	/**
	 * 设置：手机型号
	 */
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	/**
	 * 获取：手机型号
	 */
	public String getPhoneType() {
		return phoneType;
	}
	/**
	 * 设置：手机品牌
	 */
	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}
	/**
	 * 获取：手机品牌
	 */
	public String getPhoneBrand() {
		return phoneBrand;
	}
	/**
	 * 设置：运营商
	 */
	public void setMobilecarrier(String mobilecarrier) {
		this.mobilecarrier = mobilecarrier;
	}
	/**
	 * 获取：运营商
	 */
	public String getMobilecarrier() {
		return mobilecarrier;
	}
	/**
	 * 设置：手机设备标识
	 */
	public void setPhoneMark(String phoneMark) {
		this.phoneMark = phoneMark;
	}
	/**
	 * 获取：手机设备标识
	 */
	public String getPhoneMark() {
		return phoneMark;
	}
	/**
	 * 设置：mac
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}
	/**
	 * 获取：mac
	 */
	public String getMac() {
		return mac;
	}
	/**
	 * 设置：屏幕分辨率
	 */
	public void setScreen(String screen) {
		this.screen = screen;
	}
	/**
	 * 获取：屏幕分辨率
	 */
	public String getScreen() {
		return screen;
	}
	/**
	 * 设置：应用版本号
	 */
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	/**
	 * 获取：应用版本号
	 */
	public String getVersionName() {
		return versionName;
	}
	/**
	 * 设置：应用build号
	 */
	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
	/**
	 * 获取：应用build号
	 */
	public String getVersionCode() {
		return versionCode;
	}
}
