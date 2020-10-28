package com.shsxt.demo.am;

//线程通信
public class Test01 {
    public static void main(String[] args) {
        Test01 test01=new Test01();
        new Thread(new Write1(test01)).start();
        new Thread(new WriteA(test01)).start();
    }
}
class Write implements Runnable{
    boolean flag=true;
    @Override
    public void run() {

    }
}
class WriteA implements Runnable{
    private Test01 test01;
    public WriteA(Test01 test01){
        this.test01=test01;
    }
    @Override
    public synchronized void run() {
        char c='A';
        while (true){
            if (0==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.print(c);
            if (c=='Z')return;
            c=(char)(c++);

            notify();

        }
    }
}
class Write1 implements Runnable{
    private Test01 test01;
    public Write1(Test01 test01){
        this.test01=test01;
    }

    @Override
    public synchronized void run() {
        int i=1;
        while (true){
            if (0==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.print(i++);
            System.out.println(i++);
            if (i>52)return;
            notify();

        }
    }
}
