package com.shsxt.demo.pm.pre;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(6+6+"erty");
        Object o=new Object();
        float f=3.4f;
    }
}
class Base{
    static void test(){
        System.out.println("asd");
    }

}
class Son extends Base{

     static void test(){

    }
}
