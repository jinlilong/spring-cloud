package org.loan.core.common.exception;

/**
 * Copyright (c) 2018 All Rights Reserved.
 */

/**
 * 
 * @author jinlilong
 * @version $Id: ServiceException.java, v 0.1 2018年7月17日 下午3:56:40 jinlilong Exp $
 */
public class ServiceException extends RuntimeException {

    /**  */
    private static final long serialVersionUID = -4935705083392263697L;

    /**  异常码*/
    private String            code;

    /**  异常信息*/
    private String            message;

    /**
     * @param message
     */
    public ServiceException(String message) {
        this.message = message;
        this.code = "400";
    }

    /**
     * @param code
     * @param message
     */
    public ServiceException(String code, String message) {
        this.message = message;
        this.code = code;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>message</tt>.
     * 
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     * 
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
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
