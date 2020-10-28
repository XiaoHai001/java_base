package com.shsxt.demo.am;

public class Test02 {
    /**
     * 三种方式得到Class对象
     * 类.class
     * 类对象.class
     * Class.forName();
     */

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Integer.class);
        Class<?> stringClass = String.class;
        System.out.println(stringClass);
        Class<?> aClass = "".getClass();
        System.out.println(aClass);
        Class<?> aClass1 = Class.forName("java.lang.Integer");
        System.out.println(aClass1);

        System.out.println(int.class);
        System.out.println(Integer.TYPE);
        Class<Integer> type = Integer.TYPE;

    }
}
