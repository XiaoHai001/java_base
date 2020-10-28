package com.shsxt.demoCollection;

import java.util.ArrayList;

public class DemoListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(new Integer(1));

        System.out.println(list);
    }
}
