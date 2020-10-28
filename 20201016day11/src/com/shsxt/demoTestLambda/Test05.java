package com.shsxt.demoTestLambda;

import java.io.File;

public class Test05 {
    public static void main(String[] args) {
        File f=new File("E:\\sxt\\test");

        File[]files=f.listFiles((pathname)->{

            if (pathname.isFile()){
                return true;
            }
            return false;
        });
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
