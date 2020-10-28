package com.shsxt.demoException;

public class Test01 {
    public static void main(String[] args) {
        int r=-1;
        if (r<0){
            try {
                throw new MyException("半径不能为负数");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("面积为："+Math.PI*r*r);
        }


    }
}
