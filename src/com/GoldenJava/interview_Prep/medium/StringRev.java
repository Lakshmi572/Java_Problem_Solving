package com.GoldenJava.interview_Prep.medium;

public class StringRev {
    public static void main(String[] args) {
        String s="Doppani";
        int n=s.length();
//        char[] c=s.toCharArray();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
