package com.shsxt.demo.teacherCode.demoThread01;

public class Test08 implements Runnable {
    public static void main(String[] args) {
        Test08 test08=new Test08();
        new Thread(test08,"li").start();
        new Thread(test08,"kl").start();
    }
    private A a=new A();
    private B b=new B();
    @Override
    public void run() {
        if ("li".equals(Thread.currentThread().getName())){
            synchronized (a){
                System.out.println("1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b){
                    System.out.println("34");
                }
            }
        }else{
            synchronized (b){
                System.out.println(22);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (a){
                    System.out.println("2jieshu");
                }

            }
        }

    }
}
class A{

}
class B{

}
