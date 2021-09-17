package com.GoldenJava.interview_Prep.medium;

public class StringBufferRev_recursion {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Lakshmi");
        rev(s,0,s.length()-1);
        System.out.println(s);
    }

    private static void rev(StringBuffer s, int l, int r) {
        if(l==r){
            return;
        }else{
            char c=s.charAt(l);
            s.setCharAt(l,s.charAt(r));
            s.setCharAt(r,c);
            rev(s,l+1,r-1);
        }

    }
}
