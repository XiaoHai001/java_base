package com.shsxt.demo07file;

import java.io.File;

public class Test02 {
    public static void main(String[] args) {
        File file=new File("E:\\a");
        testDeleteFiles(file);
    }
    public static void testDeleteFiles(File file){
        if (null==file || !file.exists())return;
        if (file.isFile()){
            System.out.println(file.getName());
            file.delete();
        }if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f:files
                 ) {
                testDeleteFiles(f);
            }
            System.out.println(file.getName());
            file.delete();
        }
    }
}
