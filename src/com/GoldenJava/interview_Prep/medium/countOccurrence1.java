package com.GoldenJava.interview_Prep.medium;
//Using Loop --> O(n)
// print occurrence of a given character in string using loops
import java.util.Scanner;
public class countOccurrence1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        String c=sc.next();
        c=c.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(c.charAt(0)==s.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
