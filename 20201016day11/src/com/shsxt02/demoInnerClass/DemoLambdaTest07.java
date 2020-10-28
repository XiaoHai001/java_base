package com.shsxt02.demoInnerClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DemoLambdaTest07 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("ere");
        list.add("or");
        list=filterStr(list,(s)->{
            return s.length()>2;
        });
        System.out.println(list);
    }
    public static List<String> filterStr(List<String>list, Predicate<String>predicate){
        List<String>newList=new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)){
                newList.add(s);
            }
        }
        return newList;
    }
}
