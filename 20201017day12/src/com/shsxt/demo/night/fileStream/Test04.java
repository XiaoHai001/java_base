package com.shsxt.demo.night.fileStream;

import java.io.*;

public class Test04 {
    public static void main(String[] args) throws IOException {


        //只能处理文本
        Reader reader=new FileReader("test.png");
        Writer writer=new FileWriter("testCopy.png");
        int c;
        while ((c=reader.read()) != -1) {
            writer.write(c);
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
