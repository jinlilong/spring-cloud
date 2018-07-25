/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.model.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 查询用户是否单笔，接口返回类
 * @author jinlilong
 * @version $Id: QueryUserIsSingleLoanResp.java, v 0.1 2018年7月23日 上午11:08:17 jinlilong Exp $
 */
@ApiModel
public class QueryUserIsSingleLoanResp {

    /**  是否是固定借款额度  1:固定额度，0：不是固定额度*/
    @ApiModelProperty("是否是固定借款额度  1:固定额度，0：不是固定额度")
    private String isfixedBorrowAmount;

    /**  若时单笔额度则    额度金额*/
    @ApiModelProperty("是固定额度时，默认借款时的额度，否则自己输入")
    private String amount;

    /**  用户的最大额度*/
    @ApiModelProperty("用户当前输入时的最大额度")
    private String maxAmount;

    /**
     * Getter method for property <tt>amount</tt>.
     * 
     * @return property value of amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Setter method for property <tt>amount</tt>.
     * 
     * @param amount value to be assigned to property amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Getter method for property <tt>maxAmount</tt>.
     * 
     * @return property value of maxAmount
     */
    public String getMaxAmount() {
        return maxAmount;
    }

    /**
     * Setter method for property <tt>maxAmount</tt>.
     * 
     * @param maxAmount value to be assigned to property maxAmount
     */
    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

    /**
     * Getter method for property <tt>isfixedBorrowAmount</tt>.
     * 
     * @return property value of isfixedBorrowAmount
     */
    public String getIsfixedBorrowAmount() {
        return isfixedBorrowAmount;
    }

    /**
     * Setter method for property <tt>isfixedBorrowAmount</tt>.
     * 
     * @param isfixedBorrowAmount value to be assigned to property isfixedBorrowAmount
     */
    public void setIsfixedBorrowAmount(String isfixedBorrowAmount) {
        this.isfixedBorrowAmount = isfixedBorrowAmount;
    }

}
