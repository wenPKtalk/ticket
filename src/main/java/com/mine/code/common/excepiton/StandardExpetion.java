package com.mine.code.common.excepiton;

public class StandardExpetion {

    public static void main(String[] args){

        String str2 = new String("ja")+new String("va");
        System.out.println(str2.intern() == str2);

        String str1 = new String("ja")+new String("123");
        System.out.println(str1.intern() == str1);

    }
}
