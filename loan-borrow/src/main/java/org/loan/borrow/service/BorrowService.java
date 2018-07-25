/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.service;

import org.loan.borrow.model.resp.QueryPeriedsDetailResp;
import org.loan.borrow.model.resp.QueryUserIsSingleLoanResp;

/**
 * 借款service
 * @author jinlilong
 * @version $Id: BorrowService.java, v 0.1 2018年7月23日 上午11:06:41 jinlilong Exp $
 */
public interface BorrowService {

    /**
     * 查询用户是否是单笔额度
     * @param userId
     * @return
     */
    QueryUserIsSingleLoanResp queryUserIsSingleLoan(Long userId);

    /**
     * 查询用户的分期期数记录
     * @param userId
     * @return
     */
    QueryPeriedsDetailResp queryBorrowDetail(Long userId);

}
