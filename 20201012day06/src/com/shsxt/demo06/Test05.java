package com.shsxt.demo06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test05 {
    public static void main(String[] args) {
        //日期转换器
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); //格式化日期字符串
         LocalDateTime now = LocalDateTime.now();
         String nowStr = now.format(formatter); //放入格式器
         System.out.println(nowStr);
         String dateStr= "2020-02-25 11:23:04"; //转成日期
         LocalDateTime date= LocalDateTime.parse(dateStr, formatter);//放入格式 器
         //获取日
         System.out.println(date);
    }
}
