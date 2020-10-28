package com.shsxt.demo.afternoon;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        //复制
        IOUtils.copy(new FileInputStream("b.txt"),new FileOutputStream("z.txt"));


        IOUtils.copyLarge(new FileReader("c.txt"),new FileWriter("cCopy.txt"));   //大文件
        InputStream inputStream = IOUtils.toInputStream("asdffgghghg", "utf-8");  //将数据生成输入流

        System.out.println((char)inputStream.read());

        InputStream inputStream1 =  IOUtils.toBufferedInputStream(new FileInputStream("c.txt")); //
        System.out.println(inputStream1.read());

        BufferedReader bufferedReader = IOUtils.toBufferedReader(new FileReader("d.txt")); //将Reader转为FileReader
        System.out.println(bufferedReader.readLine());


        System.out.println("-----------------------");
        System.out.println(FilenameUtils.getBaseName("E:\\sxt\\test\\a.txt"));  //文件名，不包括后缀
        System.out.println(FilenameUtils.getExtension("E:\\sxt\\test\\a.txt"));  //
        System.out.println(FilenameUtils.getPath("E:\\sxt\\test\\a.txt"));    //得到路径
        System.out.println(FilenameUtils.getPrefix("E:\\sxt\\test\\a.txt"));    //得到盘符
        System.out.println(FilenameUtils.isExtension("E:\\sxt\\test\\a.txt", "txt"));  //是否以某个后缀名结尾


    }
}
