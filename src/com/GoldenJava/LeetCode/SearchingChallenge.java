package com.GoldenJava.LeetCode;

import java.util.Scanner;
// Program to return  a longest sub string which repeats more than 2 times
public class SearchingChallenge {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        String last="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String check=SearchingChallenge(str.substring(i,n),str.substring(j,n));
                if(check.length() > last.length()){
                    last=check;
                }
            }
        }
        if(last.length()>1){
            System.out.println("yes "+last);
        }else{
            System.out.println("no");
        }
    }

    private static String SearchingChallenge(String s, String t) {
        int min=Math.min(s.length(),t.length());
        for(int i=0;i<min;i++){
            if(s.charAt(i)!=t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,min);
    }
}
