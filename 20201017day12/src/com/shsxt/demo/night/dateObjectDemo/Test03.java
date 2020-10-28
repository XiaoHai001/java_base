package com.shsxt.demo.night.dateObjectDemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
       // FileUtils.copyDirectory(new File("out"),new File("copyout"));
       //FileUtils.copyDirectory(new File("out"),new File("copyout"),(pathname)->{return pathname.getName().length()>=6;});
        //FileUtils.copyDirectoryToDirectory(new File("out"),new File("copyout"));
       // FileUtils.moveDirectory(new File("copyout"),new File("move"));
        FileUtils.deleteDirectory(new File("move"));

    }
}
