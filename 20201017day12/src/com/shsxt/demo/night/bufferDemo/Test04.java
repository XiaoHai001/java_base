package com.shsxt.demo.night.bufferDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = "abcdefghijklmnopq".getBytes();
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(bytes);
        int c;
        while ((c=byteArrayInputStream.read())!= -1) {
            System.out.println((char)c);
        }
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        byteArrayOutputStream.write(bytes);
        System.out.println(byteArrayOutputStream.toString());
    }
}
