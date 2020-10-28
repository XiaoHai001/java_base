package com.shsxt.demoColltions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("zhansan",18, (float) 1.70));
        list.add(new Person("李四",19, (float) 1.80));
        list.add(new Person("王五",18, (float) 1.90));
        list.add(new Person("赵六",20, (float) 1.70));
        Collections.sort(list);
        Collections.sort(list,Person::compareTo);

        System.out.println(list);


    }
}
