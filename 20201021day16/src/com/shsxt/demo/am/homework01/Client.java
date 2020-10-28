package com.shsxt.demo.am.homework01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws Exception {
        //获取服务器的地址，端口
        InetAddress address = InetAddress.getByName("localhost");
        Socket client=new Socket(address,9999);
        //得到输出流
        OutputStream out = client.getOutputStream();
        //存放上传数据的数组
        byte[]bytes=new byte[1024];
        InputStream in=new FileInputStream("face1.jpeg");
        int c;
        while ((c=in.read(bytes)) != -1) {
            out.write(bytes,0,c);
        }
        //结束标语
        out.write("上传结束".getBytes());
    }
}
