package com.shsxt.demo.am;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Test03 {
    public static void main(String[] args) throws IOException {
        URL url=new URL("http://www.baidu.com");
        InputStream in=url.openStream();
        OutputStream ou=new FileOutputStream("baidu.html");
        int c;
        while ((c=in.read()) != -1) {
            ou.write(c);
        }
        ou.flush();
        ou.close();
        in.close();
    }
}
