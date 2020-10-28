package com.shsxt.homework1;

import java.util.*;

public class Test03_1 {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {

            entry.getKey();
            entry.getValue();
        }
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            next.getKey();
            next.getValue();

        }
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator1 = values.iterator();
        for (Integer value : values) {

        }
    }
}
