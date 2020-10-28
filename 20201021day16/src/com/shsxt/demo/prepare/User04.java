package com.shsxt.demo.prepare;

import java.io.Serializable;

public class User04 implements Cloneable, Serializable {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.shsxt.demo.prepare.User04");
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);
    }
}
