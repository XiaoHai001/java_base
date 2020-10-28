package com.shsxt.demo.am.design01;

import java.lang.reflect.Constructor;

public class Test02 {
    public static void main(String[] args) throws Exception {
        System.out.println(SingleTest02.getTest02());
        Class<?> aClass = Class.forName("com.shsxt.demo.am.design01.SingleTest02");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        System.out.println(declaredConstructor.newInstance());

    }
}
