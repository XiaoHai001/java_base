package com.shsxt.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test05 {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("asdfghj2354fg435");
        System.out.println(matcher.find());
        System.out.println(matcher.find());
        System.out.println(matcher.find());


    }
}
class Person{
    public void test(){

    }
    public void test02(){

    }
}
