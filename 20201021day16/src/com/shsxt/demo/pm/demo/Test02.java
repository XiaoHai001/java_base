package com.shsxt.demo.pm.demo;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Test02 {
    public static void main(String[] args) throws Exception {
        URL url=new URL("http://www.jd.com");
        InputStream in = url.openStream();
        OutputStream out=new FileOutputStream("jd.html");

        byte[]bytes=new byte[1024];
        int c;
        while ((c=in.read(bytes)) != -1) {
            out.write(bytes,0,c);
        }
        out.flush();
        in.close();
        out.close();

    }
}
