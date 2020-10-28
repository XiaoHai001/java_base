package com.shsxt.demo.am.homework01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        //开启服务器端口
        ServerSocket server=new ServerSocket(9999);
        //得到输入流
        InputStream in = server.accept().getInputStream();
        byte[]bytes=new byte[1024];
        //得到输出流，接受文件
        OutputStream out=new FileOutputStream("face1Copy.jpeg");
        while(true){
            int read = in.read(bytes);
            if (read==8){  //收到上传结束标语
                break;
            }
            out.write(bytes,0,read);
        }

    }
}
