package com.shsxt.demo.pm;

public class Test05 implements Runnable{
    A a=new A();
    B b=new B();

    public static void main(String[] args) {
        Test05 test05=new Test05();
        new Thread(test05,"a").start();
        new Thread(test05,"b").start();
    }

    @Override
    public void run() {
        if ("a".equals(Thread.currentThread().getName())){
            synchronized (a){
                System.out.println("得到A");
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b){
                    System.out.println("得到B");
                }
            }
        }else{
            synchronized (b){
                System.out.println("得到b");
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (a){
                    System.out.println("得到a");
                }
            }
        }

    }
}
class A{

}
class B{

}
