package com.shsxt.homework1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random random=new Random();
        int[]A=new int[20];
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            A[i]=random.nextInt(100)+1;
            if (A[i]>15)list.add(A[i]);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("-----------------");
        List<Integer>list1=new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next%2==0)list1.add(next);
        }
        int size = list1.size();
        System.out.println("偶数的个数为："+size);
        for (int i=0;i<size;i++){
            System.out.println(list1.get(i));
        }

    }
}
