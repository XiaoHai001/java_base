package com.shsxt.demo.now;

import java.io.*;

public class Demo004Reader {
    public static void main(String[] args) throws IOException {
        File file = new File("b.txt");
        OutputStream out=new  FileOutputStream(file);
        byte[] bytes=new byte[]{};
        bytes="are you ok我".getBytes("utf-8");
        out.write(bytes);
        bytes="are you ok你".getBytes("gbk");
        out.write(bytes);
        out.flush();
        out.close();
    }
}
