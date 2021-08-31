package com.GoldenJava.LeetCode;

import java.util.Scanner;

public class Search_Insert_Position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int i = searchInsert(arr, val);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        int index=-1;
        if(nums[0]>target){
            index=0;
        }
        if(nums[nums.length-1]<target){
            index= nums.length;
        }
        for(int i=0;i< nums.length;i++){
            if(nums[i]>=target){
                 index=i;
                 break;
            }
        }
        return index;
    }
}
