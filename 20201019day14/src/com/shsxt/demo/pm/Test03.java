package com.shsxt.demo.pm;


public class Test03 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("jincheng"+i);

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Test03());

        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getPriority());
//        while (true){
//            //Thread.sleep(1);
//            if (Thread.State.TERMINATED.equals(thread.getState())){
//                System.out.println(thread.getState());
//                break;
//            }
//            System.out.println(thread.getState());
//        }
    }
}
