package com.shsxt.demo.am.homework03;

public class Test03 {
    public static void main(String[] args) {
        String email="aa@sohu.com";
        String[] split = email.split("@");
        String key=split[0];
        String value=split[1];
        System.out.println("key:"+key+"    value:"+value);

    }
}
