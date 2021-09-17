package com.GoldenJava.Practice;

public class insertionSort1 {
    public static void main(String[] args) {
        int[] arr={8,3,6,2,7,1,9,4,5};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i],k=i;
            for(int j=i-1;j>=0;j--){
                if(temp<arr[j]){
                    arr[j+1]=arr[j];
                    k=j;
                }
            }
            arr[k]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
