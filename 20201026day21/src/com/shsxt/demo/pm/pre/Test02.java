package com.shsxt.demo.pm.pre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("w","q");
        list.add(new String("er"));
        System.out.println(list);

    }
}
