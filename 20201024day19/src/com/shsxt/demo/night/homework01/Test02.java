package com.shsxt.demo.night.homework01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Stream<Integer> stream = list.stream();

        Stream<Integer> integerStream = stream.map((v) -> {
            return v *= v;
        });
        list= integerStream.collect(Collectors.toList());
        System.out.println(list);


    }
}
