package com.shsxt.demo02;

import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        Cashier c =new Cashier("李四",10,3000);
        System.out.println(c.getSalary(10));
        Employee employee=new HourEmployee("张三", 10, 19, 300);
        System.out.println(c.provideSalary(employee,11));
        Employee employee2=new SalariedEmployee("王五",12,4000);
        System.out.println(employee2.getSalary(3));

    }
}
