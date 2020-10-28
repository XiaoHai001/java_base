package com.shsxt.demo.demo;

public class Test01 {
    public static void main(String[] args) {
            A a=new A();
            a.a=18;
            A.a--;
        System.out.println(A.a);
        Thread thread=new Thread(()->{});
        //Thread.State.TEthread.getPriority()RMINATED=.

    }
}
class A{
    public static int a=10;
    public void say() throws RuntimeException{
        System.out.println("sad");
    }
}

