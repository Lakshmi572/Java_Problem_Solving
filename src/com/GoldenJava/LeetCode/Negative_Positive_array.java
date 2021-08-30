package com.GoldenJava.LeetCode;

import java.util.Scanner;

/*In a given array which contains both negative and positive values,
        We have move all the negative values to the front without changing the insertion order*/
public class Negative_Positive_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" \n After moving negatives");
        int count=0,temp=0;

        for(int i=0;i<n;i++){
//            System.out.println(i);
            if(arr[i] < 0){
                temp=arr[i];
                for(int j=i;j>count;j--){

                    arr[j]=arr[j-1];
                }
                arr[count]=temp;
                count++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print (arr[i] + " ");
        }
    }
}
