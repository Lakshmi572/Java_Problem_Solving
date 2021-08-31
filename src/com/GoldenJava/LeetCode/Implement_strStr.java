package com.GoldenJava.LeetCode;

import java.util.Scanner;

/*Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

        Clarification:

        What should we return when needle is an empty string? This is a great question to ask during an interview.

        For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Input: haystack = "hello", needle = "ll"
        Output: 2
Input: haystack = "aaaaa", needle = "bba"
        Output: -1*/
public class Implement_strStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String hay=sc.next();
        String needle=sc.next();
        int i = strStr(hay, needle);
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        if(haystack.length()<needle.length()){
            return -1;
        }
        int count=0,index=-1;
        for(int i=0;i<haystack.length();i++){
            count=0;
            if(needle.charAt(count)==haystack.charAt(i)){
                count++;
                for(int j=i+1;j<(i+needle.length()) && j<haystack.length();j++){
                    if(haystack.charAt(j)==needle.charAt(count)){
                        count++;
                    }else
                        break;
                }
                if(count==needle.length()){
                    index=i;
                    break;
                }
            }
        }
        return index>=0 ? index:-1;
    }
}
