package com.shsxt.demo.pm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) {

        testM(B.class);
    }
    public static void testF(Class cl){
        Field[] fields = cl.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] declaredFields = cl.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            System.out.println(declaredField.getName());
        }
    }

    public static void testM(Class cl){
        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

    }
}

class A{
    public int age;
    public void a(){

    }
}
class B extends A{
   private String name;
   public void b(){

   }
}