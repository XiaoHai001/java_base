package com.shsxt.demo05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static java.time.LocalDate.*;

public class Order {
    public static void main(String[] args) {
        Order order = new Order(2);
        System.out.println(order.arriveTime);
        System.out.println(now());
        System.out.println( parse("2020-10-12"));


    }

    private LocalDateTime orderTime;
    private LocalDateTime arriveTime;

    public Order() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH点");
        this.orderTime = LocalDateTime.now();
        int hour = this.orderTime.getHour();
        if (hour < 11) {
            this.arriveTime = this.orderTime.withHour(18);
            String format = this.arriveTime.format(dateTimeFormatter);
            System.out.println(format);
        } else {

            this.arriveTime = this.orderTime.withDayOfMonth(this.orderTime.getDayOfMonth() + 1);

            this.arriveTime = this.arriveTime.withHour(12);
            String format = this.arriveTime.format(dateTimeFormatter);
            System.out.println(format);
        }
    }

    public Order(int i) {
        this.orderTime = LocalDateTime.now();
        LocalDateTime tempTime = this.orderTime;
        tempTime=tempTime.withHour(11);
        tempTime=tempTime.withMinute(0);
        tempTime=tempTime.withSecond(0);
        System.out.println(ChronoUnit.HOURS.between(orderTime, tempTime));
        if (ChronoUnit.HOURS.between(orderTime, tempTime) > 0) {
            this.arriveTime=tempTime.withHour(18);
        }else{
            tempTime=tempTime.plusDays(1);
            this.arriveTime=tempTime.withHour(12);

        }
    }
}
