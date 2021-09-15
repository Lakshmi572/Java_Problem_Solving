package com.GoldenJava.LeetCode.Sortings;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int temp=arr[i],k=i;
            for(int j=i-1;j>=0;j--){
                if(temp < arr[j]){
                    arr[j+1]=arr[j];
                    k=j;
                }
            }
            arr[k]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
