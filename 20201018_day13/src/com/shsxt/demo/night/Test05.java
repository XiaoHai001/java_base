package com.shsxt.demo.night;

public class Test05 {
    public static void main(String[] args) {
        add(1,2,3,4,5);
    }
    public static void add(int ... num){
        for (int i : num) {
            System.out.println(i);
        }
    }
}
