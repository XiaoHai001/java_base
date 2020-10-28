package com.shsxt.demo.afternoon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DemoWrite {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("d.txt",true));
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("输入(exit退出）：");
            String next = scanner.next();
            if ("exit"==next)break;

            bufferedWriter.write("   "+next);
            bufferedWriter.flush();
        }


        bufferedWriter.close();
    }
}
