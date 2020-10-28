package com.shsxt.demoClass;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File file=new File("a.txt");
        //file.createNewFile();
        System.out.println(file.getPath());
        System.out.println(file.toString());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.length());
        System.out.println("-----------");
        File file1=new File("a");
        //file1.mkdirs();

        System.out.println(file1.length());

        System.out.println(file.compareTo(file1));
        System.out.println(file.delete());


    }
}
