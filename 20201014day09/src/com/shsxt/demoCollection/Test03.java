package com.shsxt.demoCollection;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Map<String ,Integer>map=new HashMap<>();
        map.put("1",2);
        map.put("2",7);
        map.put("2",9);
        map.put("3",8);
        System.out.println(map.replace("3", 7));
        System.out.println(map);
        System.out.println("----------------");
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+"11111"+map.get(s));

        }
        System.out.println("==============");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next+"    "+map.get(next));
        }
        System.out.println("------------------");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {

            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"         "+value);
        }
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> next = iterator1.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"   "+value);
        }
        System.out.println("-------------------");
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
        Iterator<Integer> iterator2 = values.iterator();
        while (iterator2.hasNext()) {

            System.out.println(iterator2.next());
        }

    }
}
