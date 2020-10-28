package com.shsxt.demo.night.fileStream;

import java.io.*;

public class Test05 {
    public static void main(String[] args) throws IOException {

        InputStream in=new FileInputStream("test.png");
        OutputStream out =new FileOutputStream("testCopy.png");
        int c;
        while ((c=in.read()) != -1) {
            out.write(c);
        }
        out.flush();
        out.close();
        in.close();

    }
}
