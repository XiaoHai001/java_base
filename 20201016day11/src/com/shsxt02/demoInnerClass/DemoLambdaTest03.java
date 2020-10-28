package com.shsxt02.demoInnerClass;

import java.util.ArrayList;
import java.util.List;

public class DemoLambdaTest03 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach((t)->{
            System.out.println(t);
        });

    }
}
