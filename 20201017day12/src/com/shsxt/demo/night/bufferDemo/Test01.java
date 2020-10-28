package com.shsxt.demo.night.bufferDemo;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bs=new BufferedInputStream(new FileInputStream("a.txt"));
        int c;
//        while ((c=bufferedInputStream.read()) != -1) {
//            System.out.println((char)c);
//        }
        byte[]bytes=new byte[1024];

        while ((c=bs.read(bytes)) != -1) {
            String s=new String(bytes,0,c,"utf-8");
            System.out.println(s);
        }
        bs.close();

    }
}
