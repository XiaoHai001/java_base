package com.shsxt.demo.teacherCode.demoThread01;

public class Test07 implements Runnable {
    public static void main(String[] args) {
        Test07 test07=new Test07();
        Thread thread=new Thread(test07);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        System.out.println(thread.getPriority());
    }
    @Override
    public void run() {
        System.out.println("kasihil");
    }
}
