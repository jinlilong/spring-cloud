/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.req;

import java.math.BigDecimal;

/**
 * 
 * @author jinlilong
 * @version $Id: IncomeSuccessReq.java, v 0.1 2018年5月28日 上午11:08:08 jinlilong Exp $
 */
public class IncomeSuccessReq {

    /**  金额*/
    private BigDecimal amount;

    /**  是否线下还款  1:线下*/
    private String     isUnderLine;

    private String     offlineRepaymentVoucherPic;

    private String     offlineRepaymentRemark;

    /**  违约金*/
    private String     advanceAmount;

    /**  利息*/
    private String     Interest;

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
     * Getter method for property <tt>isUnderLine</tt>.
     * 
     * @return property value of isUnderLine
     */
    public String getIsUnderLine() {
        return isUnderLine;
    }

    /**
     * Setter method for property <tt>isUnderLine</tt>.
     * 
     * @param isUnderLine value to be assigned to property isUnderLine
     */
    public void setIsUnderLine(String isUnderLine) {
        this.isUnderLine = isUnderLine;
    }

    /**
     * Getter method for property <tt>offlineRepaymentVoucherPic</tt>.
     * 
     * @return property value of offlineRepaymentVoucherPic
     */
    public String getOfflineRepaymentVoucherPic() {
        return offlineRepaymentVoucherPic;
    }

    /**
     * Setter method for property <tt>offlineRepaymentVoucherPic</tt>.
     * 
     * @param offlineRepaymentVoucherPic value to be assigned to property offlineRepaymentVoucherPic
     */
    public void setOfflineRepaymentVoucherPic(String offlineRepaymentVoucherPic) {
        this.offlineRepaymentVoucherPic = offlineRepaymentVoucherPic;
    }

    /**
     * Getter method for property <tt>offlineRepaymentRemark</tt>.
     * 
     * @return property value of offlineRepaymentRemark
     */
    public String getOfflineRepaymentRemark() {
        return offlineRepaymentRemark;
    }

    /**
     * Setter method for property <tt>offlineRepaymentRemark</tt>.
     * 
     * @param offlineRepaymentRemark value to be assigned to property offlineRepaymentRemark
     */
    public void setOfflineRepaymentRemark(String offlineRepaymentRemark) {
        this.offlineRepaymentRemark = offlineRepaymentRemark;
    }

    /**
     * Getter method for property <tt>advanceAmount</tt>.
     * 
     * @return property value of advanceAmount
     */
    public String getAdvanceAmount() {
        return advanceAmount;
    }

    /**
     * Setter method for property <tt>advanceAmount</tt>.
     * 
     * @param advanceAmount value to be assigned to property advanceAmount
     */
    public void setAdvanceAmount(String advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    /**
     * Getter method for property <tt>interest</tt>.
     * 
     * @return property value of Interest
     */
    public String getInterest() {
        return Interest;
    }

    /**
     * Setter method for property <tt>interest</tt>.
     * 
     * @param Interest value to be assigned to property interest
     */
    public void setInterest(String interest) {
        Interest = interest;
    }

}
