package com.shsxt.demo.night.testReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) throws Exception {
        Class<Animal> animalClass = Animal.class;
        Animal animal = animalClass.newInstance();
        Field name = animalClass.getDeclaredField("name");
        name.setAccessible(true);
        Method setName = animalClass.getDeclaredMethod("setName", String.class);
        setName.invoke(animal,"nihao");
        System.out.println(animal);

        System.out.println("---------------------");
        Constructor<?>[] constructors = animalClass.getConstructors();

        Constructor<Animal> constructor1 = animalClass.getConstructor(String.class);
        Animal a = constructor1.newInstance("iiiii");
        System.out.println(a);
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

    }
}
class Zu{
    public Zu(){

    }
    public Zu(int i){

    }
}
class Animal extends Zu{
    private String name;
    private int age;
    private boolean gender;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, boolean gender) {
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
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
