package com.shsxt.demo.homework.work1;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws Exception {
        File file = new File("file");
        File copyFile = new File("copyFile");
        copy(file,copyFile);
    }
    public static void copy(File file,File copyFile) throws Exception {
        if (!file.exists()) {
            return;
        }
        if (file.isFile()) {
            InputStream in = new FileInputStream(file);
            OutputStream ou=new FileOutputStream(copyFile);
            int c;
            while ((c=in.read()) != -1) {
                ou.write(c);
            }
        }
        if (file.isDirectory()) {
            copyFile.mkdirs();
            File[] files = file.listFiles();
            for (File file1 : files) {
                String file1Path = file1.getName();
                String copyFilePath = copyFile.getPath();
                File file2 = new File(copyFilePath + "\\" + file1Path);
                copy(file1,file2);
            }
        }





    }
}
