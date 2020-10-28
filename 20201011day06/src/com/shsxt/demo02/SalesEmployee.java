package com.shsxt.demo02;

public class SalesEmployee extends Employee {
    private double monthSale;
    private double commissionRate;

    public SalesEmployee() {

    }

    public SalesEmployee(String name, int birthdayMonth, double monthSale, double commissionRate) {
        super(name, birthdayMonth);
        this.monthSale = monthSale;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+month*commissionRate;
    }

    public double getMonthSale() {
        return monthSale;
    }

    public void setMonthSale(double monthSale) {
        this.monthSale = monthSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
