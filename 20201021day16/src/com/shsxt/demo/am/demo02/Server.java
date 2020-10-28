package com.shsxt.demo.am.demo02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Server implements Runnable{

    @Override
    public void run() {
        ServerSocket serverSocket= null;
        try {
            serverSocket = new ServerSocket(8888);
            Socket accept = serverSocket.accept();
            //得到输入流
            InputStream in = accept.getInputStream();
            DataInputStream dis=new DataInputStream(in);
            //读取信息
            String s = dis.readUTF();
            //信息处理
            String[] split = s.split("&");
            String name=split[0].substring(5);
            String psw=split[1].substring(4);
            //得到输出流
            DataOutputStream dos=new DataOutputStream(accept.getOutputStream());
            if ("lsh".equals(name)&&"123".equals(psw)){
                //写出数据
                dos.writeUTF("登录成功");
            }else{
                dos.writeUTF("登录失败");
            }
            //关闭资源
            dis.close();
            dos.flush();
            accept.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
