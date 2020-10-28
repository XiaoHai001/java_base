package com.shsxt.demo.am;

public class Demo01Thread implements Runnable{
    static int p=100;


    public Demo01Thread() {
    }

    public static void main(String[] args) {
        Demo01Thread demo1 = new Demo01Thread();

        Thread thread=new Thread(demo1,"张三");
        Thread thread2=new Thread(demo1,"王五");
        Thread thread3=new Thread(demo1,"李四");
        thread.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        while (p>0){
            synchronized (Demo01Thread.class){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"抢到一张票,剩余票"+p);
                p--;
            }

        }
    }
}
