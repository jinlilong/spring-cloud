package org.loan.core.domain;

import java.io.Serializable;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-03-30 09:38:00
 */
public class QrtzCalendarsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private String            schedName;
    //
    private String            calendarName;
    //
    private String            calendar;

    /**
     * 设置：
     */
    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    /**
     * 获取：
     */
    public String getSchedName() {
        return schedName;
    }

    /**
     * 设置：
     */
    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    /**
     * 获取：
     */
    public String getCalendarName() {
        return calendarName;
    }

    /**
     * 设置：
     */
    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    /**
     * 获取：
     */
    public String getCalendar() {
        return calendar;
    }
}
