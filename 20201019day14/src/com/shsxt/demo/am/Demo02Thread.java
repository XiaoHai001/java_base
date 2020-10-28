package com.shsxt.demo.am;

public class Demo02Thread implements Runnable{
    int length=100;

    @Override
    public void run() {
        boolean b=false;
        if (b){

            return;
        }
        int pao=0;
        while (length>0){
            if ("兔子".equals(Thread.currentThread().getName())){
                for (int i=0;i<4;i++){
                    pao++;
                    if (pao%10==0){
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (pao==100){
                        System.out.println(Thread.currentThread().getName()+"赢了");
                        b=true;
                        break;
                    }
                }
            }
            if ("乌龟".equals(Thread.currentThread().getName())){
                for (int i=0;i<3;i++){
                    pao++;
                    if (pao==100){
                        System.out.println(Thread.currentThread().getName()+"赢了");
                        b=true;
                        break;
                    }
                }


            }
        }
    }

    public static void main(String[] args) {
        Demo02Thread demo01=new Demo02Thread();
        Thread thread=new Thread(demo01,"兔子");
        Thread thread1=new Thread(demo01,"乌龟");
        thread.start();
        thread1.start();
    }
}
