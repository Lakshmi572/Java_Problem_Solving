package com.GoldenJava.LeetCode.Sortings;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={8,3,6,2,7,1,9,4,5};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
