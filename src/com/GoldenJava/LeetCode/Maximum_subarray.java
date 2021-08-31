package com.GoldenJava.LeetCode;

import java.util.Scanner;

public class Maximum_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = maxSubArray(arr);
        System.out.println(max);
    }

    public static int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=max;
        for(int i=1;i< nums.length;i++){
            sum+=nums[i];
            if(sum<nums[i]){
                sum=nums[i];
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}

