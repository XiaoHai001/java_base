package com.shsxt.demoClass;

import java.io.File;

public class Test03 {
    public static void main(String[] args) {
        File file =new File("a");
        deleteF(file);
    }
    public static void deleteF(File file){
        if (!file.exists()){
            return ;
        }
        if (file.isFile()){
            file.delete();
            return;
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            deleteF(file1);
        }
        file.delete();
    }
}
