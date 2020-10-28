package com.shsxt.demo.pm3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Socket accept;
        while(true){
            accept = server.accept();
            InputStream in=accept.getInputStream();
            DataInputStream dis=new DataInputStream(new BufferedInputStream(in));

            String s = dis.readUTF();
            String[] split = s.split("&");

            String name=split[0].substring(9);
            String psw=split[1].substring(4);
            DataOutputStream dop=new DataOutputStream(new BufferedOutputStream(accept.getOutputStream()));
            if ("lsh".equals(name)&&"123".equals(psw)){
                dop.writeUTF("登录成功");
            }else {
                dop.writeUTF("登录失败");
            }
            dop.flush();
            dop.close();
            if (-1>0)break;
        }
        accept.close();
        server.close();

    }
}
