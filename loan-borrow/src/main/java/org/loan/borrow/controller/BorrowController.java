/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loan.borrow.model.resp.QueryUserIsSingleLoanResp;
import org.loan.borrow.service.BorrowService;
import org.loan.core.base.BaseController;
import org.loan.core.common.model.UserContext;
import org.loan.core.common.model.req.BaseReq;
import org.loan.core.common.model.resp.BaseResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @author jinlilong
 * @version $Id: BorrowController.java, v 0.1 2018年7月23日 上午11:41:06 jinlilong Exp $
 */
@RestController
@RequestMapping("/api/borrow")
@Api(value = "借款相关", description = "借款相关")
public class BorrowController extends BaseController {

    /**  */
    @Autowired
    private BorrowService borrowService;

    /**
     * 获取首页信息
     * @param request
     * @param response
     * @param req
     * @return
     */
    @PostMapping("/queryUserIsSingleLoan")
    @ApiOperation(value = "获取用户借款时是否是固定借款额度", httpMethod = "POST")
    @ApiParam(name = "请求参数")
    public BaseResp<QueryUserIsSingleLoanResp> QueryUserIsSingleLoan(HttpServletRequest request,
                                                                     HttpServletResponse response,
                                                                     @RequestBody BaseReq req) {
        return this.httpExecute(request, response, req, new ControllerCallback() {

            @SuppressWarnings("unchecked")
            @Override
            public QueryUserIsSingleLoanResp execute(UserContext context) throws Exception {
                return borrowService.queryUserIsSingleLoan(context.getUserId());
            }

        });
    }

}
