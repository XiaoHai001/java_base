package com.shsxt.demo.am;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) throws Exception {
        String str="sdgfhjgfdsasdfgjkl";
        //String str="";
        Map <Character,Integer>map=new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (map.get(c)!=null) {
                map.put(str.charAt(i),map.get(c)+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
        Test03 test03 = new Test03();
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("test02.txt"));
        map.forEach((k,v)->{
            try {
                test03.say();
                dos.writeUTF(k+" "+v);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
    public static void say(){
        System.out.println("hello");
    }
}
