package com.GoldenJava.LeetCode;

import java.util.Scanner;
public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] num1={4,0,0,0,0,0};
        int[] num2={1,2,3,5,6};
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        merge1(num1,m,num2,n);
        for (int s:num1){
            System.out.println(s);
        }
    }

    private static void merge(int[] num1, int m, int[] num2, int n) {
        int[] dup=new int[m];
        for(int i=0;i<m;i++){
            dup[i]=num1[i];
        }
        int l=0,i=0,j=0;
        while(i<m && j< n){
            if(dup[i]<=num2[j]){
                num1[l]=dup[i];
                i++;
            }else{
                num1[l]=num2[j];
                j++;
            }
            l++;
        }
        while(i<m){
            num1[l]=dup[i];
            i++;
            l++;
        }
        while(j<n){
            num1[l]=num2[j];
            j++;
            l++;
        }
        for (int s:num1){
            System.out.println(s);
        }
    }
    public static void merge1(int[] nums1, int m, int[] nums2, int n){
        int length=m-- + n--;
        for(int i=length-1 ;i>-1;i--){
            if(n<0){
                nums1[i]=nums1[m--];
            } else if(m<0){
                nums1[i]=nums2[n--];
            }else if(nums1[m]>=nums2[n]){
                nums1[i]=nums1[m--];
            }else {
                nums1[i]=nums2[n--];
            }
        }
    }
}
