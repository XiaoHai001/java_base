package com.shsxt.demo01;

public class Test04 {
    public static void main(String[] args) {
        A1 a1=new B();
        a1.test();
    }
}
abstract class A1{
    void test(){
        System.out.println("heheh");
    }
}
class B extends A1 {

}