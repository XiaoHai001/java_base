package com.shsxt.demo.pm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("localhost",8888);

        OutputStream outputStream = client.getOutputStream();
        DataOutputStream dos=new DataOutputStream(outputStream);
        DataInputStream dis=new DataInputStream(client.getInputStream());
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        while (flag){
            System.out.println("请发送信息：");
            String next = scanner.next();
            dos.writeUTF(next);
            dos.flush();
            String c;
            System.out.println("收到应答："+(c=dis.readUTF()));
            if ("bye".equals(c)){
                //System.out.println("bye");
                break;
            }

        }

        dis.close();
        dos.close();

    }
}
