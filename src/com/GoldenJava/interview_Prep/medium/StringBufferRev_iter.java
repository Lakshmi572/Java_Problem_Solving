package com.GoldenJava.interview_Prep.medium;

public class StringBufferRev_iter {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Lakshmi Doppani") ;
        int n=s.length();
        System.out.println(s.capacity()+" "+s);
        for(int i=0,j=n-1;i<=n/2 && j>n/2;i++,j--){
            char temp=s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
        }
        System.out.println(s);
    }
}
