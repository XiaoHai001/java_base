package com.shsxt.demoTestLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list=getList(10, new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(51)*2;
            }
        });
        System.out.println(list);

        list=getList(5,()->{
            Random random=new Random();
            int temp=random.nextInt(200);
            while(temp<100){
                temp=random.nextInt(200);

            }
            int j=2;
            for (int i = 2; i <temp ; i++) {

                if (temp%i==0){
                    //不是质数
                    break;
                }
                j++;
            }
            return temp;
        });
        System.out.println(list);
    }
    public static List<Integer>getList(int length, Supplier <?> supplier){
        List <Integer> list=new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add((Integer) supplier.get());
        }
        return list;
    }
}
