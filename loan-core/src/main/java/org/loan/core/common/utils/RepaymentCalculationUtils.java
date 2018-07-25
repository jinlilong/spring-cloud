/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.loan.core.common.enums.RateTypeEnums;
import org.loan.core.common.enums.RepaymentMethodEnums;
import org.loan.core.common.model.req.RepaymentCalculationReq;
import org.loan.core.common.model.resp.Repayment;
import org.loan.core.common.model.resp.RepaymentListResp;

import com.alibaba.fastjson.JSONObject;

/**
 * 还款计算规则
 * @author jinlilong
 * @version $Id: RepaymentCalculationUtils.java, v 0.1 2018年3月6日 下午2:37:58 jinlilong Exp $
 */
public class RepaymentCalculationUtils {

    /**
     * 
     * @param req
     * @return
     */
    public static Repayment calculation(RepaymentCalculationReq req) {

        if (RepaymentMethodEnums.AVERAGE_CAPITAL.getCode().equals(req.getRepaymentMethod())) {
            return averageCapital(req);
        } else if (RepaymentMethodEnums.AVERAGE_CAPITAL_PLUS_INTEREST.getCode()
            .equals(req.getRepaymentMethod())) {
            return averageCapitalPlusInterest(req);
        } else if (RepaymentMethodEnums.AFTER_THE_FIRST_REST.getCode()
            .equals(req.getRepaymentMethod())) {
            return afterTheFirstRest(req);
        } else if (RepaymentMethodEnums.EQUAL_INTEREST_AND_INTEREST.getCode()
            .equals(req.getRepaymentMethod())) {
            return equalInterestAndInterest(req);
        }
        return null;
    }

    /**
     * 等额本金计算
     * @param req
     * @return
     */
    public static Repayment averageCapital(RepaymentCalculationReq req) {

        Repayment repayment = new Repayment();

        BigDecimal amount = req.getAmount();
        int month = req.getTotalMonth();
        BigDecimal sub_amount = new BigDecimal(0);
        BigDecimal totalInterest = new BigDecimal(0);
        List<RepaymentListResp> list = new ArrayList<>();
        for (int i = 0; i < req.getTotalMonth(); i++) {

            RepaymentListResp resp = new RepaymentListResp();
            //等额本金
            BigDecimal monthPri = getPerMonthPrincipal(req.getAmount(), month);
            if (FsUtils.mulDecimal(monthPri, new BigDecimal(req.getTotalMonth()))
                .doubleValue() < amount.doubleValue()) {
                if (i == 0) {
                    monthPri = FsUtils.subDecimal(amount,
                        FsUtils.mulDecimal(monthPri, new BigDecimal(month - 1)));
                }
            }
            resp.setMonthPri(String.valueOf(FsUtils.roundDecimal(monthPri, 2)));
            resp.setSeq(String.valueOf(i + 1));
            //累积已还的本金，用于计算未还剩余本金
            sub_amount = FsUtils.addDecimal(sub_amount, monthPri);
            Date repayDate = DateUtil.addMonths(i + 1, req.getStartDate());
            resp.setDate(DateUtil.formatDate(repayDate, DateUtil.sdf));

            Date lastRepayDate = DateUtil.addMonths(i, req.getStartDate());
            int days = Math.abs(DateUtil.daysBetween(repayDate, lastRepayDate));
            resp.setDays(days);
            //设置剩余本金
            BigDecimal blance = FsUtils.subDecimal(amount, sub_amount);
            resp.setBalance(String.valueOf(FsUtils.roundDecimal(blance, 2)));

            BigDecimal newRate = null;
            if (!StringUtils.isEmpty(req.getRateType())
                && StringUtils.equals(req.getRateType(), RateTypeEnums.MONTH_RATE.getCode())) {
                newRate = RateUtils.getRate(req.getRate());
                resp.setRateType(req.getRateType());
            } else {
                newRate = RateUtils.getRate(req.getRate()).multiply(new BigDecimal(days));
                resp.setRateType(RateTypeEnums.DAY_RATE.getCode());
            }
            //计算利息
            BigDecimal interest = FsUtils
                .roundDecimal(FsUtils.addDecimal(blance, monthPri).multiply(newRate), 2);
            totalInterest = totalInterest.add(interest);
            resp.setInterest(String.valueOf(interest));
            resp.setRate(req.getRate());
            BigDecimal total = FsUtils.roundDecimal(monthPri.add(interest), 2);
            resp.setTotal(String.valueOf(total));
            list.add(resp);
        }
        repayment.setList(list);
        repayment.setTotalInterest(String.valueOf(totalInterest));
        BigDecimal totalRepayMoney = req.getAmount().add(totalInterest);
        repayment.setTotalRepayMoney(String.valueOf(totalRepayMoney));
        return repayment;
    }

