package com.shsxt.demo.test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
       // InetSocketAddress isa=new InetSocketAddress("localhost",8888);
        //InetSocketAddress isa2 = new InetSocketAddress(InetAddress.getLocalHost(), 8989);
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        System.out.println(byName);
        System.out.println(byName.getHostName()+"lilili");

        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);
        String hostAddress = byName1.getHostAddress();
        System.out.println(hostAddress);

        System.out.println(byName1.getHostName());   //得到域名
    }
}
