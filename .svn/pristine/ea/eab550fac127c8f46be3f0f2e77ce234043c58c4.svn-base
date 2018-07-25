package org.loan.core.common.model.resp;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author liuzx
 * @desc 同盾贷前审核报告参数
 * @create 2018-06-14 16:37
 */
public class PreloanSubmitResponse implements Serializable {

    private static final long serialVersionUID = 4152462611121573434L;
    /**
     * 是否调用成功,false:调用失败；true:调用成功
     */
    private Boolean           success          = false;
    /**
     * 贷前申请风险报告编号
     */
    private String            report_id;
    /**
     * 调用失败时的错误码,success为false的情况下对应错误码,详见错误代码表
     */
    private String            reason_code;
    /**
     * 错误详情描述,成功时不返回
     */
    private String            reason_desc;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getReport_id() {
        return report_id;
    }

    public void setReport_id(String report_id) {
        this.report_id = report_id;
    }

    public String getReason_code() {
        return reason_code;
    }

    public void setReason_code(String reason_code) {
        this.reason_code = reason_code;
    }

    public String getReason_desc() {
        return reason_desc;
    }

    public void setReason_desc(String reason_desc) {
        this.reason_desc = reason_desc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("success", success).append("report_id", report_id)
            .toString();
    }

}