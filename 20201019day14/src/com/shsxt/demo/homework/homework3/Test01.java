package com.shsxt.demo.homework.homework3;

import java.io.*;

public class Test01 implements Runnable{

    @Override
    public void run() {  //文件，不是文件夹
        File file = new File(Thread.currentThread().getName());
        long length = file.length();

        try {
            InputStream in = new FileInputStream(file);
            OutputStream out = new FileOutputStream(new File("copy" + Thread.currentThread().getName()));
            //byte[] bytes = new byte[1024];
            int c;
            long temp=0;
            int temp2=0;
            while ((c=in.read()) != -1) {
                out.write(c);
                //temp+=1024;
                temp++;
                int d=(int)((temp*10)/length);
                if (d!=temp2){
                    if (d==1||d==2||d==3||d==4||d==5||d==6||d==7||d==8||d==9){
                        temp2=d;
                        System.out.println(Thread.currentThread().getName()+"已拷贝："+10*d+"%");
                    }
                }


            }
            System.out.println(Thread.currentThread().getName()+"拷贝完成！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Test01 test01=new Test01();
        Thread thread1=new Thread(test01,"face1.jpeg");
        Thread thread2=new Thread(test01,"test.png");
        thread1.start();
        thread2.start();

    }
}
