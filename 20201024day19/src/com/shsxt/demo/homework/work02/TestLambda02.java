package com.shsxt.demo.homework.work02;

public class TestLambda02 {
    public static void main(String[] args) {
        String string="abcdefghijklmn";
        String s = TestLambda.ChangeStr(string, (v) -> {
            String s1 = v.toUpperCase();
            return s1;
        }, 2, 5);
        System.out.println(s);
    }
}
class TestLambda{
    public static String ChangeStr(String str,TestFunction f,int start,int end ){
        String value = f.getValue(str);
        String s = value.substring(start, end);
        return s;
    }
}