package com.shsxt.demo.pm;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//接收端
public class server {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(8888);   //接收端的端口号
        byte[]bytes=new byte[1024];                 //用于存放接收传来的数据
        OutputStream ou=new FileOutputStream("faceCopy2.jpeg"); ;
        while(true){
            DatagramPacket dp=new DatagramPacket(bytes,0,bytes.length);   //得到数据包
            ds.receive(dp);                                        //进行接收
            int length = dp.getLength();
            if (length==0)break;
            ou.write(dp.getData(),0,length);
        }

        ou.flush();          //刷新
        ou.close();         //关闭
        ds.close();
    }
}
