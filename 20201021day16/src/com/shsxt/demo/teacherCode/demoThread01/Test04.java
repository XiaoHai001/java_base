package com.shsxt.demo.teacherCode.demoThread01;

public class Test04 implements Runnable{

    private String winner;
    public static void main(String[] args) {
        Test04 test04=new Test04();
        new Thread(test04,"兔子").start();
        new Thread(test04,"乌龟").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if ("兔子".equals(Thread.currentThread().getName())){
                if (i%10==0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(Thread.currentThread().getName()+"走第"+i+"步");
            if (winner!=null) return;
            if (i==99){
                winner=Thread.currentThread().getName();
                System.out.println("winner:"+winner);
                return;
            }
        }
    }
}
