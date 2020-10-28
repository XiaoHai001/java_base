package com.shsxt.demoCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {StringBuilder stringBuilder=new StringBuilder("sd sdf fss af  gd   sedf   ");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("pig");
        arrayList.add("cat");
        arrayList.add("dog");
        arrayList.add("pig");
        arrayList.add("ma");
        System.out.println(arrayList.indexOf("pig"));

        System.out.println(arrayList);
        System.out.println("过了两天");
        arrayList.add("新同学");
        System.out.println(arrayList);

        arrayList.remove("pig");
        System.out.println(arrayList);

        System.out.println(arrayList.contains("胡志鹏"));

        arrayList.clear();
        System.out.println(arrayList);
    }
}
