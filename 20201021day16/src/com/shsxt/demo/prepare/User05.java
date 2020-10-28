package com.shsxt.demo.prepare;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class User05 {
    private String name;
    private int age;
    private boolean gender;
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.shsxt.demo.prepare.User05");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {

            int mo = declaredFields[i].getModifiers();
            String string = Modifier.toString(mo);
            System.out.println(string);
            System.out.println("-------------");

            System.out.println(declaredFields[i].getName());
            System.out.println("----------------");
            System.out.println(declaredFields[i].getType());

            System.out.println("========================");
        }
        for (Field declaredField : declaredFields) {

            System.out.println(declaredField);
        }
    }
}
