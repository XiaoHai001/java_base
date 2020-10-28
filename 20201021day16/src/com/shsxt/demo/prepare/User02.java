package com.shsxt.demo.prepare;

import java.lang.reflect.Constructor;

public class User02 {
    public User02(String a){

    }
    public User02(){

    }
    public User02(String a,String b){

    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("com.shsxt.demo.prepare.User02");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }

        System.out.println("----------------");
        constructors=aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("-----------------");
       Constructor<?> constructor = aClass.getConstructor(String.class);
       System.out.println(constructor);
        System.out.println("---------------");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, String.class);
       System.out.println(declaredConstructor);


    }
}
