package com.shsxt.demo.pm.pre;




public class Test05 implements Runnable{
    public static void main(String[] args) {
        Test05 test05=new Test05();
        Thread thread=new Thread(test05);
        thread.start();
        thread.run();
        thread.run();

    }

    @Override
    public  void run() {
        System.out.println("running");
    }
}
