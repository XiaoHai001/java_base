package com.shsxt.demo01;

public class Person implements Cloneable {
    private String name;
    private int age;
    private Computer computer;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Computer computer) {
        this.name = name;
        this.age = age;
        this.computer = computer;
    }

    public Person() {
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

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.setComputer(clone.getComputer().clone());
        return clone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", computer=" + computer +
                '}';
    }
}
