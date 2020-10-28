package com.shsxt.demo.now;

import java.io.*;

public class Demo001ReadInputstream {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        InputStream in=new FileInputStream(file);
        int c;
        byte[]bytes=new byte[3];
        int d=in.read(bytes);

        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        while ((c=in.read())!= -1) {
            System.out.print((char)c+"    ");
        }
        in.close();
    }
}
