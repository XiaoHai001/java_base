package com.shsxt02.demoInnerClass;

public class DemoLambdaTest04 {
    public static void main(String[] args) {
        A <Integer>a=(t)->{
            System.out.println(t);
        };
        a.apply(2);
    }
}
interface  A<T>{
    void apply(T t);
}
