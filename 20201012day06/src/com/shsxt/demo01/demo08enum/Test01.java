package com.shsxt.demo01.demo08enum;

public class Test01 {
    public static void main(String[] args) {
        Week week=Week.MONDAY;
        System.out.println(week.getStr());
        System.out.println(week.getI());
        switch (week){
            case MONDAY:
                System.out.println("1");break;
            case QUESDAY:
                System.out.println(2);break;
            case THIRDAY:
                System.out.println(3);break;
        }
    }
}
