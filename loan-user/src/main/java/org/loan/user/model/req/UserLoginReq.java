/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.user.model.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.loan.core.common.model.req.BaseReq;

/**
 *
 * @author jinlilong
 * @version $Id: UserLoginReq.java, v 0.1 2018年7月20日 上午9:00:52 jinlilong Exp $
 */
@ApiModel(value = "登录参数")
public class UserLoginReq extends BaseReq {

    /**  登录账号*/
    @ApiModelProperty(value="登录账号")
    private String loginName;

    /**  登录密码*/
    @ApiModelProperty(value="登录密码")
    private String pwd;

    /**
     * Getter method for property <tt>loginName</tt>.
     *
     * @return property value of loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Setter method for property <tt>loginName</tt>.
     *
     * @param loginName value to be assigned to property loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * Getter method for property <tt>pwd</tt>.
     *
     * @return property value of pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Setter method for property <tt>pwd</tt>.
     *
     * @param pwd value to be assigned to property pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
