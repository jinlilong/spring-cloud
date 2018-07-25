package org.loan.core.common.model.req;

/**
 * @author liuzx
 * @desc 同盾信用分审核核心场景请求
 * @create 2018-06-15 15:28
 */
public class TongdunAuthBaseEventReq {

    /**
     * 设备指纹web端 token_id
     */
    private String token_id;
    /**
     * 设备指纹移动端 black_box
     */
    private String black_box;

    /**
     * 用户编号
     */
    private String user_id;

    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }

    public String getBlack_box() {
        return black_box;
    }

    public void setBlack_box(String black_box) {
        this.black_box = black_box;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
