package com.shsxt.demo02Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("e");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-------===--------");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
