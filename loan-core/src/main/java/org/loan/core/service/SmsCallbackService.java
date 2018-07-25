/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

/**
 * 营销短信回调通知service
 * @author jinlilong
 * @version $Id: SmsCallbackService.java, v 0.1 2018年6月13日 下午1:49:44 jinlilong Exp $
 */
public interface SmsCallbackService {

    /**
     * 短信回调操作
     * @param data
     */
    public void updateSmsByRyzt(String data);
}
