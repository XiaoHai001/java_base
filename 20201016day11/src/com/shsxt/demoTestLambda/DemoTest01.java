package com.shsxt.demoTestLambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class DemoTest01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach((t)-> System.out.println(2*t));
        Map<String,Integer>map=new HashMap<>();
        map.put("yi",1);
        map.forEach((k,v)-> System.out.println(k+"  "+v));

    }
}
