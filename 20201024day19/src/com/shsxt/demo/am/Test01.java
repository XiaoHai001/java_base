package com.shsxt.demo.am;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("12\\(3\\)65gh(j)k4(5)8(7hg)uiiuhj1236(5)4hgjh");
        System.out.println(matcher.find());
        //完美匹配
        //System.out.println(matcher.matches());
        System.out.println(matcher.groupCount());
        System.out.println(matcher.group());
        System.out.println(matcher.find());
        System.out.println(matcher.find());

    }
}
