package com.shsxt.demo.afternoon;

import java.io.*;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("d.txt"));
        System.out.println(inputStreamReader.read());
        inputStreamReader.close();

    }
}
