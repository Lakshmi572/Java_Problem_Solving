package com.GoldenJava.interview_Prep.medium;

public class stringPermutations {
    public static void main(String[] args) {
        String s="adp";
        permutation(s,"");
    }
    public static void permutation(String s, String ans){
        if(s.length()==0){
            System.out.println(ans +" ");
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String r=s.substring(0,i)+s.substring(i+1);
            permutation(r,ans+ch);
        }
    }
}