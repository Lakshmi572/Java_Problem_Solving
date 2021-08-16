package com.GoldenJava.LeetCode;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ReverseInteger r1=new ReverseInteger();
        System.out.println(Integer.MAX_VALUE +" "+ Integer.MIN_VALUE);
       /* int r=r1.reverse(n);
        System.out.println(r);*/
    }

    private int reverse(int x) {
        long temp=0;
        while(x!=0){
            int r=x%10;
            if(((temp == Integer.MAX_VALUE/10) && r>7) || temp >  Integer.MAX_VALUE/10){
                return 0;
            }
            if(((temp == Integer.MIN_VALUE/10) && r< -8) || temp <  Integer.MIN_VALUE/10){
                return 0;
            }
             temp=temp*10+r;
            x=x/10;
        }
        return (int)temp;
    }
}
