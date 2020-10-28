package com.shsxt.demo.pm.pre;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.util.Collection;


public class Test03 {
    public static void main(String[] args) {
        String a="qwertyu";
        char[] chars = a.toCharArray();
        for (int i = 0; i < ((chars.length+1)/2); i++) {
            char c=chars[i];
            chars[i]=chars[chars.length-i-1];
            chars[chars.length-i-1]=c;
        }

        System.out.println(new String(chars));
    }
}
