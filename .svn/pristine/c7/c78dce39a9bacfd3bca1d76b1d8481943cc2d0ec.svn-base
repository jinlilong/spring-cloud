/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.common.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * 
 * @author jinlilong
 * @version $Id: BeanXMLConvertUtil.java, v 0.1 2018年5月8日 下午6:39:25 jinlilong Exp $
 */
public class BeanXMLConvertUtil {

    /**
     * 
     * @param name
     * @param obj
     * @param classs
     * @return
     */
    public static String beanToXml(String name, Object obj, Class<?> classs) {
        XStream xstream = new XStream(new StaxDriver());
        xstream.alias(name, classs);
        String xml = xstream.toXML(obj);
        if (!StringUtils.isEmpty(xml)) {
            xml = xml.substring(xml.indexOf("?>") + 2, xml.length());
            xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + xml;
            //对于有下划线  的转后  变成2个下划线，需要处理一下
            xml = xml.replaceAll("__", "_");
        }
        return xml;
    }

    /**
     * 
     * @param name
     * @param obj
     * @param classs
     * @return
     */
    public static String beanToXmlWithStandalone(String name, Object obj, Class<?> classs) {
        XStream xstream = new XStream(new StaxDriver());
        xstream.alias(name, classs);
        String xml = xstream.toXML(obj);
        if (!StringUtils.isEmpty(xml)) {
            xml = xml.substring(xml.indexOf("?>") + 2, xml.length());
            xml = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>" + xml;
            //对于有下划线  的转后  变成2个下划线，需要处理一下
            xml = xml.replaceAll("__", "_");
        }
        return xml;
    }

    /**
     * xml转换为bean
     * @param xml
     * @return
     */
    public static Object xmlToBean(String name, String xml, Class<?> classs) {
        XStream xstream = new XStream(new StaxDriver());
        xstream.alias(name, classs);
        return xstream.fromXML(xml);
    }

    /**
     * xml 转json
     * @param xml
     * @return
     */
    /*public static String xmlToJson(String xml) {
        XMLSerializer xmlSerializer = new XMLSerializer();
        //将xml转为json（注：如果是元素的属性，会在json里的key前加一个@标识）  
        String result = xmlSerializer.read(xml).toString();
        return result;
    }*/

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        /*String xml = "<?xml version='1.0' encoding='utf' standalone='yes'?><qrytransrsp><ret> 000000</ret><memo>成功</memo><trans><orderno>123456</orderno></trans><trans><orderno>1234567</orderno></trans></qrytransrsp>";
        
         第二种方法，使用json-lib提供的方法 
        //创建 XMLSerializer对象  
        XMLSerializer xmlSerializer = new XMLSerializer();
        //将xml转为json（注：如果是元素的属性，会在json里的key前加一个@标识）  
        String result = xmlSerializer.read(xml).toString();
        //输出json内容  
        System.out.println("!!!!!!!" + result);*/
    }
}
