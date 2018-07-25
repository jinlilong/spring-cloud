/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author jinlilong
 * @version $Id: BaseReq.java, v 0.1 2018年7月19日 下午3:17:31 jinlilong Exp $
 */
@ApiModel
public class BaseReq {

    @ApiModelProperty(value="请求令牌")
    private String token;

    /**
     * Getter method for property <tt>token</tt>.
     * 
     * @return property value of token
     */
    public String getToken() {
        return token;
    }

    /**
     * Setter method for property <tt>token</tt>.
     * 
     * @param token value to be assigned to property token
     */
    public void setToken(String token) {
        this.token = token;
    }

}
