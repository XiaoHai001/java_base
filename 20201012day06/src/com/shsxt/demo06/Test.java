package com.shsxt.demo06;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("E:\\a");
        testDelete(file);
    }
    public static void testDelete(File file){
        if (file==null) return ;

        if (file.isFile()) {
            file.delete();
        }else{
            File[] list = file.listFiles();
            for (File f:list
                 ) {

                testDelete(f);
            }
            file.delete();
        }
    }
}
