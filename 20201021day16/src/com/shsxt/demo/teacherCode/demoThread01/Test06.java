package com.shsxt.demo.teacherCode.demoThread01;

public class Test06 implements Runnable {
    public static void main(String[] args) {
        new Thread(new Test06()).start();
    }
    @Override
    public void run() {
        System.out.println(1);
        Miii miii=new Miii();
        Thread thread=new Thread(miii);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(3);

    }
}
class Miii implements Runnable{

    @Override
    public void run() {
        System.out.println("2");
    }
}