package com.GoldenJava.LeetCode;

//return the square of a number

import java.util.Scanner;
public class sqrt_69 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mySqrt = mySqrt(num);
        System.out.println(mySqrt);
    }
    public static int mySqrt(int x) {

        /*approach 1
        double s1=Math.sqrt(x);*/

        /*approach 2
        double s1=Math.pow(x,0.5);*/

        double s1=x/2;
        double temp;
        do {
            temp=s1;
            s1= (temp+(x/temp))/2;

        }while ((temp-s1)!=0);
        return (int)s1;
    }
}
