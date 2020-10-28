package com.shsxt.demo03;

public class Test02 implements Cloneable{

    public Test02(){
        System.out.println("实例化一个对象");
    }
    public void say(){
        System.out.println("hello");
    }
    @Override
    public Test02 clone() throws CloneNotSupportedException {
        return (Test02)super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Test02 test02=new Test02();
        Test02 clone = test02.clone();
        System.out.println(clone.equals(test02));
    }
}
