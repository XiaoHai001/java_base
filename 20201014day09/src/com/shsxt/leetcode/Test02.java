package com.shsxt.leetcode;

public class Test02 {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        for (int i = 0; i < gas.length; i++) {
            int sum=0;
            if (gas[i]+sum>=cost[i]){  //能起步的地方
                for (int j = i+1; j < gas.length; j++) {//能否到头
                    sum+=gas[i]-cost[i];
                }


            }
        }
        return 0;
    }
}
