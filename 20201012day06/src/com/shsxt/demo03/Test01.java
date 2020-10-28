package com.shsxt.demo03;

public class Test01 {
    public static void main(String[] args) {
        String id="123123,";
        if (id.contains(",")){
            System.out.println("包含敏感字符");
        }
        String password="asfdaA";
        if (password.length()<15||password.length()>30){
            System.out.println("密码长度在15到30");
        }if (password.contains(id)){
            System.out.println("不能包含账号");
        }if (password.toLowerCase()==password||password.toUpperCase()==password){
            System.out.println("必须包含大小写");
        }
        String fileName="asd";
        String temp=fileName.substring(0,1).toUpperCase()+fileName.substring(1);
        String setMethod="set"+temp;
        String getMethod="get"+temp;
        System.out.println(getMethod);
        System.out.println(setMethod);

    }
}
