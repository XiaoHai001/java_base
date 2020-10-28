package com.shsxt.demo02;

public class SalariedEmployee extends Employee {
    private double monthSalary;

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public SalariedEmployee() {

    }

    public SalariedEmployee(String name, int birthdayMonth, double monthSalary) {
        super(name, birthdayMonth);
        this.monthSalary = monthSalary;
    }
    @Override
    public double getSalary( int month) {
        return super.getSalary(month)+monthSalary;
    }

}
