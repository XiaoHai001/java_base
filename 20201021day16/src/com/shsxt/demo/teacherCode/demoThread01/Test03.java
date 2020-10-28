package com.shsxt.demo.teacherCode.demoThread01;

public class Test03 implements Runnable {
    private Ticket ticket=new Ticket();

    public static void main(String[] args) {
        Test03 test03 = new Test03();
        new Thread(test03,"张三").start();
        new Thread(test03,"李四").start();
        new Thread(test03,"王五").start();
    }
    @Override
    public synchronized void run() {
        while (ticket.num>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"抢到票了，剩余票"+--ticket.num);



        }
    }
}
class Ticket{
     int num=100;
}
