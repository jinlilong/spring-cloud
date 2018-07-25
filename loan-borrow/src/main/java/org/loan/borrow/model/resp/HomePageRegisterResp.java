/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.model.resp;

import java.util.List;

import org.loan.core.common.model.resp.borrow.BannerListResp;
import org.loan.core.common.model.resp.borrow.ProductListVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 未审批额度、非线上信用名单库 展示的首页
 * @author jinlilong
 * @version $Id: HomePageRegisterResp.java, v 0.1 2018年7月20日 下午1:48:07 jinlilong Exp $
 */
@ApiModel("未确定产品的首页返回")
public class HomePageRegisterResp {

    /**  banner list*/
    @ApiModelProperty("banner")
    private List<BannerListResp> bannerList;

    /**  产品列表*/
    @ApiModelProperty("产品列表")
    private List<ProductListVo>  productList;

    /**  用户消息*/
    @ApiModelProperty("用户消息")
    private String               message;

    /**
     * Getter method for property <tt>bannerList</tt>.
     * 
     * @return property value of bannerList
     */
    public List<BannerListResp> getBannerList() {
        return bannerList;
    }

    /**
     * Setter method for property <tt>bannerList</tt>.
     * 
     * @param bannerList value to be assigned to property bannerList
     */
    public void setBannerList(List<BannerListResp> bannerList) {
        this.bannerList = bannerList;
    }

    /**
     * Getter method for property <tt>productList</tt>.
     * 
     * @return property value of productList
     */
    public List<ProductListVo> getProductList() {
        return productList;
    }

    /**
     * Setter method for property <tt>productList</tt>.
     * 
     * @param productList value to be assigned to property productList
     */
    public void setProductList(List<ProductListVo> productList) {
        this.productList = productList;
    }

    /**
     * Getter method for property <tt>message</tt>.
     * 
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     * 
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
