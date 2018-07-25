/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.resp;

import java.util.List;

/**
 * 
 * @author jinlilong
 * @version $Id: Repayment.java, v 0.1 2018年3月6日 下午5:00:24 jinlilong Exp $
 */
public class Repayment {

    /**  总利息*/
    private String                  totalInterest;

    /**  总本金+利息*/
    private String                  totalRepayMoney;

    /**  */
    private List<RepaymentListResp> list;

    /**
     * Getter method for property <tt>totalInterest</tt>.
     * 
     * @return property value of totalInterest
     */
    public String getTotalInterest() {
        return totalInterest;
    }

    /**
     * Setter method for property <tt>totalInterest</tt>.
     * 
     * @param totalInterest value to be assigned to property totalInterest
     */
    public void setTotalInterest(String totalInterest) {
        this.totalInterest = totalInterest;
    }

    /**
     * Getter method for property <tt>list</tt>.
     * 
     * @return property value of list
     */
    public List<RepaymentListResp> getList() {
        return list;
    }

    /**
     * Setter method for property <tt>list</tt>.
     * 
     * @param list value to be assigned to property list
     */
    public void setList(List<RepaymentListResp> list) {
        this.list = list;
    }

    /**
     * Getter method for property <tt>totalRepayMoney</tt>.
     * 
     * @return property value of totalRepayMoney
     */
    public String getTotalRepayMoney() {
        return totalRepayMoney;
    }

    /**
     * Setter method for property <tt>totalRepayMoney</tt>.
     * 
     * @param totalRepayMoney value to be assigned to property totalRepayMoney
     */
    public void setTotalRepayMoney(String totalRepayMoney) {
        this.totalRepayMoney = totalRepayMoney;
    }

}
