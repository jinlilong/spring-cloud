package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础代码
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ArcBasecodeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //代码组
    private String            cat;
    //代码
    private String            code;
    //中文描述
    private String            descript;
    //是否系统代码 :  T/F
    private String            sys;
    //是否停用 :  T/F
    private String            halt;
    //内部分组
    private String            grp;
    //修改人
    private Long              cby;
    //修改时间
    private Date              changed;
    //排序
    private Integer           seq;
    //预留字段
    private String            exts1;
    //预留字段
    private String            exts2;
    //预留字段
    private String            exts3;
    //exts4
    private String            exts4;

    /**
     * 设置：代码组
     */
    public void setCat(String cat) {
        this.cat = cat;
    }

    /**
     * 获取：代码组
     */
    public String getCat() {
        return cat;
    }

    /**
     * 设置：代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取：代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置：中文描述
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 获取：中文描述
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 设置：是否系统代码 :  T/F
     */
    public void setSys(String sys) {
        this.sys = sys;
    }

    /**
     * 获取：是否系统代码 :  T/F
     */
    public String getSys() {
        return sys;
    }

    /**
     * 设置：是否停用 :  T/F
     */
    public void setHalt(String halt) {
        this.halt = halt;
    }

    /**
     * 获取：是否停用 :  T/F
     */
    public String getHalt() {
        return halt;
    }

    /**
     * 设置：内部分组
     */
    public void setGrp(String grp) {
        this.grp = grp;
    }

    /**
     * 获取：内部分组
     */
    public String getGrp() {
        return grp;
    }

    /**
     * 设置：修改人
     */
    public void setCby(Long cby) {
        this.cby = cby;
    }

    /**
     * 获取：修改人
     */
    public Long getCby() {
        return cby;
    }

    /**
     * 设置：修改时间
     */
    public void setChanged(Date changed) {
        this.changed = changed;
    }

    /**
     * 获取：修改时间
     */
    public Date getChanged() {
        return changed;
    }

    /**
     * 设置：排序
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取：排序
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置：预留字段
     */
    public void setExts1(String exts1) {
        this.exts1 = exts1;
    }

    /**
     * 获取：预留字段
     */
    public String getExts1() {
        return exts1;
    }

    /**
     * 设置：预留字段
     */
    public void setExts2(String exts2) {
        this.exts2 = exts2;
    }

    /**
     * 获取：预留字段
     */
    public String getExts2() {
        return exts2;
    }

    /**
     * 设置：预留字段
     */
    public void setExts3(String exts3) {
        this.exts3 = exts3;
    }

    /**
     * 获取：预留字段
     */
    public String getExts3() {
        return exts3;
    }

    /**
     * 设置：exts4
     */
    public void setExts4(String exts4) {
        this.exts4 = exts4;
    }

    /**
     * 获取：exts4
     */
    public String getExts4() {
        return exts4;
    }
}
