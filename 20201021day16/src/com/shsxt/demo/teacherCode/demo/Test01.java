package com.shsxt.demo.teacherCode.demo;

public class Test01 {
    public static void main(String[] args) {
        Street street = new Street();
        new Thread(new People(street)).start();
        new Thread(new Car(street)).start();
    }
}
class Street{
    private boolean flag=false;  //false：红灯，车走
    public synchronized void carRoad(){
        if (flag==true){
            try {
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("车走....");
        flag=true;
        this.notify();
    }
    public synchronized void peopleRoad(){
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
class People implements Runnable{
    private Street street;

    public People(Street street) {
        this.street = street;
    }

    public People() {
    }

    @Override
    public void run() {

        while(true){
            street.peopleRoad();
        }

    }
}
class Car implements Runnable{

    private Street street;

    public Car(Street street) {
        this.street = street;
    }
    public Car(){

    }
    @Override
    public void run() {

        while(true){
            street.carRoad();
        }

    }
}
