package com.shsxt02.demoInnerClass;

import java.util.function.Function;

public class DemoLambdaTest06 {
    public static void main(String[] args) {
        String newStr=strHandler( "  hsl ",(s)->{
           return s.trim();
        });
        System.out.println("==="+newStr+"===");
    }
    public static String strHandler(String str, Function<String,String>function){
        return function.apply(str);
    }
}
