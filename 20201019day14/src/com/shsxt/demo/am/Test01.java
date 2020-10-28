package com.shsxt.demo.am;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        Person a=new Person("li");
        Person[]people=new Person[100];
        people[0]=a;
        people= Arrays.copyOf(people,2*people.length);
        Object[]b=people;
        System.out.println((Person)b[0]);

    }
}
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
