package com.GoldenJava.LeetCode;

import java.util.Scanner;
public class NCQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String order=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<order.length();i++){
            for(int j=0;j<sb.length();j++){
                if(order.charAt(i)==sb.charAt(j)){
                    System.out.print(sb.charAt(j));
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
    }
}
