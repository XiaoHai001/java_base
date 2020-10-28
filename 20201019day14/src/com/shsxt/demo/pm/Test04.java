package com.shsxt.demo.pm;

public class Test04 implements Runnable{
    Integer ticket=new Integer(100);
    @Override
    public void run() {
            while (true) {
                synchronized (ticket){
                    if (ticket<=0){
                        break;
                    }else{
                        System.out.println(Thread.currentThread().getName()+"购买了票，剩余："+ticket--);
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
        Test04 test04 = new Test04();
        new Thread(test04,"张三").start();
        new Thread(test04,"李四").start();
        new Thread(test04,"王五").start();

    }
}

