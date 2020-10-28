package com.shsxt.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next%2==1){
                iterator.remove();
            }

        }
        System.out.println(set);
    }
}
