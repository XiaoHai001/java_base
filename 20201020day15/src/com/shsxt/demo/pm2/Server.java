package com.shsxt.demo.pm2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket server=new ServerSocket(8888);
        Socket accept = server.accept();
        System.out.println("服务端！");

        InputStream in=accept.getInputStream();
        DataInputStream dis=new DataInputStream(new BufferedInputStream(in));

        String s = dis.readUTF();
        String[] split = s.split("&");
        String name=split[0].substring(9);
        String psw=split[1].substring(4);
        if ("lsh".equals(name)&&"123".equals(psw)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败！");
        }
        in.close();
        accept.close();
        server.close();

    }
}
