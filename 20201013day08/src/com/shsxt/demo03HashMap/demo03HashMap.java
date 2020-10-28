package com.shsxt.demo03HashMap;

import java.util.*;

public class demo03HashMap {
    public static void main(String[] args) {
        String[] companyMa = new String[]{"阿里巴巴", "淘宝", "支付宝"};
        HashMap<String, String[]> hashMap = new HashMap<>();
        hashMap.put("马云", companyMa);
        String[] companyTeng = new String[]{"腾讯", "王者", "微信"};
        hashMap.put("马化腾", companyTeng);

        String[] companyW = new String[]{"a", "s", "d"};
        hashMap.put("王健林", companyW);

        Set<String> strings = hashMap.keySet();
        for (String s:strings) {
            String[] strings1 = hashMap.get(s);
            System.out.println(s+"   "+Arrays.toString(strings1));
        }

        System.out.println("---------------------");


        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next+"----"+Arrays.toString(hashMap.get(next)));
        }

        System.out.println("-----------------");
        Set<Map.Entry<String, String[]>> entries = hashMap.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            String key = entry.getKey();
            String[] value = entry.getValue();
            System.out.println(key+"--"+Arrays.toString(value));
        }

        System.out.println("------------------------");
        Iterator<Map.Entry<String, String[]>> iterator1 = entries.iterator();
        while(iterator1.hasNext()){
            Map.Entry<String, String[]> next = iterator1.next();
            String key = next.getKey();
            String[] value = next.getValue();
            System.out.println(key+"----=="+Arrays.toString(value));
        }

        Collection<String[]> values = hashMap.values();
        for (String[] a:values
             ) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("---------------------");
        hashMap.forEach((k, v) -> System.out.println(k + Arrays.toString(v)));

        Iterator<String[]> iterator2 = values.iterator();
        while(iterator2.hasNext()){
            String[] next = iterator2.next();
            System.out.println(Arrays.toString(next));
        }


    }
}

