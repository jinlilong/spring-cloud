/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

/**
 * 
 * @author jinlilong
 * @version $Id: ClUserMessageService.java, v 0.1 2018年5月17日 下午3:23:12 jinlilong Exp $
 */
public interface ClUserMessageService {

    /**
     * 创建一条用户消息
     * @param content
     * @param userId
     */
    public void saveUserMessage(String content, Long userId);

    /**
     * 查询用户的消息
     * @param userId
     */
    public String queryUserMessage(Long userId);
}
