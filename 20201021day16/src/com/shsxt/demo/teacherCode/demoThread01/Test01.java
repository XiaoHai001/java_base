package com.shsxt.demo.teacherCode.demoThread01;

public class Test01 extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Test01 test01 = new Test01();
        test01.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("吃饭");
            Thread.sleep(10);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("喝水");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
