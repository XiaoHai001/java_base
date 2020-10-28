package com.shsxt.demo.am;


import java.io.*;
import java.util.Arrays;

public class Test02 {

        public static void main(String[] args) throws Exception {
            String str="sdgfhjgfdsasdfgjkl";
            //String str="";
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
                    String temp=arr[i]+ String.valueOf(c);
                    dos.writeUTF(temp);
                    System.out.println("----------"+temp);
                }
                c++;
            }
            dos.flush();
            DataInputStream dis= new DataInputStream(new FileInputStream("test.txt"));
            //BufferedReader reader=new BufferedReader(new InputStreamReader(dis));
            String c2=null;
            while (dis.available()!=0) {
                System.out.println(dis.readUTF());
            }


            dis.close();
            dos.close();

        }


}
