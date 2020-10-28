package com.shsxt.demo.am.review;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        List<String> list=  Arrays.asList("a","b","c","f");
        Stream<String> stream = list.stream();
//        List<String> collect = stream.collect(Collectors.toList());
//        System.out.println(collect);
        Optional<String> min = stream.min(String::compareTo);
        System.out.println(min.get());


    }
}
