package com.shsxt.demoTestLambda02;

import java.util.Comparator;
import java.util.function.Predicate;

public class Test02 {
    public static void main(String[] args) {

        Predicate <Integer>predicate=Student::test;
        System.out.println(predicate.test(6));
        Comparator<Integer> comparator=Integer::compare;
        System.out.println(comparator.compare(4, 5));
    }
}
class Student{
    private int a=10;

    public int getA() {
        return a;
    }

    public Student(int a) {
        this.a = a;
    }

    public Student() {
    }

    public void setA(int a) {
        this.a = a;
    }

    public static boolean test(int b){
        return 10>b;
    }
}
