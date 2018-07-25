/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.convertor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import org.loan.core.common.constant.BaseBizConstants;
import org.loan.core.common.enums.BorrowPayLogStateEnums;
import org.loan.core.common.enums.PayLogScenesEnums;
import org.loan.core.common.enums.PayLogTypeEnums;
import org.loan.core.common.model.PayChannelConfig;
import org.loan.core.common.model.req.BindCardReq;
import org.loan.core.common.model.req.PayForQueryOrderReq;
import org.loan.core.common.model.req.PayForReq;
import org.loan.core.common.model.resp.IncomeResp;
import org.loan.core.common.model.resp.PayforResp;
import org.loan.core.common.utils.CentUtils;
import org.loan.core.common.utils.DateUtil;
import org.loan.core.common.utils.FsUtils;
import org.loan.core.common.utils.NidGenerator;
import org.loan.core.common.utils.StringUtils;
import org.loan.core.domain.ClBankCardEntity;
import org.loan.core.domain.ClPayLogEntity;
import org.loan.core.domain.ClUserBaseInfoEntity;
import org.loan.core.domain.SpPayChannelConfigEntity;

/**
 * 
 * @author jinlilong
 * @version $Id: PaymentChannelServiceConvertor.java, v 0.1 2018年5月14日 上午10:27:06 jinlilong Exp $
 */
public class PaymentChannelServiceConvertor {

    /**
     * 
     * @param req
     * @param entity
     * @param map
     * @param payChannelConfig
     */
    public static void buildBaofuBindCardReq(BindCardReq req, SpPayChannelConfigEntity entity,
                                             Map<String, Object> map) {
        map.put("biz_type", "0000");
        map.put("trans_id", NidGenerator.getPreBindCardTransId());
        map.put("acc_no", req.getCardNo());
        map.put("id_card_type", entity.getBankCode());
        map.put("id_card", req.getIdNo());
        map.put("id_holder", req.getUserName());
        map.put("mobile", req.getMobile());
        map.put("pay_code", entity.getChannelCode());
        map.put("trade_date", DateUtil.formatDate(new Date(), DateUtil.sdf3));
    }

    /**
     * 
     * @param req
     * @param map
     * @param payChannelConfig
     */
    public static void buildBaofuConfirmBindCardReq(BindCardReq req, Map<String, Object> map,
                                                    PayChannelConfig payChannelConfig) {
        map.put("biz_type", "0000");
        map.put("terminal_id", payChannelConfig.getTerminalId());
        map.put("member_id", payChannelConfig.getMerchantNo());
        map.put("sms_code", req.getSmsCode());
        map.put("trade_date", DateUtil.formatDate(new Date(), DateUtil.sdf3));
    }

    /**
     * 
     * @param req
     * @param entity
     * @param map
     */
    public static void buildFuYouBindCardReq(BindCardReq req, SpPayChannelConfigEntity entity,
                                             Map<String, Object> map) {
        map.put("bankCd", entity.getChannelCode());
        map.put("userNm", req.getUserName());
        map.put("credtNo", req.getIdNo());
        map.put("mobileNo", req.getMobile());
        map.put("acntNo", req.getCardNo());
    }

    /**
     * 
     * @param req
     * @param map
     */
    public static void buildFuYouConfirmBindCardReq(BindCardReq req, Map<String, Object> map) {
        map.put("acntNo", req.getCardNo());
        map.put("verifyCode", req.getSmsCode());
    }

    /**
     * 
     * @param req
     * @param bankCard
     * @param map
     */
    public static void buildBaofuPayforReq(PayForReq req, ClBankCardEntity bankCard,
                                           Map<String, Object> map,
                                           PayChannelConfig payChannelConfig) {

        map.put("biz_type", "0000");
        map.put("terminal_id", payChannelConfig.getTerminalId());
        map.put("member_id", payChannelConfig.getMerchantNo());
        map.put("bind_id", bankCard.getAgreeNo());
        map.put("trans_id", NidGenerator.getPrePayTransId());
        map.put("txn_amt", CentUtils.convertToCent(req.getAmount()));//金额以分为单位(整型数据)并把元转换成分         
        map.put("trans_serial_no", NidGenerator.getPrePaySerialNo());
        map.put("trade_date", DateUtil.formatDate(new Date(), DateUtil.sdf3));

    }