    /**
     * 等额本息计算
     * @param req
     * @return
     */
    public static Repayment averageCapitalPlusInterest(RepaymentCalculationReq req) {

        BigDecimal yearRate = null;
        if (!StringUtils.isEmpty(req.getRateType())
            && StringUtils.equals(req.getRateType(), RateTypeEnums.MONTH_RATE.getCode())) {
            yearRate = new BigDecimal(req.getRate()).divide(new BigDecimal(100))
                .multiply(new BigDecimal(12));
        } else {
            yearRate = RateUtils.getYearRate(req.getRate());
        }
        List<RepaymentListResp> list = new ArrayList<>();
        //计算每月还款利息
        Map<Integer, BigDecimal> mapInterest = AverageCapitalPlusInterestUtils.getPerMonthInterest(
            req.getAmount().doubleValue(), yearRate.doubleValue(), req.getTotalMonth());

        //计算每月还款本金 
        Map<Integer, BigDecimal> mapPrincipal = AverageCapitalPlusInterestUtils
            .getPerMonthPrincipal(req.getAmount().doubleValue(), yearRate.doubleValue(),
                req.getTotalMonth());

        //每月本息
        double perMonthPrincipalInterest = AverageCapitalPlusInterestUtils
            .getPerMonthPrincipalInterest(req.getAmount().doubleValue(), yearRate.doubleValue(),
                req.getTotalMonth());
        //总利息
        double totalInterest = AverageCapitalPlusInterestUtils.getInterestCount(
            req.getAmount().doubleValue(), yearRate.doubleValue(), req.getTotalMonth());

        BigDecimal totalMonthPri = new BigDecimal(0);
        for (int i = 1; i <= req.getTotalMonth(); i++) {
            RepaymentListResp resp = new RepaymentListResp();
            resp.setMonthPri(String.valueOf(mapPrincipal.get(i)));
            totalMonthPri = totalMonthPri.add(mapPrincipal.get(i));
            resp.setBalance(
                String.valueOf(FsUtils.roundDecimal(req.getAmount().subtract(totalMonthPri), 2)));

            Date repayDate = DateUtil.addMonths(i, req.getStartDate());
            resp.setDate(DateUtil.formatDate(repayDate, DateUtil.sdf));

            Date lastRepayDate = DateUtil.addMonths(i - 1, req.getStartDate());
            int days = Math.abs(DateUtil.daysBetween(repayDate, lastRepayDate));
            resp.setDays(days);

            resp.setInterest(String.valueOf(FsUtils.roundDecimal(mapInterest.get(i), 2)));
            resp.setRate(req.getRate());
            resp.setSeq(String.valueOf(i));
            resp.setTotal(String.valueOf(perMonthPrincipalInterest));

            if (!StringUtils.isEmpty(req.getRateType())
                && StringUtils.equals(req.getRateType(), RateTypeEnums.MONTH_RATE.getCode())) {
                resp.setRateType(RateTypeEnums.MONTH_RATE.getCode());
            } else {
                resp.setRateType(RateTypeEnums.DAY_RATE.getCode());
            }

            list.add(resp);
        }
        Repayment repayment = new Repayment();
        repayment.setList(list);
        repayment.setTotalInterest(
            String.valueOf(FsUtils.roundDecimal(new BigDecimal(totalInterest), 2)));
        BigDecimal totalRepayMoney = FsUtils
            .roundDecimal(req.getAmount().add(new BigDecimal(totalInterest)), 2);
        repayment.setTotalRepayMoney(String.valueOf(totalRepayMoney));
        return repayment;
    }

    /**
     * 先息后本计算
     * @param req
     * @return
     */
    public static Repayment afterTheFirstRest(RepaymentCalculationReq req) {
        Repayment repayment = new Repayment();
        BigDecimal totalInterest = new BigDecimal(0);
        List<RepaymentListResp> list = new ArrayList<>();
        for (int i = 0; i < req.getTotalMonth(); i++) {
            RepaymentListResp resp = new RepaymentListResp();
            BigDecimal monthPri = new BigDecimal(0);
            if (i == req.getTotalMonth() - 1) {
                monthPri = req.getAmount();
            }
            resp.setMonthPri(String.valueOf(monthPri));
            resp.setBalance(String.valueOf(req.getAmount()));
            Date repayDate = DateUtil.addMonths(i + 1, req.getStartDate());
            resp.setDate(DateUtil.formatDate(repayDate, DateUtil.sdf));

            Date lastRepayDate = DateUtil.addMonths(i, req.getStartDate());
            int days = Math.abs(DateUtil.daysBetween(repayDate, lastRepayDate));
            resp.setDays(days);

            resp.setRate(req.getRate());
            resp.setSeq(String.valueOf(i + 1));
            BigDecimal interest = null;
            if (!StringUtils.isEmpty(req.getRateType())
                && StringUtils.equals(req.getRateType(), RateTypeEnums.MONTH_RATE.getCode())) {
                interest = FsUtils
                    .roundDecimal(RateUtils.getRate(req.getRate()).multiply(req.getAmount()), 2);
                resp.setRateType(RateTypeEnums.MONTH_RATE.getCode());
            } else {
                interest = FsUtils.roundDecimal(RateUtils.getRate(req.getRate())
                    .multiply(new BigDecimal(days)).multiply(req.getAmount()), 2);
                resp.setRateType(RateTypeEnums.DAY_RATE.getCode());
            }
            totalInterest = totalInterest.add(interest);
            resp.setInterest(String.valueOf(interest));
            resp.setTotal(String.valueOf(interest.add(monthPri)));
            list.add(resp);
        }
        repayment.setList(list);
        repayment.setTotalInterest(String.valueOf(FsUtils.roundDecimal(totalInterest, 2)));
        BigDecimal totalRepayMoney = req.getAmount().add(totalInterest);
        repayment.setTotalRepayMoney(String.valueOf(FsUtils.roundDecimal(totalRepayMoney, 2)));
        return repayment;
    }

