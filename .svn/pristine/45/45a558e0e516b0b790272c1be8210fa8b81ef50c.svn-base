package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 第三方支付额度信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClBankCreditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //开户行
    private String            bankName;
    //银行code
    private String            bankCode;
    //银行额度
    private BigDecimal        credit;
    //支付通道: 1:宝付 2:易宝 3:连连 4:富有 5:汇付天下 6:通联
    private String            type;

    /**
     * 设置：主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：开户行
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取：开户行
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置：银行code
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 获取：银行code
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置：银行额度
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * 获取：银行额度
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * 设置：支付通道: 1:宝付 2:易宝 3:连连 4:富有 5:汇付天下 6:通联
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：支付通道: 1:宝付 2:易宝 3:连连 4:富有 5:汇付天下 6:通联
     */
    public String getType() {
        return type;
    }
}
