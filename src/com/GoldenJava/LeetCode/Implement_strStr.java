package com.GoldenJava.LeetCode;

import java.util.Scanner;

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