    /**
     * 等本等息计算公式
     * @param req
     * @return
     */
    public static Repayment equalInterestAndInterest(RepaymentCalculationReq req) {
        Repayment repayment = new Repayment();
        BigDecimal sub_amount = new BigDecimal(0);
        BigDecimal interest = null;
        if (!StringUtils.isEmpty(req.getRateType())
            && StringUtils.equals(req.getRateType(), RateTypeEnums.MONTH_RATE.getCode())) {
            interest = req.getAmount().multiply(RateUtils.getRate(req.getRate()));
        } else {
            interest = req.getAmount().multiply(RateUtils.getMonthRate(req.getRate()));
        }
        List<RepaymentListResp> list = new ArrayList<>();
        for (int i = 0; i < req.getTotalMonth(); i++) {
            RepaymentListResp resp = new RepaymentListResp();
            //
            BigDecimal monthPri = getPerMonthPrincipal(req.getAmount(), req.getTotalMonth());
            if (FsUtils.mulDecimal(monthPri, new BigDecimal(req.getTotalMonth()))
                .doubleValue() < req.getAmount().doubleValue()) {
                if (i == 0) {
                    monthPri = FsUtils.subDecimal(req.getAmount(),
                        FsUtils.mulDecimal(monthPri, new BigDecimal(req.getTotalMonth() - 1)));
                }
            }
            resp.setMonthPri(String.valueOf(FsUtils.roundDecimal(monthPri, 2)));
            resp.setSeq(String.valueOf(i + 1));
            //累积已还的本金，用于计算未还剩余本金
            sub_amount = FsUtils.addDecimal(sub_amount, monthPri);
            Date repayDate = DateUtil.addMonths(i + 1, req.getStartDate());
            resp.setDate(DateUtil.formatDate(repayDate, DateUtil.sdf));
            Date lastRepayDate = DateUtil.addMonths(i, req.getStartDate());
            int days = Math.abs(DateUtil.daysBetween(repayDate, lastRepayDate));
            resp.setDays(days);
            //设置剩余本金
            BigDecimal blance = FsUtils.subDecimal(req.getAmount(), sub_amount);
            resp.setBalance(String.valueOf(FsUtils.roundDecimal(blance, 2)));
            resp.setInterest(String.valueOf(FsUtils.roundDecimal(interest, 2)));
            resp.setRate(req.getRate());
            BigDecimal total = monthPri.add(interest);
            resp.setTotal(String.valueOf(FsUtils.roundDecimal(total, 2)));

            if (!StringUtils.isEmpty(req.getRateType())
                && StringUtils.equals(req.getRateType(), RateTypeEnums.MONTH_RATE.getCode())) {
                resp.setRateType(RateTypeEnums.MONTH_RATE.getCode());
            } else {
                resp.setRateType(RateTypeEnums.DAY_RATE.getCode());
            }
            list.add(resp);
        }
        //计算总利息
        BigDecimal totalInterest = interest.multiply(new BigDecimal(req.getTotalMonth()));
        repayment.setTotalInterest(String.valueOf(FsUtils.roundDecimal(totalInterest, 2)));
        repayment.setTotalRepayMoney(
            String.valueOf(FsUtils.roundDecimal(req.getAmount().add(totalInterest), 2)));
        repayment.setList(list);
        return repayment;
    }

    /**
     * 等额本金计算获取还款方式为等额本金的每月偿还本金
     * <p>
     * 公式：每月应还本金=贷款本金÷还款月数
     *
     * @param invest     总借款额（贷款本金）
     * @param totalMonth 还款总月数
     * @return 每月偿还本金
     */
    public static BigDecimal getPerMonthPrincipal(BigDecimal invest, int totalMonth) {

        BigDecimal monthIncome = invest.divide(new BigDecimal(totalMonth), 2,
            BigDecimal.ROUND_DOWN);

        return monthIncome;
    }

    public static void main(String[] args) {
        RepaymentCalculationReq req = new RepaymentCalculationReq();
        req.setAmount(new BigDecimal(10000));
        req.setRate("0.04");
        req.setRepaymentMethod(RepaymentMethodEnums.AVERAGE_CAPITAL.getCode());
        req.setStartDate(new Date());
        req.setTotalMonth(5);
        Repayment repayment = RepaymentCalculationUtils.calculation(req);
        System.out.println("等额本息---应还本息总和：" + JSONObject.toJSONString(repayment));
    }
}
