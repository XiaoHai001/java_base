package com.shsxt.demo.night;

public class Test03 {
    public static void main(String[] args) {
        System.out.println(test(10));
    }
    public static int  test(int x){
        if (x>0){
            int sum = x + test(x - 1);
            System.out.print(x);
            if (x==10){
                System.out.print("=");
            }else{
                System.out.print("+");
            }
            return sum;
        }
        return 0;
    }
}
