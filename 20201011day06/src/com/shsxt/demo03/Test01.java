package com.shsxt.demo03;

import com.sun.xml.internal.ws.api.model.CheckedException;

public class Test01 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.shsxt.demo03.Test02");
            Test02 test02= (Test02) aClass.newInstance();
            test02.say();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        try{
            int i=1/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("aasdadfsdf");
        }


    }
}
