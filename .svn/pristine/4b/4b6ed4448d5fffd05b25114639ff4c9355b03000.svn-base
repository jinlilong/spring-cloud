/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service;

/**
 * redis
 * @author jinlilong
 * @version $Id: RedisService.java, v 0.1 2018年7月20日 上午10:11:34 jinlilong Exp $
 */
public interface RedisService {

    /**
     * 可以自行设置缓存时间
     * @param key
     * @param t
     * @param timeouts
     * @return
     */
    public <T> boolean set(String key, T t, int timeouts);

    /**
     * 默认缓存时间，默认是10分钟
     * @param key
     * @param t
     * @param timeouts
     * @return
     */
    public <T> boolean set(String key, T t);

    /**
     * 返回redis内容
     * @param key
     * @return
     */
    public <T> T get(String key, Class<T> classs);

    /**
     * 
     * @param key
     * @return
     */
    public String getString(String key);

}
