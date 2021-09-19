package com.GoldenJava.interview_Prep.medium;

public class vowelCount {
    public static void main(String[] args) {
        String s="hello world";
        int count=0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        System.out.println(count);
    }
}
