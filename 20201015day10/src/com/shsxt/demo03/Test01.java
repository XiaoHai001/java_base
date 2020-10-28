package com.shsxt.demo03;

import java.io.IOException;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new Thread().getContextClassLoader().getResourceAsStream("db.yml"));
        System.out.println(properties.getProperty("user"));
    }
}
