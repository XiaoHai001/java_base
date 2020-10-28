package com.shsxt.demo.homework.work02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
    private static Map<String,String>map=new HashMap<>();
    public static void main(String[] args) throws Exception {
        login();

    }
    public static void login() throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入用户名(三个字母开头，【8,12】之间)：");  //三个字母开头，【8,12】之间
        String name = reader.readLine();
        System.out.println("请输入密码(首字母大写，8位以上)：");      //首字母大写，8位以上
        String password=reader.readLine();
        if (name.matches("[a-zA-Z]{3}.{5,9}")&&password.matches("[A-Z].{7,}")) {
            System.out.println("注册成功！");
            if (map.get(name)!=null) {
                System.out.println("该用户已存在");
            }else{
                map.put(name,password);
            }
        }else{
            System.out.println("用户名或密码不规范！");
        }
    }
}
