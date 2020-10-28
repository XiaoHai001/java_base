package com.shsxt.demo.pm.demo;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test03 {
    public static void main(String[] args) throws Exception {
        //接收端
        DatagramSocket datagramSocket=new DatagramSocket(8888);
        byte[]bytes=new byte[1024];
        DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length);
        datagramSocket.receive(packet);
        //packet.getData();
        System.out.println(new String(packet.getData()));
        System.out.println(new String(bytes));

        datagramSocket.close();
    }
}
