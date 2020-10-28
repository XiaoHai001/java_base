package com.shsxt.leetcode;

public class Test03 {
    public static void main(String[] args) {
        System.out.println(fib(44));
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            a=a+b;
            b=a-b;
            a=a%1000000007;
        }
        return a;
    }
}
