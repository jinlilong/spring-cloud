/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.resp;

/**
 * 
 * @author jinlilong
 * @version $Id: RepaymentListResp.java, v 0.1 2018年3月6日 下午2:42:33 jinlilong Exp $
 */
public class RepaymentListResp {

    /**  每月应还本金*/
    private String monthPri;

    /**  期数*/
    private String seq;

    /**  应还日期*/
    private String date;

    /**  本期持有的天数*/
    private int    days;

    /**  剩余本金*/
    private String balance;

    /**  利息*/
    private String interest;

    /**  利率*/
    private String rate;

    /**  利率类型*/
    private String rateType;

    /**  应还金额*/
    private String total;

    /**
     * Getter method for property <tt>monthPri</tt>.
     * 
     * @return property value of monthPri
     */
    public String getMonthPri() {
        return monthPri;
    }

    /**
     * Setter method for property <tt>monthPri</tt>.
     * 
     * @param monthPri value to be assigned to property monthPri
     */
    public void setMonthPri(String monthPri) {
        this.monthPri = monthPri;
    }

    /**
     * Getter method for property <tt>seq</tt>.
     * 
     * @return property value of seq
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Setter method for property <tt>seq</tt>.
     * 
     * @param seq value to be assigned to property seq
     */
    public void setSeq(String seq) {
        this.seq = seq;
    }

    /**
     * Getter method for property <tt>date</tt>.
     * 
     * @return property value of date
     */
    public String getDate() {
        return date;
    }

    /**
     * Setter method for property <tt>date</tt>.
     * 
     * @param date value to be assigned to property date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Getter method for property <tt>days</tt>.
     * 
     * @return property value of days
     */
    public int getDays() {
        return days;
    }

    /**
     * Setter method for property <tt>days</tt>.
     * 
     * @param days value to be assigned to property days
     */
    public void setDays(int days) {
        this.days = days;
    }

    /**
     * Getter method for property <tt>balance</tt>.
     * 
     * @return property value of balance
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Setter method for property <tt>balance</tt>.
     * 
     * @param balance value to be assigned to property balance
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * Getter method for property <tt>interest</tt>.
     * 
     * @return property value of interest
     */
    public String getInterest() {
        return interest;
    }

    /**
     * Setter method for property <tt>interest</tt>.
     * 
     * @param interest value to be assigned to property interest
     */
    public void setInterest(String interest) {
        this.interest = interest;
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
     * Getter method for property <tt>total</tt>.
     * 
     * @return property value of total
     */
    public String getTotal() {
        return total;
    }

    /**
     * Setter method for property <tt>total</tt>.
     * 
     * @param total value to be assigned to property total
     */
    public void setTotal(String total) {
        this.total = total;
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
