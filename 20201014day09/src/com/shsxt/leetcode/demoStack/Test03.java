package com.shsxt.leetcode.demoStack;

public class Test03 {
    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 1, 2, 3,2, 2};
        int tem = 1;
        int sum = A[0];
        for (int i = 1; i < A.length; i++) {
            if (tem == 0) {
                sum = A[i];
                tem = 1;
            }
            if (A[i] == sum) tem++;
            else  tem--;
        }
        System.out.println(sum);
    }
}
