package com.shsxt.demo02;

public class BasePlusSalesEmployee extends SalesEmployee {
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusSalesEmployee() {

    }

    public BasePlusSalesEmployee(String name, int birthdayMonth, double monthSale, double commissionRate, double baseSalary) {
        super(name, birthdayMonth, monthSale, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+baseSalary;
    }
}
