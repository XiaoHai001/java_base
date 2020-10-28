package com.shsxt.demoCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test01 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(2);
        list.set(0,5);
        list.add(1,6);
        list.add(2,7);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.contains(7));
        System.out.println(list.indexOf(2));
        List<Integer> list1 = list.subList(1, 3);
        System.out.println(list1);
        System.out.println("-------------------------------");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        Iterator<Integer> iterator = list.iterator();
        System.out.println("------------------------");
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        System.out.println("------------------------------");
        ListIterator<Integer> integerListIterator = list.listIterator();
        while (integerListIterator.hasNext()) {
            Integer next = integerListIterator.next();
            System.out.println(next);
        }


    }
}
