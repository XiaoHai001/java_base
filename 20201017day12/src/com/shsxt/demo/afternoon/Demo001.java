package com.shsxt.demo.afternoon;

import java.io.*;

public class Demo001 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("a.txt"),"gbk");
        BufferedReader bufferedReader=new BufferedReader(isr);
        String string;
        while ( null!= (string=bufferedReader.readLine())) {
            System.out.println(string);
        }
    }
}
