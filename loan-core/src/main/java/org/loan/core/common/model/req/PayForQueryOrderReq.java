/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.req;

/**
 * 
 * @author jinlilong
 * @version $Id: PayForQueryOrderReq.java, v 0.1 2018年5月15日 下午5:43:46 jinlilong Exp $
 */
public class PayForQueryOrderReq {

    /**  流水号*/
    private String orderno;

    /**  开始时间*/
    private String startDate;

    /**  结束时间*/
    private String endDate;

    /**  状态*/
    private String state;

    private Long   userId;

    /**
     * Getter method for property <tt>orderno</tt>.
     * 
     * @return property value of orderno
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * Setter method for property <tt>orderno</tt>.
     * 
     * @param orderno value to be assigned to property orderno
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    /**
     * Getter method for property <tt>startDate</tt>.
     * 
     * @return property value of startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter method for property <tt>startDate</tt>.
     * 
     * @param startDate value to be assigned to property startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter method for property <tt>endDate</tt>.
     * 
     * @return property value of endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter method for property <tt>endDate</tt>.
     * 
     * @param endDate value to be assigned to property endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter method for property <tt>state</tt>.
     * 
     * @return property value of state
     */
    public String getState() {
        return state;
    }

    /**
     * Setter method for property <tt>state</tt>.
     * 
     * @param state value to be assigned to property state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter method for property <tt>userId</tt>.
     * 
     * @return property value of userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     * 
     * @param userId value to be assigned to property userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
