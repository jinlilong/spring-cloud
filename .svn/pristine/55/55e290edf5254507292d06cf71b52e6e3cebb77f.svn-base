package org.loan.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 借款信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:21:26
 */
public class ClBorrowEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //用户id
    private Long              userId;
    //真实名字
    private String            name;
    //手机号码
    private String            mobile;
    //订单号
    private String            orderNo;
    //借款类型， X  信用类 ,D  抵押类
    private String            borrowType;
    //抵押物申请订单号
    private Long              mid;
    //借款金额,应还金额。本息
    private BigDecimal        amount;
    //实际到账金额,即本金
    private BigDecimal        realAmount;
    //综合费用(借款利息+服务费+信息认证费)
    private BigDecimal        fee;
    //分期数
    private Integer           periods;
    //订单生成时间
    private Date              createTime;
    //借款期限(天)
    private String            timeLimit;
    //订单状态   15 待初审  16 初审不通过  22自动审核未决待人工复审 26人工复审通过 27人工复审不通过 30-待还款 40-已还款 41减免还款 50已逾期 90 坏账
    private String            state;
    //审核通过后有效期时间
    private Date              expireTime;
    //
    private String            isnotify;
    //收款银行卡关联id
    private Long              cardId;
    //服务费
    private BigDecimal        serviceFee;
    //流量费
    private BigDecimal        flowFee;
    //信息认证费
    private BigDecimal        infoAuthFee;
    //消费场景
    private String            scenes;
    //借款利息
    private BigDecimal        interest;
    //借款日利率
    private BigDecimal        rate;
    //客户端 默认10-移动app
    private String            client;
    //发起借款地址
    private String            address;
    //借款经纬度坐标
    private String            coordinate;
    //备注、审核说明
    private String            remark;
    //放款时间
    private Date              loanTime;
    //ip地址
    private String            ip;
    //合同id
    private String            contractId;
    //计算逾期时间
    private Date              overdueTime;
    //还款方式0:等额本金，1：等额本息，2：先息后本
    private String            repaymentMethod;

    //富友借款时，项目录入ID，用于代扣
    private String            projectId;

    /**
     * 是否线上放款，1：线上，0：线下
     */
    private String            isOnline;

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
     * 设置：用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：真实名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：真实名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取：手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置：订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取：订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置：借款类型， X  信用类 ,D  抵押类
     */
    public void setBorrowType(String borrowType) {
        this.borrowType = borrowType;
    }

    /**
     * 获取：借款类型， X  信用类 ,D  抵押类
     */
    public String getBorrowType() {
        return borrowType;
    }

    /**
     * 设置：抵押物申请订单号
     */
    public void setMid(Long mid) {
        this.mid = mid;
    }

    /**
     * 获取：抵押物申请订单号
     */
    public Long getMid() {
        return mid;
    }

    /**
     * 设置：借款金额,应还金额。本息
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取：借款金额,应还金额。本息
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置：实际到账金额,即本金
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 获取：实际到账金额,即本金
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * 设置：综合费用(借款利息+服务费+信息认证费)
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取：综合费用(借款利息+服务费+信息认证费)
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置：分期数
     */
    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    /**
     * 获取：分期数
     */
    public Integer getPeriods() {
        return periods;
    }

    /**
     * 设置：订单生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：订单生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：借款期限(天)
     */
    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * 获取：借款期限(天)
     */
    public String getTimeLimit() {
        return timeLimit;
    }

    /**
     * 设置：订单状态   15 待初审  16 初审不通过  22自动审核未决待人工复审 26人工复审通过 27人工复审不通过 30-待还款 40-已还款 41减免还款 50已逾期 90 坏账
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：订单状态   15 待初审  16 初审不通过  22自动审核未决待人工复审 26人工复审通过 27人工复审不通过 30-待还款 40-已还款 41减免还款 50已逾期 90 坏账
     */
    public String getState() {
        return state;
    }

    /**
     * 设置：审核通过后有效期时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取：审核通过后有效期时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置：
     */
    public void setIsnotify(String isnotify) {
        this.isnotify = isnotify;
    }

    /**
     * 获取：
     */
    public String getIsnotify() {
        return isnotify;
    }

    /**
     * 设置：收款银行卡关联id
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取：收款银行卡关联id
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * 设置：服务费
     */
    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * 获取：服务费
     */
    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    /**
     * 设置：流量费
     */
    public void setFlowFee(BigDecimal flowFee) {
        this.flowFee = flowFee;
    }

    /**
     * 获取：流量费
     */
    public BigDecimal getFlowFee() {
        return flowFee;
    }

    /**
     * 设置：信息认证费
     */
    public void setInfoAuthFee(BigDecimal infoAuthFee) {
        this.infoAuthFee = infoAuthFee;
    }

    /**
     * 获取：信息认证费
     */
    public BigDecimal getInfoAuthFee() {
        return infoAuthFee;
    }

    /**
     * 设置：消费场景
     */
    public void setScenes(String scenes) {
        this.scenes = scenes;
    }

    /**
     * 获取：消费场景
     */
    public String getScenes() {
        return scenes;
    }

    /**
     * 设置：借款利息
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * 获取：借款利息
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * 设置：借款日利率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取：借款日利率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置：客户端 默认10-移动app
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * 获取：客户端 默认10-移动app
     */
    public String getClient() {
        return client;
    }

    /**
     * 设置：发起借款地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取：发起借款地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置：借款经纬度坐标
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * 获取：借款经纬度坐标
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * 设置：备注、审核说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：备注、审核说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：放款时间
     */
    public void setLoanTime(Date loanTime) {
        this.loanTime = loanTime;
    }

    /**
     * 获取：放款时间
     */
    public Date getLoanTime() {
        return loanTime;
    }

    /**
     * 设置：ip地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取：ip地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置：合同id
     */
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * 获取：合同id
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * 设置：计算逾期时间
     */
    public void setOverdueTime(Date overdueTime) {
        this.overdueTime = overdueTime;
    }

    /**
     * 获取：计算逾期时间
     */
    public Date getOverdueTime() {
        return overdueTime;
    }

    /**
     * 设置：还款方式0:等额本金，1：等额本息，2：先息后本
     */
    public void setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod;
    }

    /**
     * 获取：还款方式0:等额本金，1：等额本息，2：先息后本
     */
    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    /**
     * Getter method for property <tt>projectId</tt>.
     * 
     * @return property value of projectId
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Setter method for property <tt>projectId</tt>.
     * 
     * @param projectId value to be assigned to property projectId
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * Getter method for property <tt>serialversionuid</tt>.
     * 
     * @return property value of serialVersionUID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
