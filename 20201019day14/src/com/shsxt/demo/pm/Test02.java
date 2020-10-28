package com.shsxt.demo.pm;

public class Test02 implements Runnable{
    public static void main(String[] args) {
        new Thread(new Test02()).start();
    }

    @Override
    public void run() {
        System.out.println("1");
        Thread thread= new Thread(new Son());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("4");
    }
}
class Son implements Runnable{

    @Override
    public void run() {
        System.out.println(2);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(3);
    }
}
