package com.shsxt.demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date date=new Date();
        String s = simpleDateFormat.format(date);
        System.out.println(s);
        String birthday="2008.5.5 2:3:4";
        Date parse = simpleDateFormat.parse(birthday);
        System.out.println(parse);
        System.out.println(parse.before(new Date()));
    }
}
