/*
package com.GoldenJava.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DataStructures {
//     ArrayList<Integer> arr=new ArrayList<>();
    static int[] arr;
    static int i =0;
    public static void main(String[] args) {

        Map map1=new HashMap();
        map1.


        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        insert(x);
    }
    public static void insert(int x){
        if(arr.length > i) {
            arr[i] = x;
            i++;
        }else{
            int[] arr1=new int[arr.length*2];
            for(int i=0;i<arr.length;i++){
                arr1[i]=arr[i];
            }
            arr=arr1;
        }
    }
    public static int remove(){
        int n= (int) Math.random();

        int x= arr[n];
        for(int i=n;i< arr.length-1;i++){
            arr[i]=arr[i+1];
        }


        return 0;
    }
}


*/
