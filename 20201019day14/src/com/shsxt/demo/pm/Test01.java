package com.shsxt.demo.pm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test01 implements Runnable {
    @Override
    public void run() {
        int time=10;
        while (time>=0){
            System.out.println(time--);
            try {
                //Thread.sleep(1000);
                Thread.currentThread().join(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Test01());
        thread.start();
        new Thread(()->{
            try {
                Thread.currentThread().join(1000);
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
