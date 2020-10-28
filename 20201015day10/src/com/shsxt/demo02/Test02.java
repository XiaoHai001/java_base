package com.shsxt.demo02;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        List <Integer> list=new LinkedList<>();
        list.forEach((t)-> System.out.println(""));
        List<Integer>list1=new ArrayList<>();
        Map<Person,String> map= new HashMap<>();
        Person a=null;
        Person b=null;
        map.put(a,"12");
        map.put(b,"13");
        System.out.println(map.size());

        System.out.println(map.get(null));

    }
}
class Person{

}
