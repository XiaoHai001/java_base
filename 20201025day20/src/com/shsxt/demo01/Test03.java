package com.shsxt.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(5);
        Stream<Integer> stream = list.stream();
//        boolean b = stream.allMatch((v) -> {
//            if (v > 5) {
//                return true;
//            } else return false;
//        });
//        boolean b = stream.anyMatch((v) -> {
//            if (v > 5) {
//                return true;
//            } else return false;
//        });
//        boolean b = stream.noneMatch((v) -> {
//            if (v > 5) {
//                return true;
//            } else return false;
//        });
       // Optional<Integer> first = stream.findFirst();
        Optional<Integer> max = stream.max((k, v) -> {
            return Integer.compare(k, v);
        });


        System.out.println(max.orElse(null));
    }
}
