package com.shsxt.demo06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) throws ParseException {
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH：mm：ss");
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.parse("1998-01-24 09：08：07"));
        System.out.println(new Date(0L));
    }
}
