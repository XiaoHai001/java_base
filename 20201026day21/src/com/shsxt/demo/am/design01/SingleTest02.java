package com.shsxt.demo.am.design01;

public class SingleTest02 {
    private static SingleTest02 test02=new SingleTest02();
    private SingleTest02(){

    }

    public static SingleTest02 getTest02() {
        return test02;
    }
}
