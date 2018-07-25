package org.loan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 同盾信用分请求记录
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-19 09:32:56
 */
public class ClTongdunCreditScoreLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //用户标识
    private Long              userId;
    //请求参数
    private String            reqParams;
    //贷前申请风险报告编号
    private String            reportId;
    //同盾信用分
    private Integer           creditScore;
    //风险分数
    private Integer           finalScore;
    //风险结果
    private String            finalDecision;
    //结果 success/fail
    private String            result;
    //错误详情描述
    private String            reasonDesc;
    //创建时间
    private Date              createTime;
    //修改时间
    private Date              updateTime;
    //oss文件地址
    private String            ossPath;

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
     * 设置：用户标识
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户标识
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：请求参数
     */
    public void setReqParams(String reqParams) {
        this.reqParams = reqParams;
    }

    /**
     * 获取：请求参数
     */
    public String getReqParams() {
        return reqParams;
    }

    /**
     * 设置：贷前申请风险报告编号
     */
    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * 获取：贷前申请风险报告编号
     */
    public String getReportId() {
        return reportId;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Integer getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Integer finalScore) {
        this.finalScore = finalScore;
    }

    /**
     * 设置：风险结果
     */
    public void setFinalDecision(String finalDecision) {
        this.finalDecision = finalDecision;
    }

    /**
     * 获取：风险结果
     */
    public String getFinalDecision() {
        return finalDecision;
    }

    /**
     * 设置：结果 success/fail
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取：结果 success/fail
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置：错误详情描述
     */
    public void setReasonDesc(String reasonDesc) {
        this.reasonDesc = reasonDesc;
    }

    /**
     * 获取：错误详情描述
     */
    public String getReasonDesc() {
        return reasonDesc;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOssPath() {
        return ossPath;
    }

    public void setOssPath(String ossPath) {
        this.ossPath = ossPath;
    }
}
