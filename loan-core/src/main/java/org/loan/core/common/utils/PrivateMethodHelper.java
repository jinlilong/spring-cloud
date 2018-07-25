package org.loan.core.common.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 动态执行某类某方法
 * @author xlk
 * on 2018/4/20 0020.
 */
public class PrivateMethodHelper {

    /**
     * @param clazzName 类名
     * @param methodName 方法名
     * @param params 参数...
     * */
    public static Object invoke(String clazzName, String methodName, Object... params) {
        try {
            Class<?> clazz = Class.forName(clazzName);
            Object obj = clazz.newInstance();
            Method[] methods = clazz.getDeclaredMethods();
            Method callMethod = null;
            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    callMethod = method;
                    break;
                }
            }
            callMethod.setAccessible(true);
            return callMethod.invoke(obj, params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object springInvokeForSign(String clazzName, String methodName,
                                             Object... params) {
        Object obj = SpringContextHolder.getBean(clazzName);
        try {
            return obj.getClass().getDeclaredMethod(methodName, Long.class).invoke(obj, params);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