    /**
     * 
     * @param req
     * @param userBankCard
     * @param payChannelConfig
     * @param clUserBaseInfoEntity
     * @param map
     */
    public static void buildFuyouInsrpoReq(PayForReq req, ClBankCardEntity userBankCard,
                                           PayChannelConfig payChannelConfig,
                                           ClUserBaseInfoEntity clUserBaseInfoEntity,
                                           Map<String, Object> map, String projectSsn,
                                           BigDecimal amount) {
        //富友项目录入   项目金额未实际借款金额的10倍，防止无法代扣，，     还款会做校验，当还款金额大于项目金额是无法还款的，项目日期同理， 所有期限和项目金额尽量大一点
        map.put("ver", "2.00");
        map.put("orderno", String.format("%011d", NidGenerator.getHashCode()));
        map.put("mchnt_nm", payChannelConfig.getMerchantName());
        map.put("project_ssn", projectSsn);
        map.put("project_amt", CentUtils.convertToCent(amount));
        map.put("contract_nm", "FYCN" + String.format("%011d", NidGenerator.getHashCode()));
        map.put("project_deadline", String.valueOf(req.getPeriods() * 30));
        map.put("bor_nm", clUserBaseInfoEntity.getRealName());
        map.put("id_tp", "0");
        map.put("id_no", clUserBaseInfoEntity.getIdNo());
        map.put("card_no", userBankCard.getCardNo());
        map.put("mobile_no", userBankCard.getPhone());
        map.put("max_invest_num", "999");
        map.put("min_invest_num", "0");
    }

    /**
     * 
     * @param req
     * @param bankCard
     * @param map
     */
    public static void buildFuyouPayforReq(PayForReq req, ClBankCardEntity bankCard,
                                           Map<String, Object> map,
                                           ClUserBaseInfoEntity clUserBaseInfoEntity) {
        map.put("ver", "2.00");
        map.put("merdt", DateUtil.formatDate(new Date(), "yyyyMMdd"));
        map.put("orderno",
            "FYP" + String.format("%010d", NidGenerator.getHashCode())
                           + DateUtil.formatDate(new Date(), "yyyyMMddHHmmss")
                           + StringUtils.randomNum(100));
        map.put("bankno", bankCard.getBankCode());
        //默认北京市 
        map.put("cityno", "1000");
        map.put("accntno", bankCard.getCardNo());
        map.put("accntnm", clUserBaseInfoEntity.getRealName());
        map.put("amt", CentUtils.convertToCent(req.getAmount()));

        req.setOrderNo(map.get("orderno").toString());

    }

    /**
     * 
     * @param req
     * @param userBankCard
     * @param clUserBaseInfoEntity
     * @param map
     */
    public static void buildPayforBaofuReq(PayForReq req, ClBankCardEntity userBankCard,
                                           ClUserBaseInfoEntity clUserBaseInfoEntity,
                                           Map<String, Object> map) {
        map.put("amount", req.getAmount());
        map.put("realName", clUserBaseInfoEntity.getRealName());
        map.put("accNo", userBankCard.getCardNo());
        map.put("bankName", userBankCard.getBank());
        map.put("idNo", clUserBaseInfoEntity.getIdNo());
        map.put("mobile", userBankCard.getPhone());
        //baofoo_pay_num
        map.put("orderNo",
            "BFP" + String.format("%010d", NidGenerator.getHashCode())
                           + DateUtil.formatDate(new Date(), "yyyyMMddHHmmss")
                           + StringUtils.randomNum(100));

        req.setOrderNo(map.get("orderNo").toString());
    }

    /**
     * 
     * @param req
     * @param userBankCard
     * @param clUserBaseInfoEntity
     * @param projectId
     * @param map
     */
    public static void buildIncomeFuyouReq(PayForReq req, ClBankCardEntity userBankCard,
                                           ClUserBaseInfoEntity clUserBaseInfoEntity,
                                           String projectId, Map<String, Object> map) {
        map.put("ver", "2.00");
        map.put("merdt", DateUtil.formatDate(new Date(), DateUtil.sdf4));
        map.put("orderno",
            "FYI" + String.format("%010d", NidGenerator.getHashCode())
                           + DateUtil.formatDate(new Date(), "yyyyMMddHHmmss")
                           + StringUtils.randomNum(100));
        map.put("bankno", userBankCard.getBankCode());
        map.put("accntno", userBankCard.getCardNo());
        map.put("accntnm", clUserBaseInfoEntity.getRealName());
        map.put("amt", CentUtils.convertToCent(req.getAmount()));
        map.put("entseq", NidGenerator.getIncomeCompanyOrderNum());
        map.put("memo", "");
        map.put("mobile", userBankCard.getPhone());
        map.put("certtp", "0");
        map.put("certno", clUserBaseInfoEntity.getIdNo());
        map.put("projectid", projectId);
        map.put("txncd", "06");
    }

