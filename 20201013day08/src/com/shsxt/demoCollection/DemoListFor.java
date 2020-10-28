package com.shsxt.demoCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoListFor {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("pig");
        names.add("cat");
        names.add("dog");
        System.out.println("------------for-----");
        for (int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        System.out.println("------------foreach-----");
        for (String s:names
             ) {
            System.out.println(s);
        }

        System.out.println("-------迭代------");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("-------迭代------");
        ListIterator<String> stringListIterator = names.listIterator();
        while (stringListIterator.hasNext()){

            System.out.println(stringListIterator.next());
        }
        System.out.println("-------迭代------");
        stringListIterator.add("ert");

        while (stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }
    }
}
