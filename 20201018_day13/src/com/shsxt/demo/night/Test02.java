package com.shsxt.demo.night;


public class Test02 {
    public static void main(String[] args) {
        int s = sum1(10);
        System.out.println(s);
        s = sum(10);
        System.out.println(s);
        System.out.println(sum2(1, 10));

    }

    // 汉诺塔

    public static int sum2(int min, int max){
        if(min<=max){
            return min+sum2(min+1, max);
        }
        return 0;
    }


    public static int sum1(int num){
        if(num>0){
            // 需要使用一个临时变量   接收得到的结果
            int temp = num + sum1(num-1);
            System.out.print(num);
            if(num!=10){
                System.out.print("+");
            }else{
                System.out.print("=");
            }
            return temp;
        }
        return 0;
    }


    // 递归实现 1，10累加求和
    // 1+2+3+4+5+6+7+8+9+10=55
    //
    public static int sum(int num){
        // 如果num值大于0， 调用自己并且累加
        if(num>0){
            System.out.print(num);
            if(num!=1){
                System.out.print("+");
            }else{
                System.out.print("=");
            }

            return num+sum(num-1);
        }else{
            return 0;
        }

    }
}
