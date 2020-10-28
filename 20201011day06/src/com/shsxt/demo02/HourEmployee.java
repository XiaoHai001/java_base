package com.shsxt.demo02;

public class HourEmployee extends Employee{
    private double  hourSalary;
    private double monthOfworkHour;


    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public double getMonthOfworkHour() {
        return monthOfworkHour;
    }

    public void setMonthOfworkHour(double monthOfworkHour) {
        this.monthOfworkHour = monthOfworkHour;
    }

    public HourEmployee() {

    }

    @Override
    public double getSalary( int month) {
         double monthSalary=hourSalary*monthOfworkHour;
         if(monthOfworkHour>160){
             monthSalary+=hourSalary*(monthOfworkHour-160)*0.5;
         }
        monthSalary+=super.getSalary( month);
         return monthSalary;
    }

    public HourEmployee(String name, int birthdayMonth, double hourSalary, double monthOfworkHour) {
        super(name, birthdayMonth);
        this.hourSalary = hourSalary;
        this.monthOfworkHour = monthOfworkHour;
    }
}