    /**
     * 
     * @param req
     * @param map
     */
    public static void buildIncomeBaofuReq(PayForReq req, Map<String, Object> map) {
        map.put("userId", req.getUserId());
        map.put("amount", CentUtils.convertToCent(req.getAmount()));
        map.put("orderno",
            "BFI" + String.format("%010d", NidGenerator.getHashCode())
                           + DateUtil.formatDate(new Date(), "yyyyMMddHHmmss")
                           + StringUtils.randomNum(100));
        map.put("msgId", "BFM" + String.format("%011d", NidGenerator.getHashCode()));
    }

    /**
     * 
     * @param req
     * @param map
     */
    public static void buildQueryOrderFuyouReq(PayForQueryOrderReq req, Map<String, Object> map,
                                               ClPayLogEntity clPayLogEntity) {
        map.put("ver", "1.00");
        map.put("busicd", "AP01");
        map.put("orderno", req.getOrderno());
        map.put("startdt", DateUtil
            .formatDate(DateUtil.getDayStartTime(clPayLogEntity.getCreateTime()), "yyyyMMdd"));
        map.put("enddt", DateUtil.formatDate(DateUtil.getDayEndTime(clPayLogEntity.getCreateTime()),
            "yyyyMMdd"));
    }

    /**
     * 
     * @param req
     * @param userBankCard
     * @param clUserBaseInfoEntity
     * @param payforResp
     * @return
     */
    public static ClPayLogEntity buildClPayLogEntity(PayForReq req, ClBankCardEntity userBankCard,
                                                     ClUserBaseInfoEntity clUserBaseInfoEntity,
                                                     PayforResp payforResp, Long borrowId) {
        ClPayLogEntity clPayLogEntity = new ClPayLogEntity();
        if (payforResp.isSuccess()) {
            clPayLogEntity.setState(BorrowPayLogStateEnums.STATE_PAYMENT_WAIT.getCode());
        } else {
            clPayLogEntity.setState(BorrowPayLogStateEnums.STATE_PAYMENT_FAILED.getCode());
        }
        clPayLogEntity.setAmount(req.getAmount());
        clPayLogEntity.setBank(userBankCard.getBank());
        clPayLogEntity.setCardNo(userBankCard.getCardNo());
        clPayLogEntity.setCreateTime(new Date());
        clPayLogEntity.setMobile(userBankCard.getPhone());
        clPayLogEntity.setName(clUserBaseInfoEntity.getRealName());
        clPayLogEntity.setOrderNo(payforResp.getOrderNo());
        clPayLogEntity.setPayReqTime(new Date());
        clPayLogEntity.setRemark(payforResp.getRemark());
        clPayLogEntity.setRepayId(0L);
        clPayLogEntity.setScenes(PayLogScenesEnums.PAY.getCode());
        clPayLogEntity.setSerialNumber(payforResp.getChannelOrderNo());
        clPayLogEntity.setSource("10");
        clPayLogEntity.setBorrowId(borrowId);
        clPayLogEntity.setType(PayLogTypeEnums.DF_ONLINE.getCode());
        clPayLogEntity.setUserId(req.getUserId());
        clPayLogEntity.setConfirmCode(BaseBizConstants.EMTPY_STR);
        clPayLogEntity.setPayCode(userBankCard.getPayCode());
        return clPayLogEntity;
    }

