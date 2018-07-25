/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.service;

import org.loan.borrow.model.resp.HomePageRegisterResp;
import org.loan.borrow.model.resp.HomePageResp;

/**
 * 
 * @author jinlilong
 * @version $Id: HomePageService.java, v 0.1 2018年7月19日 下午5:04:01 jinlilong Exp $
 */
public interface HomePageService {

    /**
     * 首页信息
     * @return
     */
    HomePageResp homePage(Long userId);

    /**
     * 注册后，未确定产品时的首页
     * @param userId
     * @return
     */
    HomePageRegisterResp homePageRegister(Long userId);

}
