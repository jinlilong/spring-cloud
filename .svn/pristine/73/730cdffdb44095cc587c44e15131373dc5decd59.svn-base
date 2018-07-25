/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.service.impl;

import java.util.List;

import org.loan.borrow.convertor.HomePageConvertor;
import org.loan.borrow.model.resp.HomePageRegisterResp;
import org.loan.borrow.model.resp.HomePageResp;
import org.loan.borrow.service.HomePageService;
import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.constant.SpConfigKeyConstants;
import org.loan.core.common.enums.BannerTypeEnums;
import org.loan.core.common.model.resp.borrow.BannerListResp;
import org.loan.core.common.model.resp.borrow.ProductListVo;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.domain.ArcCreditEntity;
import org.loan.core.domain.ClBannerConfigEntity;
import org.loan.core.domain.ClProductEntity;
import org.loan.core.domain.SpConfigEntity;
import org.loan.core.domain.SpCreditEntity;
import org.loan.core.service.ArcCreditCoreService;
import org.loan.core.service.BannerConfigService;
import org.loan.core.service.ClUserMessageService;
import org.loan.core.service.ContractService;
import org.loan.core.service.ProductService;
import org.loan.core.service.SpConfigService;
import org.loan.core.service.SpCreditService;
import org.loan.core.service.UserAuthCoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: HomePageServiceImpl.java, v 0.1 2018年7月19日 下午5:03:48 jinlilong Exp $
 */
@Service("homePageService")
public class HomePageServiceImpl implements HomePageService {

    /**  */
    private static final Logger  logger = LoggerFactory.getLogger(HomePageServiceImpl.class);

    /**  */
    @Autowired
    private BannerConfigService  bannerConfigService;

    /**  */
    @Autowired
    private SpConfigService      spConfigService;

    /**  */
    @Autowired
    private ClUserMessageService clUserMessageService;

    /**  */
    @Autowired
    private UserAuthCoreService  userAuthCoreService;

    /**  */
    @Autowired
    private ArcCreditCoreService arcCreditCoreService;

    /**  */
    @Autowired
    private ContractService      contractService;

    /**  */
    @Autowired
    private SpCreditService      spCreditService;

    /**  */
    @Autowired
    private ProductService       productService;

    /** 
     * @see org.loan.borrow.service.HomePageService#homePage(java.lang.Long)
     */
    @Override
    public HomePageResp homePage(Long userId) {
        HomePageResp resp = new HomePageResp();
        //查询banner
        List<ClBannerConfigEntity> bannerList = bannerConfigService.queryBanner(userId,
            BannerTypeEnums.HOME_PAGE.getCode());
        List<BannerListResp> bannerResp = HomePageConvertor.buildBanner(bannerList);
        //用户信息
        String message = clUserMessageService.queryUserMessage(userId);
        //查询用户的额度
        String maxCredit = null;
        ArcCreditEntity arcCreditEntity = arcCreditCoreService.queryByUserId(userId);
        if (arcCreditEntity != null) {
            if (arcCreditEntity.getTotal().doubleValue() > 0) {
                //有真实额度
                resp.setHaveTrueCredit(true);
                maxCredit = StringUtils.subZeroAndDot(String.valueOf(arcCreditEntity.getUnuse()));
            } else {
                SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(userId);
                if (spCreditEntity != null) {
                    resp.setHaveTrueCredit(true);
                    maxCredit = BaseBizConstants.ZERO;
                }
            }
        }
        if (maxCredit == null) {
            SpConfigEntity spConfigEntity = spConfigService
                .querySpConfigByKey(SpConfigKeyConstants.MAX_HONE_BORROW_HIGH_CREDIT);
            maxCredit = spConfigEntity.getValue();
        }
        resp.setMortgageType(BaseBizConstants.ONE);
        resp.setBannerList(bannerResp);
        resp.setMessage(message);
        resp.setMaxCredit(maxCredit);
        //判断是否完成基础认证
        resp.setAuthState(userAuthCoreService.queryUserHaveAuthentication(userId));
        //判断是否完成提额认证
        resp.setMoreState(userAuthCoreService.queryUserHaveMoreAuthentication(userId));
        //判断用户是否完成设置交易密码
        resp.setTradeState(userAuthCoreService.queryUserHaveSetPwd(userId));
        resp.setButtonClickState(true);
        //按钮能否点击   1、有真实额度，且没有可用额度时，不可点击     2、无可用额度，且基础认证和设置交易密码已完成，也是不能点击的
        if (resp.isHaveTrueCredit() && Double.valueOf(maxCredit) <= 0) {
            resp.setButtonClickState(false);
        }
        if (arcCreditEntity != null && arcCreditEntity.getTotal().doubleValue() == 0
            && resp.isAuthState() && resp.isTradeState()) {
            resp.setButtonClickState(false);
        }
        resp.setContractType(contractService.queryUserBorrowContractType(userId));
        return resp;
    }

    /** 
     * @see org.loan.borrow.service.HomePageService#homePageRegister(java.lang.Long)
     */
    @Override
    public HomePageRegisterResp homePageRegister(Long userId) {
        HomePageRegisterResp resp = new HomePageRegisterResp();
        //查询banner
        List<ClBannerConfigEntity> bannerList = bannerConfigService.queryBanner(userId,
            BannerTypeEnums.HOME_PAGE_REGISTER.getCode());
        List<BannerListResp> bannerResp = HomePageConvertor.buildBanner(bannerList);
        //用户信息
        String message = clUserMessageService.queryUserMessage(userId);
        //查询产品
        List<ClProductEntity> productList = productService.queryProduct();
        List<ProductListVo> productListVoList = HomePageConvertor.buildProduct(resp, bannerResp,
            productList);
        resp.setMessage(message);
        resp.setProductList(productListVoList);
        return resp;
    }

}
