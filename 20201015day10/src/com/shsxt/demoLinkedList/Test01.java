package com.shsxt.demoLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        MyLinkedList<Integer> list=new MyLinkedList<>();
       list.add(1);
       list.add(2);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list.size());

    }
}
