package com.shsxt.demo01;

public class Computer implements Cloneable {
    private String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    public Computer() {
    }

    @Override
    public Computer clone() throws CloneNotSupportedException {
        return (Computer) super.clone();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
