package com.shsxt.demo.prepare;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test06 {
    private void say(){
        return;
    }
    public int say1(){
        return 1;
    }
    private int  say2(){
        return 2;
    }
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.shsxt.demo.prepare.Test06");

        Method[] method = aClass.getMethods();

        for (int i = 0; i < method.length; i++) {
            int modifiers = method[i].getModifiers();
            System.out.println(Modifier.toString(modifiers));
            System.out.println(method[i].getReturnType());
            System.out.println(method[i].getName());
            Class<?>[] parameterTypes = method[i].getParameterTypes();
            System.out.println("-----------");
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType.getName());
            }

            System.out.println("----------------------");
        }
        for (Method method1 : method) {
            System.out.println(method1);
        }
    }
}
