package org.loan.core.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuzx
 * @desc 根据身份证号码判断性别
 * @create 2018-06-21 14:39
 */
public class IdNoUtil {

    private static Pattern NUMBER_PATTERN_18 = Pattern
        .compile("\\d{6}(\\d{4})\\d{6}(\\d{1})[\\dxX]{1}");

    private static Pattern NUMBER_PATTERN_15 = Pattern
        .compile("\\d{6}(\\d{2})\\d{5}(\\d{1})\\d{1}");

    private static Pattern NUMBER_PATTERN    = Pattern.compile("\\d+");

    /**
     * 方法描述： 根据身份证获取年龄
     * 0表示女
     * 1表示男
     *
     * @param idNum
     * @return String
     */
    public static String gender(String idNum) {
        String sex = "";
        if (idNum.matches("^\\d{15}$|^\\d{17}[\\dxX]$")) {
            Matcher matcher = null;
            if (idNum.length() == 18) {
                matcher = NUMBER_PATTERN_18.matcher(idNum);
            } else if (idNum.length() == 15) {
                matcher = NUMBER_PATTERN_15.matcher(idNum);
            }
            if (matcher != null && matcher.matches()) {
                sex = "" + Integer.parseInt(matcher.group(2)) % 2;
            }
        }

        if ("0".equals(sex)) {
            sex = "女";
        } else if ("1".equals(sex)) {
            sex = "男";
        }
        return sex;
    }

    //截取数字
    public static String getNumbers(String content) {
        Matcher matcher = NUMBER_PATTERN.matcher(content.trim());
        while (matcher.find()) {
            return matcher.group(0);
        }
        return "";
    }

}
