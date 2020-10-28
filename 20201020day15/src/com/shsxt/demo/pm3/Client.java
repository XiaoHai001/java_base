package com.shsxt.demo.pm3;

import java.io.*;
import java.net.Socket;

//客户端
public class Client implements Runnable{
    @Override
    public void run() {
        Socket client= null;
        try {
            client = new Socket("localhost",8888);
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream dos;
            DataInputStream dis;
            synchronized (this){
                System.out.println("请输入用户名：");
                String username=bufferedReader.readLine();
                System.out.println("请输入密码：");
                String pwd=bufferedReader.readLine();

                //输出流
                OutputStream ou=client.getOutputStream();
                dos=new DataOutputStream(new BufferedOutputStream(ou));

                dos.writeUTF("username="+username+"&pwd="+pwd);
                dos.flush();
                //输入流
                dis=new DataInputStream(new BufferedInputStream(client.getInputStream()));
                String s = dis.readUTF();
                System.out.println(s);

                dis.close();
                dos.close();
                client.close();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


public static void main(String[] args) throws IOException {
    Client client=new Client();
    Thread thread=new Thread(client);
    Thread thread1=new Thread(client);
    Thread thread2=new Thread(client);
    Thread thread3=new Thread(client);
    thread.start();
    thread1.start();
    thread2.start();
    thread3.start();
}


}
