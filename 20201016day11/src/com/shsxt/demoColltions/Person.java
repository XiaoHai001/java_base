package com.shsxt.demoColltions;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private float height;

    public Person() {
    }

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int temp=this.age-o.age; //升序
        Float a=this.height;
        Float b=o.height;
        if (temp==0) {
            return a.compareTo(b);
        }
        String str1=this.name;
        String str2=o.name;

        return temp;
    }
}
