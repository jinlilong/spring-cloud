/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

import java.util.List;

import org.loan.core.domain.BestSignContractEntity;

import com.alibaba.fastjson.JSONObject;

/**
 * 上上签合同相关接口
 * @author jinlilong
 * @version $Id: ContractService.java, v 0.1 2018年4月26日 下午5:09:40 jinlilong Exp $
 */
public interface ContractService {

    /**
     * 根据合同ID获取合同url
     * @param contractId
     * @return
     */
    String getDownloadURLs(String contractId);

    /**
     *结束合同是否成功
      * @param jsonObject {contractId}
     * @return* */
    Boolean finish(JSONObject jsonObject);

    /**
     * 自动签署书否成功
     * @param jsonObject {contractId}
     * @return
     * */
    Boolean signCert(JSONObject jsonObject);

    /**
     *根据合同contractId查找其他一起生成的contractId
     * @param contractId
     * @return List<BestSignContractEntity>
     */
    List<BestSignContractEntity> getOtherContractId(String contractId);

    /**
     * 签署所有合同
     * @param contractId
     * @param userId
     */
    void autoBestSign(String contractId, Long userId, String signType);

    /**
     * 更新批量合同的borrowId
     * @param contractId
     */
    void updateAllBestSignBorrowId(String contractId, Long borrowId);

    /**
     * 查询用户是否只需要签订租金支付计划表
     * @param userId
     * @return
     */
    String queryUserBorrowContractType(Long userId);

}
