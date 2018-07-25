package org.loan.user.controller;

import io.swagger.annotations.ApiOperation;
import org.loan.core.base.BaseController;
import org.loan.core.common.model.UserContext;
import org.loan.core.common.model.req.BaseReq;
import org.loan.core.common.model.resp.BaseResp;
import org.loan.user.model.req.AuthListReq;
import org.loan.user.model.resp.AuthListResp;
import org.loan.user.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xlk
 * on 2018/7/20 0020.
 */
@RestController
@RequestMapping("/api/userAuth")
public class UserAuthController extends BaseController {

    @Autowired
    private UserAuthService userAuthService;

    /**
     *  获取用户认证列表
     *  3.5.3
     * @return
     */
    @ApiOperation("获取用户认证列表")
    @PostMapping("/authList")
    public <T> BaseResp<T> login(HttpServletRequest request, HttpServletResponse response, @RequestBody AuthListReq req) {
        return this.httpExecute(request, response,req, new ControllerCallback() {

            @Override
            public AuthListResp execute(UserContext context) {
                return userAuthService.authList(context.getUserId(),req.getMortgageType());
            }

        });

    }
}
