package com.shsxt.demo.am.homework02;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws Exception {
        InputStreamReader in=new InputStreamReader(new FileInputStream("a.txt"));
        BufferedReader reader=new BufferedReader(in);
        int c;
        int []arr=new int[58];
        while ((c=reader.read()) != -1) {
            arr[c-65]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                System.out.println((char)(i+65)+"出现了"+arr[i]+"次");
            }
        }
    }
}
