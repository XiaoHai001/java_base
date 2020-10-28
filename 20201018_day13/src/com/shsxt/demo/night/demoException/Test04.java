package com.shsxt.demo.night.demoException;

public class Test04 {
    public static void main(String[] args) {
        Week week=Week.ONE;
        Week week1=Week.THREE;
        System.out.println(week.equals(week1));
        System.out.println(week.compareTo(week1));
    }
}
