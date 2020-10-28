package com.shsxt.demo.demoAnno02;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.shsxt.demo.demoAnno02.People");
        People people= (People) aClass.newInstance();
        Field name = aClass.getDeclaredField("name");

        name.setAccessible(true);
        name.set(people,"xiaohai");
        Method setAge = aClass.getDeclaredMethod("setAge", int.class);
        setAge.invoke(people,14);
        System.out.println(people);

        FelidAnno annotation = name.getAnnotation(FelidAnno.class);
        System.out.println(annotation);
        name.set(people,annotation.value());
        System.out.println(people.getName());
    }
}
class People{

    @FelidAnno
    private String name;

    private int age;
    private boolean gender;

    public People() {
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
