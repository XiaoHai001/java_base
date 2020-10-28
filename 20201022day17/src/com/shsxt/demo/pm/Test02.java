package com.shsxt.demo.pm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test02 {
    public static void main(String[] args) throws Exception {
        testContr(User.class);
    }
    public static void testContr(Class cl) throws Exception {
        Constructor constructor = cl.getConstructor(String.class,int.class,boolean.class);
        User user = (User) constructor.newInstance("xlsas",89,true);
        System.out.println(user);
        System.out.println("--------------------------");
        Field name = cl.getDeclaredField("name");
        name.setAccessible(true);
        name.set(user,"lis");
        System.out.println(user);
        Method getName = cl.getDeclaredMethod("getName");
        String name2 = (String) getName.invoke(user);
        System.out.println(name2);

        Constructor declaredConstructor = cl.getDeclaredConstructor(String.class, int.class, boolean.class);
        User user1 = (User) declaredConstructor.newInstance("opo", 77, true);
        System.out.println(user1);

    }
}
class User{
    private String name;
    private int age;
    private boolean gender;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age, boolean gender) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}