package com.shsxt.demoTestLambda;

import java.util.function.Function;

public class Test02 {
    public static void main(String[] args) {
        String a="userName";
        a=getString(a,(t)->{
            String temp=(t.charAt(0)+"").toUpperCase()+t.substring(1,t.length());
            return "get"+temp;
        });
        System.out.println(a);
        String b="password";
        b=getString(b,(t)->{
            String temp=(t.charAt(0)+"").toUpperCase()+t.substring(1,t.length());
            return "set"+temp;
        });
        System.out.println(b);
    }
    public static String getString(String str, Function<String,String> function){
        return function.apply(str);
    }
}
