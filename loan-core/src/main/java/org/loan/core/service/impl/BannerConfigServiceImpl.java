/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.enums.BorrowCatEnums;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.dao.ClBannerConfigDao;
import org.loan.core.dao.ClUserDao;
import org.loan.core.dao.SpPhoneDao;
import org.loan.core.domain.ClBannerConfigEntity;
import org.loan.core.domain.ClUserEntity;
import org.loan.core.domain.SpPhoneEntity;
import org.loan.core.service.BannerConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: BannerConfigServiceImpl.java, v 0.1 2018年7月4日 下午2:27:25 jinlilong Exp $
 */
@Service("bannerConfigService")
public class BannerConfigServiceImpl implements BannerConfigService {

    /**  */
    @Autowired
    private ClBannerConfigDao clBannerConfigDao;

    /**  */
    @Autowired
    private ClUserDao         clUserDao;

    /**  */
    @Autowired
    private SpPhoneDao        spPhoneDao;

    /** 
     * @see com.hwc.framework.modules.service.BannerConfigService#queryBanner(java.lang.Long)
     */
    @Override
    public List<ClBannerConfigEntity> queryBanner(Long userId, String positions) {

        Map<String, Object> map = new HashMap<>();
        ClUserEntity clUserEntity = clUserDao.queryObject(userId);
        //若为线上用户
        if (clUserEntity != null && StringUtils.equals(clUserEntity.getMortgageType(),
            BorrowCatEnums.MORTGAGE_TYPE_ONLINE_CREDIT.getMortgageType())) {
            map.put("type", BaseBizConstants.TWO);
        } else {
            //判断是否在线上名单库
            SpPhoneEntity spPhoneEntity = spPhoneDao.queryByPhone(clUserEntity.getLoginName());
            if (spPhoneEntity != null
                && StringUtils.equals(spPhoneEntity.getType(), BaseBizConstants.ONE))
                map.put("type", BaseBizConstants.TWO);
        }
        if (!map.containsKey("type")) {
            map.put("type", BaseBizConstants.ONE);
        }
        map.put("state", BaseBizConstants.ONE);
        map.put("date", new Date());
        map.put("positions", positions);
        List<ClBannerConfigEntity> list = clBannerConfigDao.queryList(map);
        return list;
    }

}
