package com.shsxt.demo01;

public class Test01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person("zhangsan",18,new Computer("asus"));
        Person clone = person.clone();
        System.out.println(clone.getComputer()==person.getComputer());
        System.out.println(clone);
        String a="abc";
        String b="abc";
        a.getBytes();
        System.out.println(a.getBytes());
        System.out.println(b.getBytes());
        System.out.println(a==b);

    }
}
