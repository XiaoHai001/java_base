package com.shsxt.demo.pm;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test implements Serializable {
    public Test() {
    }
    static void print(List<Integer> al) {
        al.add(2);
        al = new ArrayList<Integer>();
        al.add(3);
        al.add(4);
    }
    public static void main(String[] args) throws IOException {
        float f=3.4f;
        Float f2=3.4f;
        double d=3.4;
        Double d2=3.4;
        long l1=345;
        Long l2=224L;
        System.out.println(1>0?9:9.9);//自动向上转输出9.0


        Writer writer = new FileWriter("c:\\mytext.txt");
        writer.write("你好opo");
        writer.flush();
        writer.close();

        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        print(al);
        System.out.println(al.get(1));
    }
}
