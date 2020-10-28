package com.shsxt.demoT;

public class Test02 {
    public static void main(String[] args) {
        Pet<String> pet= new Pet<>();
        Pet.test();
        pet.test1("qwe");
        Test02 test02=new Test02();
        test02.test3(new Pet<Object>());
    }
    public void test3(Pet<? super String>p){
        System.out.println(p.name);
    }
}
class Pet <T>{
    public String name;
    public void test1(T t){
        System.out.println(t);
    }
    public static <E> void test(){
        System.out.println("hello");
    }

}

