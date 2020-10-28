package com.shsxt.demo.am;

import java.io.IOException;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties properties=new Properties();
        properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("xxx.properties"));
        String name=properties.getProperty("name");
        Test01 test01 = (Test01) Class.forName(name).newInstance();
        test01.say();
    }
    public void say(){
        System.out.println("hello");
    }
    public Test01(){
        System.out.println("wucan");
    }
}
