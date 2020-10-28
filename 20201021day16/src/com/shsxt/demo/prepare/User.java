package com.shsxt.demo.prepare;

import java.lang.reflect.Modifier;

public class User {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.shsxt.demo.prepare.User");
        int modifiers = aClass.getModifiers();
        System.out.println(Modifier.toString(modifiers));
    }
}
