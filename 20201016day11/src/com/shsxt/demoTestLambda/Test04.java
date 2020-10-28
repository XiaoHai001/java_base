package com.shsxt.demoTestLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test04 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("er");
        list.add("retygfh");
        list.add("23454我");
        list.add("dsguir");

//        list=getList(list,(t)->{
//            if(t.length()>3){
//                return true;
//            }
//            return false;
//        });

        //System.out.println(list);

        list=getList(list,(t)->{
            for (int i = 0; i < t.length(); i++) {
                if ("我".equals(t.charAt(i)+"")){
                    return true;
                }
            }
            return false;
        });
        System.out.println(list);
        list.forEach((k)->{
            System.out.print(k+"  ");
        });
    }
    public static List<String> getList(List<String>list, Predicate<String>predicate){
        List<String >newList=new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                newList.add(s);
            }
        }
        return newList;
    }
}
