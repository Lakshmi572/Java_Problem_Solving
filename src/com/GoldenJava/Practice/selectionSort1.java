package com.GoldenJava.Practice;

public class selectionSort1 {
    public static void main(String[] args) {
        int[] arr={8,3,6,2,7,1,9,4,5};
        int min;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
