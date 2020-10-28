package com.shsxt.demo.teacherCode.demoThread01;

public class Test02 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Test02()).start();
        for (int i = 0; i < 20; i++) {
            System.out.println("读书");
            Thread.sleep(10);
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("上课");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
