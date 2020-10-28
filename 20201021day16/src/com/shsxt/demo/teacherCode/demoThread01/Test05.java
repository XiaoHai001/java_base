package com.shsxt.demo.teacherCode.demoThread01;

public class Test05 implements Runnable{
    public static void main(String[] args) {
        Test05 test05 = new Test05();
        Thread thread=new Thread(test05,"nan");
        thread.start();
        new Thread(test05,"nv").start();
    }
    @Override
    public void run() {
        System.out.println("开始了"+Thread.currentThread().getName());
        Thread.yield();
        System.out.println("结束了"+Thread.currentThread().getName());
    }
}
