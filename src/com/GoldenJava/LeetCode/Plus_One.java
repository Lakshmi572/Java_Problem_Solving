package com.GoldenJava.LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Plus_One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ints = plusOne(arr);
//        System.out.println(ints.length);
        for(int i=0;i<ints.length;i++){
            System.out.print(ints[i]+" ");
        }
    }
    public static int[] plusOne(int[] digits) {
        int sum=0;
        for(int i=0;i< digits.length;i++){
            sum=sum*10+digits[i];
        }
//        System.out.println(sum);
        int sum1=sum+1;
//        System.out.println("reverse: "+ sum);
        int[] nums;
        if(Math.abs(sum1%10-sum%10)==1){
            nums=new int[digits.length];
        }else{
            nums=new int[digits.length+1];
        }
        int i= nums.length-1;
        while (sum1>0){
            int r=sum1%10;
            nums[i]=r;
            i--;
            sum1/=10;
        }

        return nums;
    }

    public static int[] plusOne1(int[] digits) {
        int sum=0;
        for(int i=0;i< digits.length;i++){
            sum=sum*10+digits[i];
        }
//        System.out.println(sum);
        int sum1=sum+1;
//        System.out.println("reverse: "+ sum);
        ArrayList<Integer> nums=new ArrayList<>();
        while (sum1>0){
            int r=sum1%10;
            nums.add(r);
            sum1/=10;
        }
        Integer[] num= new Integer[nums.size()];
        num=(Integer[])nums.toArray();
        return nums;
    }
}
