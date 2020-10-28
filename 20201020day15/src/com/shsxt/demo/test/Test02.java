package com.shsxt.demo.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test02 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());
        InetAddress byName1 = InetAddress.getByName("103.235.46.39");
        System.out.println(byName1);
        System.out.println(byName1.getHostName());
        System.out.println(byName1.getHostAddress());
    }
}
