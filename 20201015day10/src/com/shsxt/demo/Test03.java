package com.shsxt.demo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        Set<Person> set=new HashSet<>();
        set.add(new Person("zhasngsan",20));
        set.add(new Person("zhangsan",22));
        set.add(new Person("zhangsan",19));
        Person zhangsan = new Person("zhangsan", 19);
        System.out.println(set.contains(zhangsan));


    }
}
class Person{
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
