/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author jinlilong
 * @version $Id: FieldName.java, v 0.1 2018年5月9日 下午4:48:03 jinlilong Exp $
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
public @interface FieldName {
    /**
     * 字段名
     */
    String value() default "";

    /**
     * 是否忽略
     */
    boolean Ignore() default false;
}
