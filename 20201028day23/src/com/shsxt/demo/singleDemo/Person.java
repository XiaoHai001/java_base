package com.shsxt.demo.singleDemo;

//饿汉式
public class Person {
    //private String name;
    private static Person person=new Person();
    private Person(){

    }

    public static Person getPerson() {
        return person;
    }
    public void say(){
        System.out.println("hello,world");
    }
}
