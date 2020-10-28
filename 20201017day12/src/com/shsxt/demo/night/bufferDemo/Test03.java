package com.shsxt.demo.night.bufferDemo;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("a.txt"));

        String s;
        while (null!=(s=bufferedReader.readLine())) {
            System.out.println(s);
        }

        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("a.txt"));
        bufferedWriter.write(98);
        bufferedWriter.write("sdgf");
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
