package com.shsxt.demo.am;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class Test02 {
    public static void main(String[] args) throws UnknownHostException, FileNotFoundException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("a.txt"));
        BufferedReader reader=new BufferedReader(inputStreamReader);


    }
}
