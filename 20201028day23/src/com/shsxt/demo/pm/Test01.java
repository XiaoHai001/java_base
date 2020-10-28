package com.shsxt.demo.pm;

public class Test01 {
    public static void main(String[] args) {
        Integer i=new Integer(300);
        test(i);
        System.out.println(i);
    }
    public static void test (Integer integer){
        integer=21;
    }
}
