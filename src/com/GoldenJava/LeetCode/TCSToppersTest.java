package com.GoldenJava.LeetCode;
import java.util.Scanner;
public class TCSToppersTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int l=0;l<n;l++){
            arr[l]=sc.nextInt();
        }
        int k=0;
        int sum=k,i=0;
        for(;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<=0){
                sum= ++k;
                i=-1;
            }
        }
        System.out.println(k);
    }
}
