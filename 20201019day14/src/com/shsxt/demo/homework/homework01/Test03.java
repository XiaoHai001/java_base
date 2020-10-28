package com.shsxt.demo.homework.homework01;

import java.util.Scanner;

public class Test03 implements Runnable {
    static int num;//来的人数
    static int sum;   //
    long time;//用的时间
    boolean b=false;
    public static void main(String[] args) throws InterruptedException {
        Test03 test03=new Test03();
        Thread thread1 = new Thread(test03,"张三");
        Thread thread2 = new Thread(test03,"李四");
        Thread thread3 = new Thread(test03,"王五");
        Thread thread4 = new Thread(test03,"赵六");
        Thread thread5 = new Thread(test03,"孙七");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        synchronized (Test03.class){
            Scanner scanner=new Scanner(System.in);
            String name=Thread.currentThread().getName();
            System.out.println(name+"来没来（1：来了，0：没来)：");
            int i = scanner.nextInt();
            if (i==1){
                if ("王五".equals(name)){
                    System.out.print("班长");
                }
                System.out.println(name+"进行了签到！");
                num++;
            }if (i==0){
                System.out.println(name+"没来");
            }
            time+=(System.currentTimeMillis()-startTime)/1000;


        }
        sum++;

        if (num==5){
            System.out.println("人到齐了");
            b=true;
            return;
        }
        if (time>6){
            System.out.println("时间到了,来的人数为："+num);
            return;
        }
        if (sum==5){
            System.out.println("时间没到，签完了，人没到齐");
            return;
        }

    }
}
