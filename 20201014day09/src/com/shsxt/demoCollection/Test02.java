package com.shsxt.demoCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);
        for (Integer integer : set) {
            System.out.println(integer);
        }
        System.out.println("-----------------");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
