package com.shsxt.demo.homework.work01;

import java.util.*;

public class TestLambda01 {
    public static void main(String[] args) {
       List<Employee> set=new ArrayList<>();
        set.add(new Employee("zhangsan",16));
        set.add(new Employee("lisi",16));
        set.add(new Employee("zhangsan",15));
        set.add(new Employee("zhangsan",16));
        System.out.println(set.size());
        Collections.sort(set,(t,v)->{
            Integer tAge=t.getAge();
            if (tAge!=v.getAge()) {
                return tAge.compareTo(v.getAge());
            }
            return t.getName().compareTo(v.getName());
        });
        System.out.println(set);

    }
}
