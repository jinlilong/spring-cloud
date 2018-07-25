package org.loan.core.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by   on 2017/10/30.
 */
public class NidGenerator {
    public static final Logger       logger = LoggerFactory.getLogger(NidGenerator.class);
    protected final SimpleDateFormat sdf    = new SimpleDateFormat("yyyyMMdd");

    public static int getHashCode() {
        int hashCode = UUID.randomUUID().toString().hashCode();
        if (hashCode < 0) {
            hashCode = -hashCode;
        }
        return hashCode;
    }

    public static String getOrderNo() {
        int hashCode = getHashCode();
        return String.format("%011d", hashCode);
    }

    public static String getPayOrderNo() {
        int hashCode = getHashCode();
        return String.format("%010d", hashCode);
    }

    /**
     * 评分卡nid
     *
     * @return
     */
    public static String getCardNid() {
        int hashCode = getHashCode();
        return "CC" + String.format("%011d", hashCode);
    }

    /**
     * 评分项目nid
     *
     * @return
     */
    public static String getItemNid() {
        int hashCode = getHashCode();
        return "CI" + String.format("%011d", hashCode);
    }

    /**
     * 评分卡因子nid
     *
     * @return
     */
    public static String getFactorNid() {
        int hashCode = getHashCode();
        return "CF" + String.format("%011d", hashCode);
    }

    /**
     * 获取预绑卡唯一code
     * @return
     */
    public static String getConfirmBindCardSerialNo() {
        int hashCode = getHashCode();
        //corm_bind_card_Serial_No
        return "CBCSN" + String.format("%015d", hashCode);
    }

    /**
     * 获取预绑卡唯一商户订单号
     * @return
     */
    public static String getPreBindCardTransId() {
        int hashCode = getHashCode();
        //pre_bind_card_trans_id
        return "PBCTD" + String.format("%015d", hashCode);
    }

    /**
     * 获取预支付唯一商户订单 号
     * @return
     */
    public static String getPrePayTransId() {
        int hashCode = getHashCode();
        //pre_pay_Trans_Id
        return "PPTD" + String.format("%015d", hashCode);
    }

    /**
     * 获取预支付唯一商户流水号
     * @return
     */
    public static String getPrePaySerialNo() {
        int hashCode = getHashCode();
        //pre_pay_Trans_Id
        return "PPSN" + String.format("%015d", hashCode);
    }

    /**
     * 
     * @return
     */
    public static String getPayOrderNum() {
        int hashCode = getHashCode();
        return "PON" + String.format("%011d", hashCode);
    }

    /**
     * 获取代收code
     * @return
     */
    public static String getIncomeOrderNum() {
        int hashCode = getHashCode();
        return "PIN" + String.format("%011d", hashCode);
    }

    /**
     * 获取企业流水号
     * @return
     */
    public static String getIncomeCompanyOrderNum() {
        int hashCode = getHashCode();
        return "PICN" + String.format("%011d", hashCode);
    }

    /**
     * 
     * @return
     */
    public static String getPayContractNum() {
        int hashCode = getHashCode();
        return "PCN" + String.format("%011d", hashCode);
    }

    /**
     * 评分参数nid
     *
     * @return
     */
    public static String getParamNid() {
        int hashCode = getHashCode();
        return "CFP" + String.format("%010d", hashCode);
    }

    /**
     * 获得uuid作为token
     * @return
     */
    public static String getUuId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args) {

        System.out.println("FYP" + String.format("%010d", NidGenerator.getHashCode())
                           + DateUtil.formatDate(new Date(), "yyyyMMddHHmmss")
                           + StringUtils.randomNum(100));
        /*logger.info(getCardNid());
        logger.info(getItemNid());
        logger.info(getFactorNid());
        logger.info(getParamNid());
        logger.info(getOrderNo());*/
        /*System.out.println(getPreBindCardSerialNo());*/
    }
}
