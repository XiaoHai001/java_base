package com.shsxt.demo.pass;

public class Test03 {
    public static void main(String[] args) {
        String a="a";
        String b="a";

        System.out.println(a==b);
        b=new String("a");
        System.out.println(a==b);

       Integer c=129;
       Integer e = 120;
       Integer f=129;
       Integer d=120;
        System.out.println(c==f);
    }
}
