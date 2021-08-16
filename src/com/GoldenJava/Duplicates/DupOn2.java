package com.GoldenJava.Duplicates;

import java.util.Scanner;

public class DupOn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        DupOn2 dup=new DupOn2();
        boolean isDup=dup.duplicate(arr);
        System.out.println("Do we have any duplicates?? :: "+isDup);
    }

    private boolean duplicate(int[] arr) {
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
