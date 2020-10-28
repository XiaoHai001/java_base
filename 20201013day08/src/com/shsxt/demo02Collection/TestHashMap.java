package com.shsxt.demo02Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"er");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            System.out.println(integer+"   "+map.get(integer));
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next+"2222"+map.get(next));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+"3333"+entry.getValue());
        }
        Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> next = iterator1.next();
            System.out.println(next.getKey()+"444"+next.getValue());
        }

    }
}
