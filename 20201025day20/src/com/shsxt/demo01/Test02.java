package com.shsxt.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        Stream<String> stream = list.stream();
        List<String> collect = stream.collect(Collectors.toList());

    }
}
