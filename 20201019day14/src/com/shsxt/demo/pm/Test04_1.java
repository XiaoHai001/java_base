package com.shsxt.demo.pm;

public class Test04_1 implements Runnable{
    Ticker ticket=new Ticker();
    @Override
    public void run() {
            while (true) {
                synchronized (ticket){
                    if (ticket.num<=0){
                        break;
                    }else{
                        System.out.println(Thread.currentThread().getName()+"购买了票，剩余："+ticket.num--);
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
    }

    public static void main(String[] args) {
        Test04_1 test04 = new Test04_1();
        new Thread(test04,"张三").start();
        new Thread(test04,"李四").start();
        new Thread(test04,"王五").start();
    }
}
class Ticker{
    int num=100;
}

