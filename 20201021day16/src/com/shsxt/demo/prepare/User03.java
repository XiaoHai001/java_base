package com.shsxt.demo.prepare;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class User03 {
    public User03(){
        System.out.println("nihao");
    }
    public User03(int a){
        System.out.println("youcan"+a);
    }
    public static void main(String[] args) throws Exception {
//        Class<?> aClass = Class.forName("com.shsxt.demo.prepare.User03");
//        User03 user03 = (User03) aClass.newInstance();
        Class<?> aClass = Class.forName("com.shsxt.demo.prepare.User03");
        Constructor<?>[] constructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        User03 user01 = (User03) constructors[0].newInstance();
        User03 user02 = (User03) constructors[1].newInstance(2);


    }
}
