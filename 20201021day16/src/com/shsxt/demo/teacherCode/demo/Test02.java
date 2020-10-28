package com.shsxt.demo.teacherCode.demo;

public class Test02 implements Runnable{
    static int temp=1;
    public static void main(String[] args) throws InterruptedException {
        char c='A';
        while (true){
            System.out.print(c);
            Thread thread = new Thread(new Test02());
            thread.start();
            thread.join();
            if (c=='Z')break;
            c=(char)(c+1);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i <2 ; i++) {
            System.out.print(temp++);
        }
    }
}
class writeA{

}
