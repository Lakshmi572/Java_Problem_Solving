package com.GoldenJava.interview_Prep.medium;

//Using loops --> O(n^2)
// Print all the duplicate characters present in a string

import java.util.HashSet;
import java.util.Set;

public class PrintDupChars {
    public static void main(String[] args) {
        String s="raja aekkaa";
        char[] c=s.toCharArray();

        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    set.add(s.charAt(i));
                }
            }
        }
        for(Character l:set){
            System.out.println(l);
        }
    }
}
