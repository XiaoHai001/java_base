package com.shsxt.demo.pm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.*;

//发送端
public class Client {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds=new DatagramSocket(9000);  //自己的端口号
        byte[]bytes=new byte[1024];                      //存放发送的数据
        InputStream in=new FileInputStream("face1.jpeg");
        int c;
        //InetSocketAddress localhost = new InetSocketAddress("localhost",8888);
        InetAddress inetAddress=InetAddress.getLocalHost();
        while ((c=in.read(bytes)) != -1) {
            DatagramPacket dp=new DatagramPacket(bytes,0,c,inetAddress,8888);   //内容
            ds.send(dp);          //发送
        }
        in.close();
        ds.close();


    }
}
