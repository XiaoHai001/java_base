package com.shsxt.demo01;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        IntStream stream = Arrays.stream(arr);
        Integer[]arr2={1,2,3,4,7};
        Stream<Integer> stream2 = Arrays.stream(arr2);

        List<String>list=new ArrayList<>();
        Stream<String> stream1 = list.stream();

        String []str={"aa","bb","cc"};
        Stream<String> str1 = Stream.of(str);
       // str1.forEach(System.out::println);
//        Stream<Stream<Character>> streamStream = str1.map((v) -> {
//            List<Character> list2 = new ArrayList<>();
//            char[] chars = v.toCharArray();
//            for (char aChar : chars) {
//                list2.add(aChar);
//            }
//            return list2.stream();
//        });
        //streamStream.forEach((c)->c.forEach(System.out::println));

        Stream<Character> characterStream = str1.flatMap((v) -> {
            List<Character> list2 = new ArrayList<>();
            char[] chars = v.toCharArray();
            for (char aChar : chars) {
                list2.add(aChar);
            }
            return list2.stream();
        });
        characterStream.forEach(System.out::println);

    }
}
