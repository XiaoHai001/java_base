package com.shsxt.demo02;

public class Cashier extends SalariedEmployee{

    public Cashier() {
    }

    public Cashier(String name, int birthdayMonth, double monthSalary) {
        super(name, birthdayMonth, monthSalary);
    }

    public double provideSalary(Employee emp, int month){
        return emp.getSalary(month);
    }
}
