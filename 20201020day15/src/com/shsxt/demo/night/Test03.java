package com.shsxt.demo.night;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        Set<Star>set=new HashSet<>();
        set.add(new Star("zs",18,true,Direction.ACTOR));
        set.add(new Star("ls",18,true,Direction.ACTOR));
        set.add(new Star("ww",18,true,Direction.ACTOR));
        set.add(new Star("zs",18,true,Direction.ACTOR));
        set.add(new Star("sq",18,true,Direction.ACTOR));
        Iterator<Star> iterator = set.iterator();
        while (iterator.hasNext()) {
            Star next = iterator.next();
            System.out.println(next);
        }

    }
}
class Star{
    private String name;
    private int age;
    private boolean gender;//true:男   false:女
    private Direction direction;

    public Star() {
    }

    public Star(String name, int age, boolean gender, Direction direction) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.direction = direction;
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

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", direction=" + direction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return age == star.age &&
                gender == star.gender &&
                Objects.equals(name, star.name) &&
                direction == star.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, direction);
    }
}
