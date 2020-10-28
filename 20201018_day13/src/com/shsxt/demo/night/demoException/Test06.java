package com.shsxt.demo.night.demoException;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test06 {
    public static void main(String[] args) {
        BiFunction<String,Integer,Person> supplier1=(k,v)->{return new Person(k,v);};
        BiFunction<String,Integer,Person> supplier =Person::new;
        Person p=supplier.apply("li",18);
        supplier1.apply("shi",19);
        System.out.println(p);
        System.out.println(supplier1);

        Supplier<String>supplier2=p::getName;
        System.out.println(supplier2.get());
        Comparator <Integer>compare=Integer::compare;
        System.out.println(compare.compare(2, 3));
    }
}
class Person{
    private String name;
    private int age;
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
