package com.shsxt.demo.pm.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Test04Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(9000);
        //byte[]bytes=new byte[1024];
        byte[] bytes1 = "hhahahah".getBytes();
        DatagramPacket packet=new DatagramPacket(bytes1,0,bytes1.length, new InetSocketAddress("localhost",8888));
        socket.send(packet);
        socket.close();
    }
}
