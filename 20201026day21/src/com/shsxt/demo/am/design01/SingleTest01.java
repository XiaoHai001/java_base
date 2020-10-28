package com.shsxt.demo.am.design01;


//懒汉式
public class SingleTest01 {
    private static SingleTest01 singleTest01=null;
    private SingleTest01(){

    }
    public static SingleTest01 getObj(){
        synchronized (SingleTest01.class){
            if (singleTest01==null){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                singleTest01=new SingleTest01();
            }
            System.out.println(singleTest01);
            return singleTest01;
        }

    }
}
