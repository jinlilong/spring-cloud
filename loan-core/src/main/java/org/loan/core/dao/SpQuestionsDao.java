package org.loan.core.dao;

import java.util.List;

import org.loan.core.dao.base.BaseDao;
import org.loan.core.domain.SpQuestionsEntity;
import org.springframework.stereotype.Repository;

/**
 * 帮助中心-常见问题
 *
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-06-08 14:00:07
 */
@Repository
public interface SpQuestionsDao extends BaseDao<SpQuestionsEntity> {

    /**
     * 常见问题列表
     *
     * @param type
     * @return
     */
    List<SpQuestionsEntity> queryListByType(String type);

}
