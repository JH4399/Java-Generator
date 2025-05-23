package com.easyjava.utils;

/**
 * 转换首字母大写
 */
public class StringUtils {
    public static String upperCaseFirstLetter(String field){
        if(org.apache.commons.lang3.StringUtils.isEmpty(field)){
            return field;
        }
        return field.substring(0, 1).toUpperCase()+field.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(upperCaseFirstLetter("csgo"));
    }

    /**
     * 首字母转换小写
     * @param field
     * @return
     */
    public static String lowerCaseFirstLetter(String field){
        if(org.apache.commons.lang3.StringUtils.isEmpty(field)){
            return field;
        }
        return field.substring(0, 1).toLowerCase()+field.substring(1);
    }
}
