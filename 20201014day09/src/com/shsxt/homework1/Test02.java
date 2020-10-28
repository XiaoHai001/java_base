package com.shsxt.homework1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        String[] QQs = {"1242","123123","92391723","1231231","12335345","3242342"};
        Set<String>set=new HashSet<>();
        set.addAll(Arrays.asList(QQs));
        Set<String>setNew=new HashSet<>();
        System.out.println("合法QQ：");
        for (String s : set) {
            if (s.length()<=13&&s.length()>=7){
                System.out.print(s+"    ");
                setNew.add(s);
            }
        }
        System.out.println();
        String myQQ="12335345";
        if (setNew.contains(myQQ))setNew.remove(myQQ);
        Iterator<String> iterator = setNew.iterator();
        System.out.println("最后剩下的QQ号：");
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
