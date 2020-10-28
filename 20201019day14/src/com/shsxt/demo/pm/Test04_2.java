package com.shsxt.demo.pm;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Test04_2 implements Runnable{
    Integer ticket=100;
    @Override
    public void run() {
            while (true) {
                if (ticket<=0){
                    break;
                }
                synchronized (ticket){
                      if (ticket>0){
                          System.out.println(Thread.currentThread().getName()+"购买了票，剩余："+ticket--);
                      }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
    }

    public static void main(String[] args) {
        Test04_2 test04 = new Test04_2();
        new Thread(test04,"张三").start();
        new Thread(test04,"李四").start();
        new Thread(test04,"王五").start();
    }
}



