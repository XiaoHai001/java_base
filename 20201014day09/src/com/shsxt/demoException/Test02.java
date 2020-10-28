package com.shsxt.demoException;

public class Test02 {
    public static void main(String[] args) {
        try {
            test(6);
        } catch (Myexception02 myexception02) {
            System.out.println(myexception02.getMessage());
        }
    }
    public static  void test(int a) throws Myexception02 {
        if (a<0){
            throw new Myexception02("a<0");
        }else {
            System.out.println("a: "+a);
        }
    }
}
