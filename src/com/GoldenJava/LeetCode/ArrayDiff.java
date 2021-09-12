package com.GoldenJava.LeetCode;

/*Given an array with positive integers you have copy the difference of adjacent integers into the same array until there is
only one number and return that last number*/

import java.util.Scanner;
public class ArrayDiff {
    static int len;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        len=s.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=s.nextInt();
        }
        int last=ArrayChallenge(arr);
        System.out.println(last);
    }

    private static int ArrayChallenge(int[] arr) {
        if(len==1){
            return arr[0];
        }else{
            for(int i=1;i<len;i++){
                arr[i-1]= Math.abs(arr[i]-arr[i-1]);
            }
            len--;
            return  ArrayChallenge(arr);
        }
    }
}
