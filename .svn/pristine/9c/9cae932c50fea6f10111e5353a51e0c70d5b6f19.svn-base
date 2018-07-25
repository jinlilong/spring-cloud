/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.util.concurrent.TimeUnit;

import org.loan.core.common.utils.StringUtils;
import org.loan.core.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author jinlilong
 * @version $Id: RedisServiceImpl.java, v 0.1 2018年7月20日 上午10:11:50 jinlilong Exp $
 */
@Service("redisService")
public class RedisServiceImpl implements RedisService {

    public static final int               DEFAULT_TIME_OUT = 10 * 60;

    /**  token默认2个小时*/
    public static final int               TOKEN_TIME_OUT   = 60 * 60 * 2;

    /**  */
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /** 
     * @see org.loan.core.service.RedisService#set(java.lang.String, java.lang.Object, int)
     */
    @Override
    public <T> boolean set(String key, T t, int timeouts) {
        ValueOperations<String, String> operations = redisTemplate.opsForValue();
        operations.set(key, JSONObject.toJSONString(t), timeouts, TimeUnit.SECONDS);
        return true;
    }

    /** 
     * @see org.loan.core.service.RedisService#set(java.lang.String, java.lang.Object)
     */
    @Override
    public <T> boolean set(String key, T t) {
        ValueOperations<String, String> operations = redisTemplate.opsForValue();
        operations.set(key, JSONObject.toJSONString(t), DEFAULT_TIME_OUT, TimeUnit.SECONDS);
        return true;
    }

    /** 
     * @see org.loan.core.service.RedisService#get(java.lang.String)
     */
    @Override
    public <T> T get(String key, Class<T> classs) {
        ValueOperations<String, String> operations = redisTemplate.opsForValue();
        String value = operations.get(key);
        if (!StringUtils.isEmpty(value)) {
            return JSONObject.parseObject(value, classs);
        }
        return null;
    }

    /** 
     * @see org.loan.core.service.RedisService#getString(java.lang.String)
     */
    @Override
    public String getString(String key) {
        return redisTemplate.opsForValue().get(key);
    }

}
