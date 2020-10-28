package com.shsxt.demo.demoAnno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test01 {
    @Identify(1)
    public void say(int i){
        System.out.println("1个参数");
    }
    @Identify(2)
    private void tell(int i,int j){
        System.out.println("2个参数");
    }
    public static void main(String[] args) throws Exception {
        Class<Test01> test01Class = Test01.class;
        Test01 test01 = test01Class.newInstance();
        Method say = test01Class.getDeclaredMethod("tell", int.class,int.class);
        say.setAccessible(true);
        say.invoke(test01,1,2);
        if(say.isAnnotationPresent(Identify.class)){
            Identify annotation = say.getAnnotation(Identify.class);
            Identify declaredAnnotation = say.getDeclaredAnnotation(Identify.class);
            System.out.println(declaredAnnotation.value());
            System.out.println(annotation.value());
        }else{
            System.out.println("没有该注解");
        }


    }
}
