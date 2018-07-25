package org.loan.user.model.resp;

/**
 * @author xlk
 * on 2018/7/20 0020.
 */
public class AuthTypeResp {
    //类型code
    private String code;
    //排序
    private Integer sort;
    //描述
    private String description;
    //认证状态
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
