/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.resp;

/**
 * 
 * @author jinlilong
 * @version $Id: IncomeResp.java, v 0.1 2018年5月22日 下午3:07:48 jinlilong Exp $
 */
public class IncomeResp {

    /**  状态*/
    private boolean success;

    /**  是否在处理中*/
    private boolean handleState;

    /**  备注*/
    private String  remark;

    /**  订单号*/
    private String  orderNo;

    /**  */
    private String  account;

    /**  项目录入ID*/
    private String  projectId;

    /**
     * Getter method for property <tt>success</tt>.
     * 
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>success</tt>.
     * 
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Getter method for property <tt>handleState</tt>.
     * 
     * @return property value of handleState
     */
    public boolean isHandleState() {
        return handleState;
    }

    /**
     * Setter method for property <tt>handleState</tt>.
     * 
     * @param handleState value to be assigned to property handleState
     */
    public void setHandleState(boolean handleState) {
        this.handleState = handleState;
    }

    /**
     * Getter method for property <tt>remark</tt>.
     * 
     * @return property value of remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Setter method for property <tt>remark</tt>.
     * 
     * @param remark value to be assigned to property remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Getter method for property <tt>orderNo</tt>.
     * 
     * @return property value of orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Setter method for property <tt>orderNo</tt>.
     * 
     * @param orderNo value to be assigned to property orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * Getter method for property <tt>account</tt>.
     * 
     * @return property value of account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Setter method for property <tt>account</tt>.
     * 
     * @param account value to be assigned to property account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Getter method for property <tt>projectId</tt>.
     * 
     * @return property value of projectId
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Setter method for property <tt>projectId</tt>.
     * 
     * @param projectId value to be assigned to property projectId
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

}
