package com.shsxt.demoArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
       MyArrayList<String>list=new MyArrayList<>();
       list.add("li");
       list.add("shi");
       list.add(1,"hai");
       System.out.println(list.indexOf("shi"));
       list.remove(0);
        System.out.println(list.get(0));
        list.remove("li");
        System.out.println(list.indexOf("li"));

        ArrayList<String> l = new ArrayList<>(1);
        l.add("A");
        l.add("B");


    }
}
