package com.shsxt.demo03T;

public class Test01 {
    public static void main(String[] args) {
        A<String> a=new B();
        a.say("asd");
        say("nihao");
        a.test(new B<>());

    }
    public static <T> void say(T t){
        System.out.println("waibu"+t);
    }
}
class  A<T>{
    public void test(A<? super A> a){
        System.out.println("hello");
    }
    public void say(T t){
        System.out.println("helloA"+t);
    }
}
class B<E> extends A<E>{
    public void say(E e){
        System.out.println("helloB"+e);
    }
}
