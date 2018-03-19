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
        if (null == str||"".equals(str)){
            return true;
        }
        return false;
    }

}
