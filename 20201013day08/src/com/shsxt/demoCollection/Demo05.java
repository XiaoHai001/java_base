package com.shsxt.demoCollection;

import java.util.ArrayList;
import java.util.Set;

public class Demo05 {
    public static void main(String[] args) {
        ArrayList<Person>person=new ArrayList<>();
        person.add(new Person<String>("zhangsan",20));
        person.add(new Person<Integer>("zhansgan",20));
        person.add(new Person<>("zhansgan",20));
        Person person1=new Person("zhangsan",20);
        Person p2=person.get(1);
        p2.say(new String("we"));
        System.out.println(person.contains(person1));


    }

}

class Person<T>{
    private String name;
    private int age;

    public Person() {
    }
    public void say(T t){
        System.out.println(t);
    }

    public void test9(Person<?>person){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object obj) {
        Person p2=(Person)obj;
        return p2.age==this.age&&p2.name.equals(this.name);
    }
}


