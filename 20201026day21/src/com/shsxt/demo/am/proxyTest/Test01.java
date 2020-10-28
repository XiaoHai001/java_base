package com.shsxt.demo.am.proxyTest;

import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        HR hr=new HR("lkili",new Manager("hshis"));
        hr.adduser();

    }
}
interface Adduser{
    void adduser();
}
class Manager implements Adduser{
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void adduser() {
        System.out.println("技术面试");
    }
}
class HR implements Adduser{
    private String name;
    private Manager manager;

    public HR(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    @Override
    public void adduser() {
        System.out.println("开始面试");
        manager.adduser();
        System.out.println("薪资");

    }
}
