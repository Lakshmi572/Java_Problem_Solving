package com.GoldenJava.LeetCode;

import java.util.Scanner;
public class NCQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[10000];
        int count=0;
        if(n>=10 && n<=1000000){
            while(n!=0){
                int r=n%10;
                if(r>=2){
                    arr[count]=(int)Math.pow(r,2);
                }else{
                    arr[count]=r;
                }
                n=n/10;
                count++;
            }
            for(int i= 0;;i++){
                if(arr[i]!=0)
                    System.out.print(arr[i]);
                else
                    break;
            }
        }else{
            System.out.println("Wrong input");
        }
    }
}
