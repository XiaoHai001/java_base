package com.shsxt.homework1;

import java.util.ArrayList;
import java.util.List;

public class Test01_1 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        for (Integer integer : list) {
            if (integer%2==0)list.remove(integer);
        }
        System.out.println(list);
    }
}
