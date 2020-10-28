package com.shsxt.demoAnno;

import java.lang.reflect.Field;

public class Test {
    public static void valid(Object obj) throws IllegalAccessException {
        Class<?> aClass = obj.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field field : declaredField) {
            DefineAno test=field.getAnnotation(DefineAno.class);
            if (test!=null){
                field.setAccessible(true);
                if("class java.lang.String".equals(field.getGenericType().toString())){//字符串类型的才判断长度
                    String value = (String)field.get(obj);
                    if(value != null && ((value.length() > test.max()) || value.length() < test.min())){
                        System.out.println(test.description());
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        AnnoationTest annoationTest=new AnnoationTest();
        annoationTest.setName("345");
        try {
            valid(annoationTest);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
