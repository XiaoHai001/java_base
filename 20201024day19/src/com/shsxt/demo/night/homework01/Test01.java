package com.shsxt.demo.night.homework01;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        Integer[]integers={1,-2,-3,4,-5};
        Stream<Integer> stream = Arrays.stream(integers);
        stream.forEach((v)->{
            System.out.println(Math.abs(v));
        });
        
    }
}
