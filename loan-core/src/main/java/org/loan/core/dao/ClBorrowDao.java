package org.loan.core.dao;

import java.math.BigDecimal;
import java.util.Map;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClBorrowEntity;
import org.springframework.stereotype.Repository;

/**
 * 借款信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface ClBorrowDao extends BaseDao<ClBorrowEntity> {

    /**
     * 查询用户Id查询合同最大序列号
     * @param clUserId
     * @return
     */
    public Integer queryMaxContractNum(Long clUserId);

    /**
     * 根据用户ID查询用订单数量
     * @param clUserId
     * @return
     */
    public Integer queryBorrowCountNum(Long clUserId);

    /**
     * 查询用户单日借款金额 
     * @param map
     * @return
     */
    public BigDecimal queryUserDayBorrowAmount(Map<String, Object> map);

    /**
     * 根据唯一流水号查询订单
     * @param orderNo
     * @return
     */
    public ClBorrowEntity queryByOrderNo(String orderNo);

}
