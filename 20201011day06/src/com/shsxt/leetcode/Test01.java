package com.shsxt.leetcode;

public class Test01 {
    public int[] divingBoard(int shorter, int longer, int k) {
        int temp = longer - shorter;
        int[] A = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {
            A[i]=k*shorter+i*temp;
        }
        return A;
    }
}
