package com.shsxt.demo.night.fileStream;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {

        OutputStream out = new FileOutputStream("a.txt");
        byte[] bytes = "我asdfodg".getBytes();
        out.write(bytes);
        out.write(97);

        InputStream in = new FileInputStream("a.txt");
//        int c;
//        while (-1 != (c = in.read())) {
//            System.out.println((char)c);
//        }
        byte[] b = new byte[1024];
        int c;
        while (-1 != (c=in.read(b))) {
            String s = new String(b, 0, c, "utf-8");
            System.out.println(s);
        }

        out.close();
    }
}
