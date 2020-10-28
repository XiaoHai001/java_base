package com.shsxt.demo.am.demo02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//客户端
public class Client implements Runnable{
    public static void main(String[] args) throws IOException {
        Thread thread=new Thread(new Client());
        Thread thread2=new Thread(new Client());
        Thread thread3=new Thread(new Client());
        Thread thread4=new Thread(new Client());
        Thread thread5=new Thread(new Client());
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    @Override
    public void run() {
        try {
            //加上类锁
            synchronized (Client.class){
                //开启服务端线程
                Thread thread = new Thread(new Server());
                thread.start();
                //开启客户端
                InetAddress inetAddress = InetAddress.getByName("localhost");
                Socket client=new Socket(inetAddress,8888);
                //得到输出流
                OutputStream out = client.getOutputStream();
                DataOutputStream dos=new DataOutputStream(out);
                //键盘输入
                BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("请输入名字：");
                String name = reader.readLine();
                System.out.println("请输入密码：");
                String pwd = reader.readLine();
                //写入数据
                dos.writeUTF("name="+name+"&pwd="+pwd);
                //刷新
                dos.flush();
                //得到数据输入流
                DataInputStream dis=new DataInputStream(client.getInputStream());
                System.out.println(dis.readUTF());
                //关闭资源
                dis.close();
                dos.close();
                client.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
