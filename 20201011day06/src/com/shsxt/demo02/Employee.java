package com.shsxt.demo02;

import java.util.Date;

public class Employee {
    private String name;
    private int birthdayMonth;

    public Employee() {
    }

    public Employee(String name, int birthdayMonth) {
        this.name = name;
        this.birthdayMonth = birthdayMonth;
    }

    public double getSalary( int month) {

        if (month == birthdayMonth) {
            return 100;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(int birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }
}
