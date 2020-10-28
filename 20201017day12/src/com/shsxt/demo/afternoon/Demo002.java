package com.shsxt.demo.afternoon;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo002 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("e.txt"));
        dataOutputStream.writeInt(12);
        dataOutputStream.writeChar('a');
        dataOutputStream.flush();
        dataOutputStream.close();
    }
}
