/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.loan.core.base.BaseController;
import org.loan.core.common.model.resp.BaseResp;
import org.loan.user.model.req.UserLoginReq;
import org.loan.user.model.resp.UserLoginResp;
import org.loan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jinlilong
 * @version $Id: LoginConntroller.java, v 0.1 2018年7月19日 下午2:02:42 jinlilong Exp $
 */
@RestController
@RequestMapping("/api/user")
@Api(value = "用户登录模块", description = "登录,注册,发送验证码")
public class LoginController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     *
     * @return
     */
    @PostMapping("/login")
    @ApiOperation(value = "用户登录", httpMethod = "POST")
    @ApiParam(name = "登录请求参数")
    public BaseResp<UserLoginResp> login(HttpServletRequest request, HttpServletResponse response,
                                 @RequestBody @ApiParam(name = "登录请求参数", value = "传入json数据") UserLoginReq req) {
        return this.httpExecuteWithNoContext(request, response, new ControllerCallbackNoContext() {

            @SuppressWarnings("unchecked")
            @Override
            public UserLoginResp execute() throws Exception {
                return userService.login(req);
            }

        });
    }
}
