package org.loan.core.common.model;

import org.loan.core.common.enums.ContractTypeEnums;

/**
 * @author liuzx
 * @desc 审核风控条件
 * @create 2018-07-05 11:39
 */

public class ApprovalRuleRequest {

    /**
     * 用户编号
     */
    private Long              userId;

    private ContractTypeEnums creditType;

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

    /**
     * Getter method for property <tt>creditType</tt>.
     * 
     * @return property value of creditType
     */
    public ContractTypeEnums getCreditType() {
        return creditType;
    }

    /**
     * Setter method for property <tt>creditType</tt>.
     * 
     * @param creditType value to be assigned to property creditType
     */
    public void setCreditType(ContractTypeEnums creditType) {
        this.creditType = creditType;
    }

}
