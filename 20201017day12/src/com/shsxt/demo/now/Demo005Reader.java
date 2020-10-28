package com.shsxt.demo.now;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo005Reader {
    public static void main(String[] args) throws IOException {
        File file = new File("c.txt");
        Writer writer=new FileWriter(file);
        String a="are you ok 你";
        a=new String(a.getBytes("gbk"),"GBK");
        writer.write(a);
        a="are you ok 我";
        writer.write(a);
        writer.flush();
        writer.close();
    }
}
