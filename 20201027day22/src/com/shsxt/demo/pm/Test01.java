package com.shsxt.demo.pm;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws Exception {
        ServerSocket socket=new ServerSocket(8888);
        Socket server = socket.accept();
        InputStream inputStream = server.getInputStream();
        OutputStream outputStream = server.getOutputStream();
        DataInputStream dis=new DataInputStream(inputStream);
        DataOutputStream dos=new DataOutputStream(outputStream);
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            String utf = dis.readUTF();
            if ("bye".equals(utf)){
                System.out.println("bye");
            }
            System.out.println("收到消息："+utf);
            System.out.println("请回应数据：");
            String str2=scanner.next();
            dos.writeUTF(str2);
            dos.flush();
        }
        dos.close();
        dis.close();
        socket.close();
    }
}
