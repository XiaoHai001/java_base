package com.shsxt02.demoInnerClass;

public class Test01 {
    public static void main(String[] args) {
        Test01.Inner a= new Test01.Inner();
        test();
    }
    static class Inner{

    }
    static void test(){
        int a=10;
        class Inner02{
            void test(){
                System.out.println(a);
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.test();
    }
}
