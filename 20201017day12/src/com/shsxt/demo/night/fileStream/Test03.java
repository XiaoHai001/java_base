package com.shsxt.demo.night.fileStream;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test03 {
    public static void main(String[] args) throws IOException {
        Writer writer=new FileWriter("a.txt");
        writer.write("er");
        writer.write('g');
        char[] chars=new char[]{'q','w','e'};
        writer.write(chars);
        String s="abcdefghijklmnopq";
        writer.write(s,3,4);
        writer.write(chars,1,1);
        String string=new String( "你我他".getBytes("gbk"),"gbk");
        System.out.println(string);
        writer.write(string);
        writer.flush();
        writer.close();

    }
}
