package com.shsxt.demo.now;



import java.io.*;

public class Demo003Reader {
    public static void main(String[] args) {
        File file = new File("a.txt");
        Reader reader=null;
        try {
            reader=new FileReader(file);
//            int c;
//            while ((c=reader.read()) != -1) {
//                System.out.println((char)c);
//            }
            char[]chars=new char[3];
            int d;

            while ((d=reader.read(chars)) != -1) {
                String s = new String(chars, 0, d);
                System.out.print(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
