package com.shsxt.demo.night.dateObjectDemo;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        DataOutputStream out=new DataOutputStream(new FileOutputStream("b.txt"));
        out.writeInt(1);
        out.writeChar('s');
        out.close();

        DataInputStream in=new DataInputStream(new FileInputStream("b.txt"));
        int i = in.readInt();
        System.out.println(i);
        System.out.println(in.readChar());

    }
}
