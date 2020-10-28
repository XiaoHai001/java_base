package com.shsxt.leetcode;

public class Test01 {
    public static void main(String[] args) {

    }
    public int rob(int[] nums) {
        if (nums.length==0)return 0;
        int len=nums.length;
        int []sum=new int[len];

        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        sum[0]=nums[0];
        sum[1]=Math.max(nums[0],nums[1]);
        for (int i=2;i<len;i++){
            sum[i]=Math.max(sum[i-1],sum[i-2]+nums[i]);
        }
        return sum[len-1];
    }
}
