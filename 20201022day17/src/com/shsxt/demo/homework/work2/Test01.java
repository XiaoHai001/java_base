package com.shsxt.demo.homework.work2;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws Exception {
        //SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("请输入日期（yyyy/MM/dd）：");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String dateStr = reader.readLine();
        String[] split = dateStr.split("/");

        int year=Integer.parseInt(split[0]);
        int month=Integer.parseInt(split[1]);
        int day=Integer.parseInt(split[2]);
        int sum = getDay(month, year);
        sum+=day;
        System.out.println("是这一年的第"+sum+"天");

    }
    public static int getDay(int month,int year) throws Exception {
        int count=0;
        switch (month-1){
            //过的整月月份天数
            case 11:
                count+=30;
            case 10:
                count+=31;
            case 9:
                count+=30;
            case 8:
                count+=31;
            case 7:
                count+=31;
            case 6:
                count+=30;
            case 5:
                count+=31;
            case 4:
                count+=30;
            case 3:
                count+=31;
            case 2:
                if (year%4==0&&year%100!=0){
                    count+=29;
                }else{
                    count+=28;
                }
            case 1:
                count+=31;
                break;
            default:
                throw new Exception("数据错误");
        }
        return count;
    }
}
