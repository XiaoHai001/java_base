package com.shsxt.demo.night.demoException;

import java.util.*;

public class Test05 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("1","2");
        map.put("3","4");
        map.put("5","6");
        map.forEach((k,v)-> System.out.println(k+"   "+v));
        System.out.println("-------------");
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+"   "+map.get(s));
        }
        System.out.println("-------====-----");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next+"   "+map.get(next));
        }
        System.out.println("+++++++++++++++++++");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"   "+value);
        }
        System.out.println("00000000000000000000");
        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> next = iterator1.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"   "+value);
        }

        Collection<String> values = map.values();
        Iterator<String> iterator2 = values.iterator();
        for (String value : values) {


        }


    }
}
