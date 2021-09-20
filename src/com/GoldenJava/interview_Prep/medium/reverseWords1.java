package com.GoldenJava.interview_Prep.medium;
//How to Reverse words in String Java?   --> O(n)

import java.util.Scanner;
public class reverseWords1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        String[] strings = s.split(" ");
        for(int i=strings.length-1;i>=0;i--){
            sb.append(strings[i]).append(" ");
        }
        sb.trimToSize();
        System.out.println(sb);
    }
}
