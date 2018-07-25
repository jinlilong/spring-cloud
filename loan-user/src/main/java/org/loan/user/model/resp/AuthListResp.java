package org.loan.user.model.resp;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author xlk
 * on 2018/7/20 0020.
 */
public class AuthListResp {
    /**
     * 必选认证
     * */
    private List <AuthTypeResp> needList;

    /**
     * 非必选
     * */
    private List <AuthTypeResp> notNeedList;

    /**
     * 提额认证
     * */
    private String moreState;

    /**
     *  申请状态
     * */
    private String allState;

    public List <AuthTypeResp> getNeedList() {
        return needList;
    }

    public void setNeedList(List <AuthTypeResp> needList) {
        this.needList = needList;
    }

    public List <AuthTypeResp> getNotNeedList() {
        return notNeedList;
    }

    public void setNotNeedList(List <AuthTypeResp> notNeedList) {
        this.notNeedList = notNeedList;
    }

    public String getMoreState() {
        return moreState;
    }

    public void setMoreState(String moreState) {
        this.moreState = moreState;
    }

    public String getAllState() {
        return allState;
    }

    public void setAllState(String allState) {
        this.allState = allState;
    }
}