    /**
     * 
     * @param req
     * @param incomeResp
     * @param userBankCard
     * @param clUserBaseInfoEntity
     * @return
     */
    public static ClPayLogEntity buildClPayLogForIncome(PayForReq req, IncomeResp incomeResp,
                                                        ClBankCardEntity userBankCard,
                                                        ClUserBaseInfoEntity clUserBaseInfoEntity) {
        ClPayLogEntity clPayLogEntity = new ClPayLogEntity();
        if (incomeResp.isHandleState()) {
            clPayLogEntity.setState(BorrowPayLogStateEnums.STATE_PAYMENT_WAIT.getCode());
        } else {
            if (incomeResp.isSuccess()) {
                clPayLogEntity.setState(BorrowPayLogStateEnums.STATE_PAYMENT_SUCCESS.getCode());
            } else {
                clPayLogEntity.setState(BorrowPayLogStateEnums.STATE_PAYMENT_FAILED.getCode());
            }
        }
        clPayLogEntity.setAmount(req.getAmount());
        clPayLogEntity.setBank(userBankCard.getBank());
        clPayLogEntity.setBorrowId(req.getBorrowId());
        clPayLogEntity.setCardNo(userBankCard.getCardNo());
        clPayLogEntity.setCreateTime(new Date());
        clPayLogEntity.setMobile(userBankCard.getPhone());
        clPayLogEntity.setName(clUserBaseInfoEntity.getRealName());
        clPayLogEntity.setOrderNo(incomeResp.getOrderNo());
        clPayLogEntity.setPayReqTime(new Date());
        clPayLogEntity.setRemark(incomeResp.getRemark());
        clPayLogEntity.setRepayId(req.getRepayId());
        clPayLogEntity.setScenes(PayLogScenesEnums.REPAY.getCode());
        clPayLogEntity.setSerialNumber(BaseBizConstants.EMTPY_STR);
        clPayLogEntity.setSource("10");
        clPayLogEntity.setType(PayLogTypeEnums.DQ_ONLINE.getCode());
        clPayLogEntity.setUserId(req.getUserId());
        clPayLogEntity.setConfirmCode(BaseBizConstants.EMTPY_STR);
        clPayLogEntity.setPayCode(userBankCard.getPayCode());
        clPayLogEntity.setUpdateTime(new Date());
        if (req.getAdvanceAmount() != null) {
            clPayLogEntity.setAdvanceAmount(new BigDecimal(req.getAdvanceAmount()));
        }
        if (req.getRepayInterest() != null) {
            clPayLogEntity.setRepayInterest(new BigDecimal(req.getRepayInterest()));
        }
        return clPayLogEntity;
    }

    /**
     * 
     * @param req
     * @param incomeResp
     * @param userBankCard
     * @param clUserBaseInfoEntity
     * @return
     */
    public static ClPayLogEntity buildClPayLogForUnderIncome(PayForReq req,
                                                             ClBankCardEntity userBankCard,
                                                             ClUserBaseInfoEntity clUserBaseInfoEntity) {
        ClPayLogEntity clPayLogEntity = new ClPayLogEntity();
        clPayLogEntity.setState(BorrowPayLogStateEnums.STATE_PAYMENT_SUCCESS.getCode());
        clPayLogEntity.setAmount(req.getAmount());
        clPayLogEntity.setBank(BaseBizConstants.EMTPY_STR);
        clPayLogEntity.setBorrowId(req.getBorrowId());
        clPayLogEntity.setCardNo(BaseBizConstants.EMTPY_STR);
        clPayLogEntity.setCreateTime(new Date());
        clPayLogEntity.setMobile(userBankCard.getPhone());
        clPayLogEntity.setName(clUserBaseInfoEntity.getRealName());
        clPayLogEntity.setOrderNo(BaseBizConstants.EMTPY_STR);
        clPayLogEntity.setPayReqTime(new Date());
        clPayLogEntity.setRemark("线下还款成功");
        clPayLogEntity.setRepayId(req.getRepayId());
        clPayLogEntity.setScenes(PayLogScenesEnums.REPAY.getCode());
        clPayLogEntity.setSerialNumber(BaseBizConstants.EMTPY_STR);
        clPayLogEntity.setSource("10");
        clPayLogEntity.setType(PayLogTypeEnums.DQ_UNDERLINE.getCode());
        clPayLogEntity.setUserId(req.getUserId());
        clPayLogEntity.setConfirmCode(BaseBizConstants.EMTPY_STR);
        clPayLogEntity.setUpdateTime(new Date());
        clPayLogEntity.setPayCode(BaseBizConstants.EMTPY_STR);
        clPayLogEntity.setOrderNo("UL" + String.format("%011d", NidGenerator.getHashCode()));
        return clPayLogEntity;
    }

    public static void main(String[] args) {
        System.out.println("PBC" + System.currentTimeMillis() + FsUtils.randomNumeric(3));
    }
}
