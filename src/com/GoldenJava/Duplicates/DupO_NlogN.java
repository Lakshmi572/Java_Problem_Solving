package com.GoldenJava.Duplicates;

import java.util.Scanner;

public class DupO_NlogN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        DupO_NlogN dup=new DupO_NlogN();
        dup.sort(arr);
        System.out.println("Do we have duplicates?? " + dup.isDup(arr));
    }

    private boolean isDup(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }

    private void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
}
