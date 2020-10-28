package com.shsxt.demo04;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class Test01 {
    public static void main(String[] args) {
        try {
            testExceotion("hello2");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(1010*20);

    }
    public static void testExceotion(String message) throws MyException {
        if(message.equals("hello")){
            throw new MyException("数据出错");
        }
        System.out.println(message);
    }
}
class F{
     Object say() throws Exception {
        return 0;
    }
}
class S extends F{
    @Override
    public String say() throws Exception {
        return "1";
    }
}
