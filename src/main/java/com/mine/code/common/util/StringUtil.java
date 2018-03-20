package com.mine.code.common.util;

/**
 * 字符串处理工具类
 */
public class StringUtil {
    /**
     * 校验字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if (null == str||"".equals(str.trim())){
            return true;
        }
        return false;
    }

    /**
     * 校验字符串是否不为空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        if (null == str||"".equals(str.trim())){
            return false;
        }
        return true;
    }

}
