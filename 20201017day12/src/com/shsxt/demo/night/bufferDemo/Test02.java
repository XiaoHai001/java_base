package com.shsxt.demo.night.bufferDemo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("a.txt"));
        bos.write(new Integer(97));  //自动转为char的类型

        bos.write(new byte[]{'a','b','c'});
        bos.flush();
        bos.close();
    }
}
