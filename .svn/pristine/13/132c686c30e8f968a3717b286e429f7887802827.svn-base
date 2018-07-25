package org.loan.core.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loan.core.common.constant.RedisKeyConstants;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.model.UserContext;
import org.loan.core.common.model.req.BaseReq;
import org.loan.core.common.model.resp.BaseResp;
import org.loan.core.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Copyright (c) 2018 All Rights Reserved.



/**
 * 
 * @author jinlilong
 * @version $Id: BaseController.java, v 0.1 2018年7月17日 下午3:03:13 jinlilong Exp $
 */
public class BaseController {

    /**  */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**  */
    @Autowired
    private RedisService redisService;

    /**
     * 带用户上下文的请求
     * @param request
     * @param map
     * @param callback
     * @return
     */

    public <T, Q extends BaseReq> BaseResp<T> httpExecute(HttpServletRequest request,
                                                          HttpServletResponse response, Q q,
                                                          ControllerCallback callback) {
        BaseResp<T> resp = null;
        try {
            String token = q.getToken();
            if (token == null) {
                throw new ServiceException(BaseResp.NO_TOKEN_CODE, "认证失败");
            }
            UserContext context = redisService.get(RedisKeyConstants.REDIS_USER_TOKEN + token,
                UserContext.class);
            if (context == null) {
                throw new ServiceException(BaseResp.TOKEN_IS_OVERTIME, "登录超时");
            }
            T data = callback.execute(context);
            resp = BaseResp.buildSuccessResp(data);
        } catch (ServiceException e) {
            logger.warn("发生业务警告异常信息=>", e);
            resp = BaseResp.buildFailResp(e);
        } catch (Exception e) {
            logger.warn("发生系统未知异常信息=>", e);
            resp = BaseResp.buildSysFailResp();
        }
        return resp;

    }

    /**
     * 不带用户上下文的请求
     * @param request
     * @param map
     * @param callback
     * @return
     */
    public <T> BaseResp<T> httpExecuteWithNoContext(HttpServletRequest request,
                                                    HttpServletResponse response,
                                                    ControllerCallbackNoContext callback) {
        BaseResp<T> resp = null;
        try {
            T data = callback.execute();
            resp = BaseResp.buildSuccessResp(data);
        } catch (ServiceException e) {
            logger.warn("发生业务警告异常信息=>", e);
            resp = BaseResp.buildFailResp(e);
        } catch (Exception e) {
            logger.warn("发生系统未知异常信息=>", e);
            resp = BaseResp.buildSysFailResp();
        }
        return resp;

    }

    /**
     * 
     * @author jinlilong
     * @version $Id: BaseController.java, v 0.1 2018年1月23日 下午8:17:30 jinlilong Exp $
     */
    public abstract class ControllerCallback {

        /**
         * 
         * @param context
         * @return
         * @throws Exception
         */
        public abstract <T> T execute(UserContext context) throws Exception;

    }

    public abstract class ControllerCallbackNoContext {
        /**
         * 
         * @return
         * @throws Exception
         */
        public abstract <T> T execute() throws Exception;

    }
}
