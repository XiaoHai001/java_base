package com.shsxt.demo06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;


public class Test04 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1998, 9, 9);
        System.out.println(localDate);
        System.out.println(Year.now());
        System.out.println("-----------------------");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now.format(dateTimeFormatter));
        String a="2000-09-09";
        LocalDate parse = LocalDate.parse("20000909", dateTimeFormatter);
        System.out.println(parse.getDayOfMonth());
    }
}
