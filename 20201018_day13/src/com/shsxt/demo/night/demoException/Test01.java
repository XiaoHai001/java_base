package com.shsxt.demo.night.demoException;

public class Test01 {
    public static void main(String[] args) {
        try {
            say(-2);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void say(int a) throws MyException {
        if (a<0){
            throw  new MyException("非法数字:"+a);
        }

    }
}
