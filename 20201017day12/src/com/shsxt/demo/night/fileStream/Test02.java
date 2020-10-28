package com.shsxt.demo.night.fileStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test02 {
    public static void main(String[] args) throws IOException {
        Reader reader=new FileReader("a.txt");
        int c;
//        while (-1 != (c=reader.read())) {
//            System.out.println((char)c);
//        }
        char[]chars=new char[3];
        while ((c=reader.read(chars)) != -1) {
            String s = new String(chars, 0, c);
            System.out.println(s);

        }
        reader.close();
    }
}
