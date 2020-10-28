package com.shsxt02.demoInnerClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class DempLambdaTest05 {
    public static void main(String[] args) {
        DempLambdaTest05 dempLambdaTest05=new DempLambdaTest05();
        List<Integer>list=dempLambdaTest05.getNumList(10,()->{
            return new Random().nextInt(20);
        });
        System.out.println(list);
    }

    public List<Integer> getNumList(int  num, Supplier<Integer>sup){
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }
        return list;
    }
}

