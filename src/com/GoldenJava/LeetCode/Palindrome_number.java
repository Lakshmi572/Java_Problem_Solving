package com.GoldenJava.LeetCode;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Palindrome_number p=new Palindrome_number();
        boolean b=p.pal(n);
        System.out.println(b);
    }

    private boolean pal(int x) {
        if(x<0){
            return false;
        }
        int temp=0,or=x;
        while(x!=0){
            int r=x%10;
            temp=temp*10+r;
            x=x/10;
        }
        return or == temp;
    }
}
