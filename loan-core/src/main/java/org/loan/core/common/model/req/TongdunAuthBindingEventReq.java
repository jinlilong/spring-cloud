package org.loan.core.common.model.req;

/**
 * @author liuzx
 * @desc 同盾信用分绑卡场景
 * @create 2018-06-15 15:23
 */
public class TongdunAuthBindingEventReq extends TongdunAuthBaseEventReq{
    /**
     * 账户手机
     */
    private String account_mobile;

    /**
     * 账户身份证
     */
    private String id_number;
    /**
     * 银行预留手机号
     */
    private String card_binding_mobile;
    /**
     * 银行卡号
     */
    private String card_number;

    public String getAccount_mobile() {
        return account_mobile;
    }

    public void setAccount_mobile(String account_mobile) {
        this.account_mobile = account_mobile;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getCard_binding_mobile() {
        return card_binding_mobile;
    }

    public void setCard_binding_mobile(String card_binding_mobile) {
        this.card_binding_mobile = card_binding_mobile;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }
}
