package com.shsxt.demoT;

public class Test01 {
    public static void main(String[] args) {
        A<String> a=new A<>();
        a.test("asd");
        a.say();
        System.out.println(test02(new Integer(2)));

    }
    public static <T> T test02(T e){
        return e;
    }
}
class A<T>{
    public void test(T t){
        System.out.println("upo"+t);
    }
    public  static void say(){
        System.out.println("hello");
    }
}
