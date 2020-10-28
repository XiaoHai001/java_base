package com.shsxt.demo.pm2;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

//客户端
public class Client {
    public static void main(String[] args) throws IOException {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8888);
        Socket client=new Socket("localhost",8888);

        System.out.println("客户端！");

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名：");
        String username=bufferedReader.readLine();
        System.out.println("请输入密码：");
        String pwd=bufferedReader.readLine();

        OutputStream ou=client.getOutputStream();
        DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(ou));

        System.out.println("username="+username+"&pwd="+pwd);
        dos.writeUTF("username="+username+"&pwd="+pwd);
        dos.flush();

        dos.close();
        client.close();

    }
}
