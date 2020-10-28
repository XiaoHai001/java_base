package com.shsxt.demo.night.bufferDemo;


import java.io.*;

public class Test05 {
    //文本输出
    public static void main(String[] args) throws IOException {
        InputStream in=new FileInputStream("a.txt");
        byte[]bytes=new byte[1024];
        int c;
//        while ((c=in.read(bytes)) != -1) {
//            String s = new String(bytes, 0, c, "utf-8");
//            System.out.println(s);
//        }

//        Reader reader=new FileReader("a.txt");
//        while ((c=reader.read()) != -1) {
//            System.out.println((char)c);
//        }

        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("a.txt"),"utf-8");
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String a;
        while ((a=bufferedReader.readLine()) != null) {
            System.out.println(a);
        }
        bufferedReader.close();




    }
}
