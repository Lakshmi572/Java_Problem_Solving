package com.GoldenJava.interview_Prep.medium;
// Using Loops- StringBuilder -->O(n^2)
//How to find First Non-Repeated Character from String?

import java.util.Scanner;
public class non_repeatChar1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char aChar = findChar(s);
        System.out.println(aChar);
    }

    private static char findChar(String s) {
        if(s.length()==0){
            return ' ';
        }
        if(s.length()==1){
            return s.charAt(0);
        }
        StringBuilder sb=new StringBuilder(s);
        for (int i=0;i<sb.length();i++){
            int flag=0;
            for(int j=i+1;j<sb.length();j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(j);
                    j--;
                    flag=1;
                }
            }
            if(flag==1){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.length()!=0?sb.charAt(0):' ';
    }
}
