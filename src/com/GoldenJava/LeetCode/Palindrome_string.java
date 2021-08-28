package com.GoldenJava.LeetCode;

import java.util.Scanner;


// Time complexity is O(n)
public class Palindrome_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String pal=sc.next();
        int n=pal.length(),count=0;
        for(int i=0,j=n-1;i<n/2 & j>=n/2;i++,j--){
            if(pal.charAt(i)!= pal.charAt(j)){
             count=-1;
             break;
            }else
                count++;
        }
        if(count == n/2){
            System.out.println("true");
        }else
            System.out.println("false");

    }
}
