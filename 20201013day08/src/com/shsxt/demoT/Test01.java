package com.shsxt.demoT;

import java.util.ArrayList;

public class Test01<T> {
    public static void main(String[] args) {
        Test01 test01=new Test01();
        test01.test01(new String("asd"));

    }
    public void  test01(T x){
        System.out.println(x.getClass().getName());
    }
}
