package com.GoldenJava.interview_Prep.medium;
// Using inBuilt methods
// check whether both given strings having same set of characters
import java.util.Arrays;

public class isAnagram2 {
    public static void main(String[] args) {
        String s="poTs";
        String s1="topS";
        s=s.toLowerCase();
        s1=s1.toLowerCase();
        char[] c=s.toCharArray();
        char[] c1=s1.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        boolean equals = Arrays.equals(c, c1);
        System.out.println(equals);
    }
}