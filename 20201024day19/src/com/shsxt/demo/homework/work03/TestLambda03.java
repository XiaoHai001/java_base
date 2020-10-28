package com.shsxt.demo.homework.work03;

public class TestLambda03 {
    public static void main(String[] args) {
        test03(100,200,(k,v)->{
            return k+v;
        });
    }
    public static void test03(long l1,long l2,TestFunction02<Long,Long> f){
        System.out.println(f.test(l1, l2));
    }
}
