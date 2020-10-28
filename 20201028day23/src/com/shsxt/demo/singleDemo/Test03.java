package com.shsxt.demo.singleDemo;

public class Test03 {
    public static void main(String[] args) {

    }
}
interface A{
    public static final int a=1;

    default void say() {
        System.out.println("hello,world");
    }
}
class B implements A{
    @Override
    public void say() {

    }
}


