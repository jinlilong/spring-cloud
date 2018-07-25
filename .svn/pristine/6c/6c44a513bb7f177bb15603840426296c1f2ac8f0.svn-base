/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.constant.ContractUrlConstants;
import org.loan.core.common.constant.SpConfigKeyConstants;
import org.loan.core.common.enums.BorrowCatEnums;
import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.utils.BestSignUtils;
import org.loan.core.common.utils.HttpSender;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.dao.BestSignContractDao;
import org.loan.core.domain.BestSignContractEntity;
import org.loan.core.domain.SpCreditEntity;
import org.loan.core.service.ContractService;
import org.loan.core.service.RedisService;
import org.loan.core.service.SpConfigService;
import org.loan.core.service.SpCreditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author jinlilong
 * @version $Id: ContractServiceImpl.java, v 0.1 2018年4月26日 下午5:11:16 jinlilong Exp $
 */
@Service("contractService")
public class ContractServiceImpl implements ContractService {

    /**  */
    private static final Logger logger = LoggerFactory.getLogger(ContractServiceImpl.class);
    /**  */
    @Autowired
    private SpConfigService     spConfigService;

    /**  */
    @Autowired
    private BestSignContractDao bestSignContractDao;

    /**  */
    @Autowired
    private SpCreditService     spCreditService;

    @Autowired
    private ContractService     contractService;

    /**  */
    @Autowired
    private RedisService        redisService;

    /**
     * @see com.hwc.framework.modules.service.ContractService#getDownloadURLs(java.lang.String)
     */
    @Override
    public String getDownloadURLs(String contractId) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("contractId", contractId);
        JSONObject post = null;
        try {
            post = post(data, ContractUrlConstants.getDownloadURLs);
        } catch (Exception e) {
            logger.error("上上签接口调用失败", e);
            throw new ServiceException("系统异常");
        }
        JSONArray array = post.getJSONArray("contractList");
        JSONObject json = null;
        if (array != null && array.size() > 0) {
            json = array.getJSONObject(0);
        }

