package com.GoldenJava.LeetCode;

import java.util.Scanner;

/*
Input: nums = [0,1,2,2,3,0,4,2], val = 2
        Output: 5, nums = [0,1,4,0,3,_,_,_]
        Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
        Note that the five elements can be returned in any order.
        It does not matter what you leave beyond the returned k (hence they are underscores).
*/

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int i = removeElement(arr, val);
        for(int j=0;j<i;j++){
            System.out.print(arr[j] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
//            System.out.println(nums[count]);
           /* if(nums[i]==val && (i+1)< n){
                nums[count]=nums[i+1];
            }else{
                i++;
                count++;
            }*/

            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }

        }
//        System.out.println(count);
        return count;
    }
}
