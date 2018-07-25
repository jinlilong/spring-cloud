package org.loan.core.dao;

import java.math.BigDecimal;
import java.util.List;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClBorrowRepayEntity;
import org.springframework.stereotype.Repository;

/**
 * 还款计划表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface ClBorrowRepayDao extends BaseDao<ClBorrowRepayEntity> {

    /**
     * 是否第一次借款
     * @param  userId
     * @return 为空则为第一次借款
     * */
    String queryByUserId(long userId);

    /**
     * 计算已还款的数量
     * @param repayId
     * @return
     */
    int countHasRepay(Long borrowId);

    /**
     * 查询最近一期未还款的
     * @param borrowId
     * @return
     */
    ClBorrowRepayEntity queryCurrentRepay(Long borrowId);

    /**
     * 更新所有未还款的为已还款
     * @param borrowId
     */
    void updateAllBorrowRepayHasRepay(Long borrowId);

    /**
     * 计算已还款的所有本金金额
     * @param borrowId
     * @return
     */
    BigDecimal sumHasRepayRealAmount(Long borrowId);

    /**
     * 根据borrowId查询用户是否有逾期记录
     * @param borrowId
     * @return
     */
    ClBorrowRepayEntity queryOverdueRepayByBorrowId(Long borrowId);

    /**
     * 根据userId查询用户是否有逾期记录
     * @param borrowId
     * @return
     */
    ClBorrowRepayEntity queryOverdueRepayByUserId(Long UserId);

    /**
     * 查询分期记录第一期记录
     * @param borrowId
     * @return
     */
    ClBorrowRepayEntity queryFirstPeriodsRepay(Long borrowId);

    /**
     * 计算最近一期未还的记录
     * @param borrowId
     * @return
     */
    ClBorrowRepayEntity queryLatestUnRepay(Long borrowId);

    /**
     * 查询用户是否有未还款的记录
     * @param userId
     * @return
     */
    ClBorrowRepayEntity queryUserUnRepay(Long userId);

    /**
     * 根据borrowId 查询borrowRepay
     * @param borrowId
     * @return
     */
    List<ClBorrowRepayEntity> queryBorrowRepayByBorrowId(Long borrowId);

}
