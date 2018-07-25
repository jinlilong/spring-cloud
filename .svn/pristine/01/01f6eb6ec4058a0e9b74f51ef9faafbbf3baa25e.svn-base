package org.loan.user.service.impl;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.enums.UserAuthStateEnums;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.dao.ClUserAuthDao;
import org.loan.core.dao.ClUserAuthRuleDao;
import org.loan.core.dao.ClUserAuthTypeDao;
import org.loan.core.dao.ClUserDao;
import org.loan.core.dao.SpUserDao;
import org.loan.core.domain.ClUserAuthEntity;
import org.loan.core.domain.ClUserAuthRuleEntity;
import org.loan.core.domain.ClUserAuthTypeEntity;
import org.loan.core.domain.SpUserEntity;
import org.loan.user.convertor.AuthTypeConvertor;
import org.loan.user.model.resp.AuthListResp;
import org.loan.user.model.resp.AuthTypeResp;
import org.loan.user.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xlk
 * on 2018/7/20 0020.
 */
@Service("userAuthService")
public class UserAuthServiceImpl implements UserAuthService {

    @Autowired
    private ClUserAuthDao clUserAuthDao;
    @Autowired
    private ClUserDao clUserDao;
    @Autowired
    private ClUserAuthRuleDao clUserAuthRuleDao;
    @Autowired
    private ClUserAuthTypeDao clUserAuthTypeDao;
    @Autowired
    private SpUserDao spUserDao;


    @Override
    public AuthListResp authList(Long userId,String mortgageType) {
        AuthListResp authListResp = new AuthListResp();
        authListResp.setMoreState(UserAuthStateEnums.AFTER.getCode());
        authListResp.setAllState(UserAuthStateEnums.AFTER.getCode());
       // String mortgageType = clUserDao.queryObject(userId).getMortgageType();
        //todo 1.我的  2.邀请码
        if (StringUtils.isEmpty(mortgageType)) {
            //老用户 默认车位抵押
            mortgageType = BaseBizConstants.ZERO;
        }
        //根据mortgageType查认证规则
        ClUserAuthRuleEntity clUserAuthRuleEntity = clUserAuthRuleDao.queryByMortgageType(mortgageType);
        String needId = clUserAuthRuleEntity.getAuthTypeId();
        String notNeedId = clUserAuthRuleEntity.getNotNeedId();
        //所有启用的规则
        List <ClUserAuthTypeEntity> clUserAuthTypeEntityList = clUserAuthTypeDao.queryListByUse(BaseBizConstants.ONE);
        if (CollectionUtils.isEmpty(clUserAuthTypeEntityList)) {
            throw new ServiceException("认证规则不存在");
        }
        //用户认证状态
        ClUserAuthEntity clUserAuthEntity = clUserAuthDao.queryByUserId(userId);
        List <AuthTypeResp> needList = new ArrayList <>();
        List <AuthTypeResp> notNeedList = new ArrayList <>();
        for (ClUserAuthTypeEntity clUserAuthTypeEntity : clUserAuthTypeEntityList) {
            AuthTypeResp authTypeResp = AuthTypeConvertor.entityToResp(clUserAuthTypeEntity, clUserAuthEntity);
            String userAuthId = String.valueOf(clUserAuthTypeEntity.getId());
            if (needId.contains(userAuthId)) {
                //必填认证
                needList.add(authTypeResp);
            } else if (notNeedId.contains(userAuthId)) {
                //非必填认证
                notNeedList.add(authTypeResp);
            } else {
                //提额认证
                if ((!UserAuthStateEnums.AFTER.getCode().equals(authTypeResp.getState()))) {
                    authListResp.setMoreState(UserAuthStateEnums.BEFORE.getCode());
                }
            }
        }
        SpUserEntity spUserEntity=spUserDao.querySpUserByClUserId(userId);
        if(null==spUserEntity){
            //未关联审批系统
            authListResp.setAllState(UserAuthStateEnums.BEFORE.getCode());
        }
        authListResp.setNotNeedList(notNeedList);
        authListResp.setNeedList(needList);
        return authListResp;
    }
}
