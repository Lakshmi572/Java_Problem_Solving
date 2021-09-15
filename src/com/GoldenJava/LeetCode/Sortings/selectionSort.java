package com.GoldenJava.LeetCode.Sortings;

import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(int i=0;i<n;i++){
            k=i;
            for(int j=i+1;j<n;j++){
                if(arr[k] > arr[j]){
                    k=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
