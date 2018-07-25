package org.loan.core.dao;

import java.util.List;
import java.util.Map;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.BestSignContractEntity;
import org.springframework.stereotype.Repository;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface BestSignContractDao extends BaseDao<BestSignContractEntity> {

    /**
     * 
     * @param bestSignContractEntity
     * @return
     */
    List<BestSignContractEntity> selectByParam(BestSignContractEntity bestSignContractEntity);

    /**
     * 
     * @param contractId
     * @return
     */
    BestSignContractEntity queryObjectByContractId(String contractId);

    /**
     * 根据uuid更新所有合同主体
     * @param bestSignContractEntity
     */
    void updateByUuid(BestSignContractEntity bestSignContractEntity);

    /**
     *根据合同contractId查找其他一起生成的contractId
     * @param contractId
     * @return List<BestSignContractEntity>
     */
    List<BestSignContractEntity> getOtherContractId(String contractId);

    /**
     *  根据合同号更新合同状态
     *  @param map
     *  @return
     * */
    int updateByContractId(Map<String, Object> map);

    /**
     *根据uuid查找其他一起生成的合同
     * @param uuid
     * @return List<BestSignContractEntity>
     */
    List<BestSignContractEntity> getOtherContractByUUID(String uuid);

    /**
     * 查询用户是否已签署主合同
     * @param userId
     * @return
     */
    BestSignContractEntity queryUserMainContract(Map<String, Object> map);

}
