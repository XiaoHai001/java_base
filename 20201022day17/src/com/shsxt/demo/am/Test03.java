package com.shsxt.demo.am;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test03 {
    public static void main(String[] args) throws Exception {
        getC(People.class);
    }
    public static void getC(Class clz) throws Exception {
        Constructor constructor = clz.getConstructor();
        System.out.println(constructor.newInstance());

        Constructor constructor1 = clz.getConstructor(int.class);
        System.out.println(constructor1.newInstance(8));

        Constructor constructor2 = clz.getConstructor(String.class, boolean.class);
        constructor2.newInstance("zhansgan",true);

        Constructor constructor3 = clz.getConstructor(String.class, int.class, boolean.class);
        constructor3.newInstance("lsh",14,true);


        Constructor declaredConstructor = clz.getDeclaredConstructor(String.class, boolean.class);
        System.out.println(declaredConstructor.newInstance("lisi", true));

    }
}
class People{
    private String name;
    private int age;
    private boolean gender;

    public People(){

    }

    public People(int age) {
        this.age = age;
    }

    public People(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public People(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
