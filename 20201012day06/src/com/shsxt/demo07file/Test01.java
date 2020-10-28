package com.shsxt.demo07file;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        File fileA=new File("E:\\a\\b\\c\\d.txt");
        System.out.println(fileA.mkdirs());
        System.out.println(fileA.createNewFile());
        System.out.println(fileA.exists());
        System.out.println(fileA.isDirectory());
    }
}
