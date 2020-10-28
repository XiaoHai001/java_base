package com.shsxt.demo05;

public class Test {
    public static void main(String[] args) {
        test(0);
    }
    public static void test(double d){
        if (d==0){
            try {
                throw new MyException("数据出错！");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
