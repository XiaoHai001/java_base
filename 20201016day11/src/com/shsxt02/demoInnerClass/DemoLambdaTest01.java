package com.shsxt02.demoInnerClass;

import java.util.Random;

public class DemoLambdaTest01 {
    public static void main(String[] args) {

        Fly fly=new Fly() {
            @Override
            public void fly(int a) {
                System.out.println("ni"+a);
            }
        };
        fly.fly(2);
        Fly fly1=(a)->{
            System.out.println("hao");
        };
        Fly fly2=(a)->{
            System.out.println(new Random().nextInt(20));
        };
        fly2.fly(3);
    }
}
interface Fly{
    void fly(int a);
}
