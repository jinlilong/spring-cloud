/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.loan.core.common.exception.ServiceException;
import org.loan.core.common.model.req.BindCardFuYouReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author jinlilong
 * @version $Id: BeanUtils.java, v 0.1 2018年5月9日 下午4:38:54 jinlilong Exp $
 */
public class BeanUtils {

    private static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    public static <T> T mapToBeans(Map<String, Object> source, Class<T> instance) {
        try {
            T object = instance.newInstance();
            Field[] fields = object.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                FieldName fieldName = field.getAnnotation(FieldName.class);
                if (fieldName != null) {
                    field.set(object, source.get(fieldName.value()));
                } else {
                    field.set(object, source.get(field.getName()));
                }
            }
            return object;
        } catch (Exception e) {
            logger.error("map转换bean失败", e);
            throw new ServiceException("系统异常");
        }
    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userNm", "金力龙");
        System.out.println(JSONObject.toJSON(BeanUtils.mapToBeans(map, BindCardFuYouReq.class)));
    }
}
