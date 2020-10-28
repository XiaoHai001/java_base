package com.shsxt.demo.now;

import java.io.*;

public class Demo006Copy {
    public static void main(String[] args) throws IOException {
        File file = new File("test.png");
        InputStream in=new FileInputStream(file);
        OutputStream out =new FileOutputStream(new File("testCopy.png"));
        byte[]bytes=new byte[3];
        int c;
        while ((c=in.read(bytes)) != -1) {
            out.write(bytes,0,c);
        }

        out.flush();
        out.close();
        in.close();

    }
}
