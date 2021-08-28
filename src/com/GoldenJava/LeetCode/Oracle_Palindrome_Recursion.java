package com.GoldenJava.LeetCode;

import java.util.Scanner;

public class Oracle_Palindrome_Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pal=sc.next();
//        System.out.println(pal);
        int n=pal.length()-1;
        boolean b = checkPal(pal, 0,n );
        System.out.println("Is "+ pal +" a palindrome?? : " + b);

    }

    private static boolean checkPal(String pal, int i, int i1) {
        if(i==i1)
            return true;
        if(pal.charAt(i)!= pal.charAt(i1))
            return false;
        else
            return checkPal(pal,i+1,i1-1);

    }
}
