package com.shsxt.demo.prepare;


import jdk.nashorn.internal.runtime.Source;

public class Test01 {
    public static void main(String[] args) {
        Test01 test01=new Test01();
        Class<?> aClass = test01.getClass();
        System.out.println(aClass.getName());

    }
}