        if (json != null) {
            return json.getString("url");
        }
        return null;
    }

    @SuppressWarnings("serial")
    @Override
    public Boolean signCert(JSONObject jsonObject) {
        String path = "/contract/sign/cert/";
        // new JSONArray();
        JSONArray array = jsonObject.getJSONArray("signaturePositions");
        Map<String, Object> data = new HashMap<String, Object>() {
            {
                put("contractId", jsonObject.getString("contractId"));
                put("signer", jsonObject.getString("userId"));
                put("signaturePositions", array);
            }
        };
        try {
            post(data, path);
        } catch (Exception e) {
            logger.error("上上签接口调用失败{}", e);
            throw new ServiceException("合同签署发生异常");
        }
        return true;
    }

    @Override
    public Boolean finish(JSONObject jsonObject) {
        String path = "/contract/finish/";
        @SuppressWarnings("serial")
        Map<String, Object> data = new HashMap<String, Object>() {
            {
                put("contractId", jsonObject.getString("contractId"));
            }
        };
        try {
            post(data, path);
        } catch (Exception e) {
            logger.error("上上签接口调用失败{}", e);
            throw new ServiceException("合同签署发生异常");
        }
        return true;
    }

    @Override
    public List<BestSignContractEntity> getOtherContractId(String contractId) {
        return bestSignContractDao.getOtherContractId(contractId);
    }

    /**
     * @param data
     * @param path
     * @return
     * @throws Exception
     */
    private JSONObject post(Map<String, Object> data, String path) throws Exception {
        String host = spConfigService.querySpConfigByKey(SpConfigKeyConstants.CONTRACT_HOST)
            .getValue();
        String developerId = spConfigService
            .querySpConfigByKey(SpConfigKeyConstants.CONTRACT_DEVELOPERID).getValue();
        String pem = spConfigService.querySpConfigByKey(SpConfigKeyConstants.CONTRACT_PEM)
            .getValue();
        String url = host + BestSignUtils.getPostUrlByRsa(developerId, pem, data, path);
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        String dataString = JSONObject.toJSONString(data);
        logger.info("请求ssq,request data:{},path:{}", dataString, path);
        Map<String, Object> res = HttpSender.getResponseString("POST", url, dataString, headers);
        String responeseString = (String) res.get("responseData");
        logger.info("ssq响应,response data:{},path:{}", responeseString, path);
        JSONObject json = JSON.parseObject(responeseString);
        if (responeseString == null || !json.containsKey("errno")) {
            throw new ServiceException("系统异常");
        } else if (json.getIntValue("errno") != 0) {
            throw new ServiceException("系统异常");
        }
        return json.getJSONObject("data");
    }

    /** 
     * @see com.hwc.framework.modules.service.ContractService#autoBestSign(java.lang.String, java.lang.Long)
     */
    @Override
    public void autoBestSign(String contractId, Long userId, String signType) {
        Map<String, Object> updateMap = new HashMap<>(2);
        updateMap.put("status", 2);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("contractId", contractId);
        jsonObject.put("userId", userId);
        SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(userId);
        List<BestSignContractEntity> contractList = getOtherContractId(contractId);
        if (CollectionUtils.isEmpty(contractList)) {
            throw new ServiceException("无相关合同");
        }
        int size = contractList.size();
        if (null == spCreditEntity || size == 1) {
            finish(jsonObject);
            updateMap.put("contractId", contractId);
            bestSignContractDao.updateByContractId(updateMap);
        } else {
            String contractType = spCreditService.getContractType(userId);
            //ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
            for (int i = 0; i < size; i++) {
                final int index = i;
                String signStr = redisService
                    .getString("contract:config:contract_type:" + contractType + "file_type"
                               + contractList.get(index).getFileType());
                if (StringUtils.isEmpty(signStr)) {
                    logger.error("合同类型{},文件类型{}", contractType,
                        contractList.get(index).getFileType());
                    throw new ServiceException("合同签署失败,请重新生成合同");
                }
                JSONObject signJson = JSONObject.parseObject(signStr);
                JSONArray signaturePositions = new JSONArray();
                signaturePositions.add(signJson.getJSONObject("user"));
                jsonObject.put("signaturePositions", signaturePositions);
                jsonObject.put("contractId", contractList.get(index).getContractid());
                //用户已经签署的合同||全部需要静默签的情况时
                if (StringUtils.equals(signType, BaseBizConstants.ONE)
                    || !contractId.equals(contractList.get(index).getContractid())) {
                    //静默签署
                    Boolean certBoolean = signCert(jsonObject);
                    if (!certBoolean) {
                        logger.error("签署合同参数{}", jsonObject);
                        throw new ServiceException("合同签署失败");
                    }
                }
                //结束合同
                Boolean finishBoolean = finish(jsonObject);
                if (!finishBoolean) {
                    logger.error("签署合同参数{}", jsonObject);
                    throw new ServiceException("合同签署失败");
                }
                updateMap.put("contractId", contractList.get(index).getContractid());
                bestSignContractDao.updateByContractId(updateMap);
            }
        }
    }

    /** 
     * @see com.hwc.framework.modules.service.ContractService#updateAllBestSignBorrowId(java.lang.String)
     */
    @Override
    public void updateAllBestSignBorrowId(String contractId, Long borrowId) {
        BestSignContractEntity bestSignContractEntity = bestSignContractDao
            .queryObjectByContractId(contractId);
        if (bestSignContractEntity == null) {
            throw new ServiceException("查询合同不存在");
        }
        BestSignContractEntity update = new BestSignContractEntity();
        update.setUuid(bestSignContractEntity.getUuid());
        update.setBorrowId(borrowId);
        bestSignContractDao.updateByUuid(update);
    }

    /** 
     * @see com.hwc.framework.modules.service.ContractService#queryUserBorrowContractType(java.lang.Long)
     */
    @Override
    public String queryUserBorrowContractType(Long userId) {
        String cardType = BaseBizConstants.ONE;
        SpCreditEntity spCreditEntity = spCreditService.querySpCreditByClUserId(userId);
        //非审批用户
        if (null == spCreditEntity) {
            return cardType;
        }

        //若是车位抵押且有证车位，只需走租金支付计划表
        if (StringUtils.equals(spCreditEntity.getMortgageType(),
            BorrowCatEnums.MORTGAGE.getMortgageType())
            && StringUtils.equals(spCreditEntity.getIsCredentials(), BaseBizConstants.ONE)) {
            return cardType;
        }

        //若是线上信用。每次都要签多份合同
        if (StringUtils.equals(spCreditEntity.getMortgageType(),
            BorrowCatEnums.MORTGAGE_TYPE_ONLINE_CREDIT.getMortgageType())) {
            return BaseBizConstants.ZERO;
        }

        String upLoadContract = spCreditEntity.getUploadContract();
        //线下签合同
        if (BaseBizConstants.ZERO.equals(upLoadContract)) {
            return cardType;
        }
        //是否第一次签署合同
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);
        map.put("contractNum", spCreditEntity.getContractNum());
        BestSignContractEntity bestSignContractEntity = bestSignContractDao
            .queryUserMainContract(map);
        if (bestSignContractEntity != null) {
            return cardType;
        } else {
            return BaseBizConstants.ZERO;
        }

    }

}
