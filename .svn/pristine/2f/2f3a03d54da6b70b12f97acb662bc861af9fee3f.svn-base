package org.loan.core.dao;

import java.util.List;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.ClTongdunCreditScoreLogEntity;
import org.springframework.stereotype.Repository;

/**
 * 同盾信用分请求记录
 *
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-19 09:32:56
 */
@Repository
public interface ClTongdunCreditScoreLogDao extends BaseDao<ClTongdunCreditScoreLogEntity> {

    /**
     * 根据用户编号查询同盾信用分记录
     * @param userId
     * @return
     */
    ClTongdunCreditScoreLogEntity queryObjectByUserId(String userId);

    /**
     * 查询同盾报告
     * @return
     */
    List<ClTongdunCreditScoreLogEntity> queryUnHaveReportData();

}
