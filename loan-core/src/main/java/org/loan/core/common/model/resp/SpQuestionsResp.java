/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.model.resp;

import java.util.List;

/**
 * 
 * @author jinlilong
 * @version $Id: SpQuestionsResp.java, v 0.1 2018年7月6日 下午3:44:44 jinlilong Exp $
 */
public class SpQuestionsResp {

    /**  */
    private List<SpQuestionsListResp> list;

    /**  */
    private String                    tabName;

    /**
     * Getter method for property <tt>list</tt>.
     * 
     * @return property value of list
     */
    public List<SpQuestionsListResp> getList() {
        return list;
    }

    /**
     * Setter method for property <tt>list</tt>.
     * 
     * @param list value to be assigned to property list
     */
    public void setList(List<SpQuestionsListResp> list) {
        this.list = list;
    }

    /**
     * Getter method for property <tt>tabName</tt>.
     * 
     * @return property value of tabName
     */
    public String getTabName() {
        return tabName;
    }

    /**
     * Setter method for property <tt>tabName</tt>.
     * 
     * @param tabName value to be assigned to property tabName
     */
    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

}
