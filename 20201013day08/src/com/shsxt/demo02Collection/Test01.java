package com.shsxt.demo02Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        LinkedList<String> strings = new LinkedList<>();
        System.out.println(list.subList(1, 3));
    }
}
