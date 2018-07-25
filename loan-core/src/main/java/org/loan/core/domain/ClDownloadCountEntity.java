package org.loan.core.domain;

import java.io.Serializable;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClDownloadCountEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //id
    private Integer           id;
    //0浏览，1 关注， 2下载，3注册
    private String            type;
    //注册手机号
    private String            phone;
    //设备
    private String            equipment;
    //合作渠道
    private String            state;
    //用户ip
    private String            ip;
    //ip对应的城市
    private String            ipCity;
    //本页面地址id
    private String            url;
    //创建时间
    private String            createtime;

    /**
     * 设置：id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：0浏览，1 关注， 2下载，3注册
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：0浏览，1 关注， 2下载，3注册
     */
    public String getType() {
        return type;
    }

    /**
     * 设置：注册手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取：注册手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置：设备
     */
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    /**
     * 获取：设备
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * 设置：合作渠道
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：合作渠道
     */
    public String getState() {
        return state;
    }

    /**
     * 设置：用户ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取：用户ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置：ip对应的城市
     */
    public void setIpCity(String ipCity) {
        this.ipCity = ipCity;
    }

    /**
     * 获取：ip对应的城市
     */
    public String getIpCity() {
        return ipCity;
    }

    /**
     * 设置：本页面地址id
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取：本页面地址id
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置：创建时间
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取：创建时间
     */
    public String getCreatetime() {
        return createtime;
    }
}
