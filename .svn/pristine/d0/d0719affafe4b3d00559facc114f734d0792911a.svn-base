package org.loan.core.dao;

import java.util.List;
import java.util.Map;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClPayLogEntity;
import org.springframework.stereotype.Repository;

/**
 * 支付记录表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
@Repository
public interface ClPayLogDao extends BaseDao<ClPayLogEntity> {

    /**
     * 根据orderNO查询日志
     * @param orderNo
     * @return
     */
    public ClPayLogEntity queryByOrderNo(String orderNo);

    /**
     * 查询所有待付款的paylog
     * @return
     */
    public List<ClPayLogEntity> queryPendingPaymentPayLog(Map<String, Object> map);

    /**
     * 根据repayId查询 成功的支付记录日志
     * @param repayId
     * @return
     */
    public ClPayLogEntity queryByRepayId(Long repayId);

    /**
     * 根据borrowId,repayId 查询代扣待支付的记录
     * @param clPayLogEntity
     * @return
     */
    public ClPayLogEntity queryUnRepayStateLog(Map<String, Object> map);

}
