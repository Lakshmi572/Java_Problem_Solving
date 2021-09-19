package com.GoldenJava.interview_Prep.medium;
// Using java 8 streams
// Find the occurrence of a given character in the string
import java.util.Scanner;

public class countOccurrence4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char search='l';
        long count = str.chars().filter(ch -> ch == search).count();
        System.out.println(count);
    }
}
