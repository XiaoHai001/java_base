package com.shsxt.demo.pm.demo;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress=InetAddress.getByName("www.baidu.com");

        InetSocketAddress inetSocketAddress=new InetSocketAddress(inetAddress,9999);
        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetAddress.getHostAddress());
    }

}
