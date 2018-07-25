/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.convertor;

import java.util.ArrayList;
import java.util.List;

import org.loan.borrow.model.resp.HomePageRegisterResp;
import org.loan.core.common.model.resp.borrow.BannerListResp;
import org.loan.core.common.model.resp.borrow.ProductListVo;
import org.loan.core.domain.ClBannerConfigEntity;
import org.loan.core.domain.ClProductEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: HomePageConvertor.java, v 0.1 2018年7月20日 下午2:25:48 jinlilong Exp $
 */
public class HomePageConvertor {

    /**
     * 
     * @param resp
     * @param bannerResp
     * @param productList
     * @return
     */
    public static List<ProductListVo> buildProduct(HomePageRegisterResp resp,
                                                   List<BannerListResp> bannerResp,
                                                   List<ClProductEntity> productList) {
        List<ProductListVo> productListVoList = new ArrayList<>();
        for (ClProductEntity clProductEntity : productList) {
            ProductListVo productListVo = new ProductListVo();
            productListVo.setDesc(clProductEntity.getMark());
            productListVo.setLogo(clProductEntity.getLogo());
            productListVo.setName(clProductEntity.getName());
            productListVo.setHighCredit(clProductEntity.getHighCredit());
            productListVo.setAuthDesc(clProductEntity.getAuthDesc());
            productListVo.setMortgageType(clProductEntity.getMortgageType());
            productListVoList.add(productListVo);
        }

        resp.setBannerList(bannerResp);
        return productListVoList;
    }

    /**
     * 
     * @param bannerList
     * @return
     */
    public static List<BannerListResp> buildBanner(List<ClBannerConfigEntity> bannerList) {
        List<BannerListResp> bannerResp = new ArrayList<>();
        for (ClBannerConfigEntity clBannerConfigEntity : bannerList) {
            BannerListResp bannerListResp = new BannerListResp();
            bannerListResp.setUrl(clBannerConfigEntity.getUrl());
            bannerResp.add(bannerListResp);
        }
        return bannerResp;
    }
}
