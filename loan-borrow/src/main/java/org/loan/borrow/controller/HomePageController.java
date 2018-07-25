/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loan.borrow.model.resp.HomePageRegisterResp;
import org.loan.borrow.model.resp.HomePageResp;
import org.loan.borrow.service.HomePageService;
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
 * @version $Id: HomePageController.java, v 0.1 2018年7月19日 下午6:25:10 jinlilong Exp $
 */
@RestController
@RequestMapping("/api/borrow")
@Api(value = "首页相关", description = "首页相关")
public class HomePageController extends BaseController {

    /**  */
    @Autowired
    private HomePageService homePageService;

    /**
     * 获取首页信息
     * @param request
     * @param response
     * @param req
     * @return
     */
    @PostMapping("/homePage")
    @ApiOperation(value = "用户已经确定产品后的首页接口", httpMethod = "POST")
    @ApiParam(name = "请求参数")
    public BaseResp<HomePageResp> homePage(HttpServletRequest request, HttpServletResponse response,
                                           @RequestBody BaseReq req) {
        return this.httpExecute(request, response, req, new ControllerCallback() {

            @SuppressWarnings("unchecked")
            @Override
            public HomePageResp execute(UserContext context) throws Exception {
                return homePageService.homePage(context.getUserId());
            }

        });

    }

    /**
     * 注册后未确定产品时的首页信息
     * @param request
     * @param response
     * @param req
     * @return
     */
    @PostMapping("/homePageRegister")
    @ApiOperation(value = "用户未确定产品后的首页接口", httpMethod = "POST")
    @ApiParam(name = "请求参数")
    public BaseResp<HomePageRegisterResp> homePageRegister(HttpServletRequest request,
                                                           HttpServletResponse response,
                                                           @RequestBody BaseReq req) {
        return this.httpExecute(request, response, req, new ControllerCallback() {

            @SuppressWarnings("unchecked")
            @Override
            public HomePageRegisterResp execute(UserContext context) throws Exception {
                return homePageService.homePageRegister(context.getUserId());
            }

        });

    }
}
