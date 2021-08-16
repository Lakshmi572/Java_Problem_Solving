package com.GoldenJava.LeetCode;

import java.util.Scanner;

public class RemoveDups {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        /*for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }*/
        RemoveDups r=new RemoveDups();
        int r1 = r.removal(nums);


        for(int i=0;i<r1 ;i++){
            System.out.println(nums[i]);
        }
    }

    private int removal(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[count] != nums[i]){
                count++;
                nums[count]=nums[i];
            }
        }
        return count+1;

    }
}
