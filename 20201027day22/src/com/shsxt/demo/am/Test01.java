package com.shsxt.demo.am;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) throws IOException {
        String str="sdgfhjgfdsasdfgjkl";
        int[]arr=new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-97]++;
        }
        System.out.println(Arrays.toString(arr));
        File file = new File("test.txt");
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
        char c='a';
        for (int i = 0; i < 26; i++) {
            if (arr[i]!=0){
                dos.writeChar(c);
                dos.write(arr[i]);
            }
           c++;
        }
        dos.flush();
        DataInputStream dis= new DataInputStream(new FileInputStream("test.txt"));
        char c2;
        while ((c2=dis.readChar()) != -1) {
            System.out.println(c2);
            System.out.println(dis.readInt());
        }
        dis.close();
        dos.close();

    }
}
