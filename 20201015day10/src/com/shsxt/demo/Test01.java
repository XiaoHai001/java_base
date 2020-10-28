package com.shsxt.demo;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        String str="a   bc  d e";
        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));
    }
}
