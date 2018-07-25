package org.loan.core.common.model;

import java.util.List;

import org.loan.core.domain.SpQuestionsEntity;

/**
 * @author liuzx
 * @desc 常见问题转化类
 * @create 2018-06-12 18:44
 */
public class SPQuestionDTO {

    /**
     * 问题类别名称
     */
    private String                  categoryName;

    /**
     * 问题列表
     */
    private List<SpQuestionsEntity> questionsList;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<SpQuestionsEntity> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<SpQuestionsEntity> questionsList) {
        this.questionsList = questionsList;
    }

}
