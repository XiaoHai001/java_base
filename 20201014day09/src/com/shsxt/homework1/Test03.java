package com.shsxt.homework1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        String text="You can't cross the same river twice , the popular saying goes . This wisdom reminds us that everything changes  expecting to relive your bygone days of success in the same way is unrealistic . But , apparently ,  this doesn't apply to music . Over the last decade or so , for one reason or another , a number of high-profile bands have decided to stop resting on their laurels and have reunited . But why";
        text = text.replace(',', ' ');
        text = text.replace('.', ' ');
        text=text.toLowerCase();
        String[] s = text.split("\\s+");
        Map<String,Integer>wordMap=new HashMap<>();
        for (String s1 : s) {
            if (null==wordMap.get(s1)) {
                wordMap.put(s1,1);
            }else {
                wordMap.put(s1,wordMap.get(s1)+1);
            }
        }
        Set<String> set = wordMap.keySet();
        for (String s1 : set) {
            System.out.printf("%-15s %-10d",s1,wordMap.get(s1));
            System.out.println();
        }
    }


}
