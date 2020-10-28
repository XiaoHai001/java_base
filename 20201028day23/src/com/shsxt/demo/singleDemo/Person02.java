package com.shsxt.demo.singleDemo;

public class Person02 {
    private static  Person02 person02;
    private Person02(){

    }

    public static synchronized Person02 getPerson02() {

        if (person02==null){
           return person02=new Person02();
        }
        return person02;
    }
}
