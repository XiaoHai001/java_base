package com.shsxt.demoClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date.getTime());
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM--dd");
        System.out.println(simpleDateFormat.format(date));
        String a="1998-03--03";
        Date parse = simpleDateFormat.parse(a);
        System.out.println(parse);

        System.out.println("----------------");

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime.format(dateTimeFormatter));
        LocalDate parse1 = LocalDate.parse("2000-09-09 09:09:09", dateTimeFormatter);
        System.out.println(ChronoUnit.HOURS.between(LocalDateTime.now(), LocalDateTime.now()));
        System.out.println(parse1);


    }
}
