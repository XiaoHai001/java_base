package com.shsxt.demo.homework.homework02;

public class Test01 implements Runnable {
    int sum=0;//素数和
    static int num=0;//素数个数
    public static void main(String[] args) {
        Test01 test01=new Test01();
        Thread thread = new Thread(test01);
        thread.start();
        new Thread(()->{
            for (int i = 10000; i < 20000; i++) {
                boolean b=true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i%j==0){
                        b=false;
                    }
                }
                if (b) num++;
            }
            System.out.println(num);
        }).start();
    }

    @Override
    public void run() {
        for (int i = 2; i <10000 ; i++) {
            boolean b=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j==0){
                    b=false;
                }
            }
            if (b)sum+=i;
        }
        System.out.println(sum);
    }
}
