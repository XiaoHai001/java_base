package com.shsxt.demo.prepare;

import java.lang.reflect.Array;

public class Test07 {
    public static void main(String[] args) {
        Object obj= Array.newInstance(int.class,5);
        if (obj.getClass().isArray()){
            System.out.println(Array.getLength(obj));
            Array.set(obj,0,100);
            System.out.println(Array.get(obj,0));
        }
    }
}
