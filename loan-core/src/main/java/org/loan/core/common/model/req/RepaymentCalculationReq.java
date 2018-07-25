/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.req;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @author jinlilong
 * @version $Id: RepaymentCalculationReq.java, v 0.1 2018年3月6日 下午2:39:30 jinlilong Exp $
 */
public class RepaymentCalculationReq {

    /**  还款方式*/
    private String     repaymentMethod;

    /**  借款总金额*/
    private BigDecimal amount;

    /**  利率*/
    private String     rate;

    /**  开始日期*/
    private Date       startDate;

    /**  分期期数*/
    private int        totalMonth;

    /**  利率类型  RateTypeEnums*/
    private String     rateType;

    /**
     * Getter method for property <tt>repaymentMethod</tt>.
     * 
     * @return property value of repaymentMethod
     */
    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    /**
     * Setter method for property <tt>repaymentMethod</tt>.
     * 
     * @param repaymentMethod value to be assigned to property repaymentMethod
     */
    public void setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod;
    }

    /**
     * Getter method for property <tt>amount</tt>.
     * 
     * @return property value of amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Setter method for property <tt>amount</tt>.
     * 
     * @param amount value to be assigned to property amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Getter method for property <tt>rate</tt>.
     * 
     * @return property value of rate
     */
    public String getRate() {
        return rate;
    }

    /**
     * Setter method for property <tt>rate</tt>.
     * 
     * @param rate value to be assigned to property rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /**
     * Getter method for property <tt>startDate</tt>.
     * 
     * @return property value of startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Setter method for property <tt>startDate</tt>.
     * 
     * @param startDate value to be assigned to property startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter method for property <tt>totalMonth</tt>.
     * 
     * @return property value of totalMonth
     */
    public int getTotalMonth() {
        return totalMonth;
    }

    /**
     * Setter method for property <tt>totalMonth</tt>.
     * 
     * @param totalMonth value to be assigned to property totalMonth
     */
    public void setTotalMonth(int totalMonth) {
        this.totalMonth = totalMonth;
    }

    /**
     * Getter method for property <tt>rateType</tt>.
     * 
     * @return property value of rateType
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * Setter method for property <tt>rateType</tt>.
     * 
     * @param rateType value to be assigned to property rateType
     */
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

}
