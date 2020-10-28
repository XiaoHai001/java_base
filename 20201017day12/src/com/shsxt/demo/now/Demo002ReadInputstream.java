package com.shsxt.demo.now;

import java.io.*;

public class Demo002ReadInputstream {
    public static void main(String[] args) throws IOException {
        File file=new File("a.txt");
        InputStream inputStream=new FileInputStream(file);
        byte[]bytes=new byte[3];
        int len;
        while ((len=inputStream.read(bytes)) != -1) {
            String string=new String(bytes,0,len,"utf-8");
            System.out.println(string);
        }
    }
}
