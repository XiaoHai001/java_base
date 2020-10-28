package com.shsxt.demo.afternoon;

import java.io.*;

public class Demo002_1 {
    public static void main(String[] args) throws IOException {
        DataInputStream dataOutputStream=new DataInputStream(new FileInputStream("e.txt"));
        int i = dataOutputStream.readInt();
        System.out.println(i);
        char c = dataOutputStream.readChar();
        System.out.println(c);

    }
}
