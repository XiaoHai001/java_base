package com.shsxt.demo.test;

public class StreetDemo01 {
    public static void main(String[] args) {

    }
}
class Street{
    //信号灯
    private boolean flag=false; //false:红灯
    public void ns(){
        if (flag==false){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("人走。。。。。");
        flag=false;
        this.notify();
    }


}
