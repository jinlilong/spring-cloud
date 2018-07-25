/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.constant;

/**
 * 
 * @author jinlilong
 * @version $Id: SpConfigKeyConstants.java, v 0.1 2018年3月29日 下午6:09:45 jinlilong Exp $
 */
public class SpConfigKeyConstants {

    public static final String SYS_CONFIG_KEY               = "SYS_CONFIG_";

    /**  等额本金提前还款是否开启,key*/
    public static final String REPAYMENT_DEBJ_ADVANCE_STATE = SYS_CONFIG_KEY
                                                              + "REPAYMENT_DEBJ_ADVANCE_STATE";

    /**  等额本息提前还款是否开启,key*/
    public static final String REPAYMENT_DEBX_ADVANCE_STATE = SYS_CONFIG_KEY
                                                              + "REPAYMENT_DEBX_ADVANCE_STATE";

    /**  先息后本提前还款是否开启,key*/
    public static final String REPAYMENT_XXHB_ADVANCE_STATE = SYS_CONFIG_KEY
                                                              + "REPAYMENT_XXHB_ADVANCE_STATE";

    /**  等本等息提前还款是否开启,key*/
    public static final String REPAYMENT_DBDX_ADVANCE_STATE = SYS_CONFIG_KEY
                                                              + "REPAYMENT_DBDX_ADVANCE_STATE";

    /**  上上签地址*/
    public static final String CONTRACT_HOST                = "CONTRACT_HOST";

    /**  */
    public static final String CONTRACT_DEVELOPERID         = "CONTRACT_DEVELOPERID";

    /**  */
    public static final String CONTRACT_PEM                 = "CONTRACT_PEM";

    /**  手持身份证验证是否开启，1：开启，0：不开启*/
    public static final String IDEN_OPEN_CONFIG             = "IDEN_OPEN_CONFIG";

    /**  富友配置*/
    public static final String PAY_CHANNEL_FUYOU_CONFIG     = "PAY_CHANNEL_FUYOU_CONFIG";

    /**  宝付配置*/
    public static final String PAY_CHANNEL_BAOFU_CONFIG     = "PAY_CHANNEL_BAOFU_CONFIG";

    /**  */
    public static final String CONTRACT_COMPANY_NAME        = "CONTRACT_COMPANY_NAME";

    /**  */
    public static final String CONTRACT_NAME                = "CONTRACT_NAME";

    /**  */
    public static final String CONTRACT_ADDRESS             = "CONTRACT_ADDRESS";

    /**  */
    public static final String CONTRACT_PHONE               = "CONTRACT_PHONE";

    /**  */
    public static final String CREDIT_ONLINE_AUTO_USER_ID   = "CREDIT_ONLINE_AUTO_USER_ID";

    /** 同盾信用分配置 */
    public static final String TONG_DUN_CREDIT_SCORE_CONFIG = "TONG_DUN_CREDIT_SCORE_CONFIG";

    /**  是否开启借款*/
    public static final String SYSTEM_BORROW_OPEN           = "SYSTEM_BORROW_OPEN";

    /**  每次借款最低额度*/
    public static final String MIN_BORROW_CREDIT            = "MIN_BORROW_CREDIT";

    /**  最高可借额度，用户无额度时，展示*/
    public static final String MAX_HONE_BORROW_HIGH_CREDIT  = "MAX_HONE_BORROW_HIGH_CREDIT";

    /**  用户信息没有时显示*/
    public static final String USER_TIPS_MESSAGE            = "USER_TIPS_MESSAGE";

    /**  客服中心号码*/
    public static final String TELEPHONE_NUMBERS            = "TELEPHONE_NUMBERS";

}
