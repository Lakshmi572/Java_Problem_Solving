package com.GoldenJava.LeetCode;

/*Merge Intervals
        Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
        and return an array of the non-overlapping intervals that cover all the intervals in the input.

        Example 1:

        Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]
        Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
        Example 2:

        Input: intervals = [[1,4],[4,5]]
        Output: [[1,5]]
        Explanation: Intervals [1,4] and [4,5] are considered overlapping.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class one {
    public static void main(String[] args) {
       int temp=-1234;
       int sum=0,flag=0;
       if(temp<0){
           flag=1;
           temp=temp*-1;
       }
       while(temp!=0){
           int r=temp%10;
           sum=sum*10+r;
           temp=temp/10;
       }

       if(flag==1){
           System.out.println(sum*-1);
       }else{
           System.out.println(sum);
       }
    }
}
