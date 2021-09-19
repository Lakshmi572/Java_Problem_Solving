package com.GoldenJava.interview_Prep.medium;
// Using Hashing technique --> O{n)
// print occurrence of each character present in  string
import java.util.Scanner;
public class countOccurrence2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str = str.toLowerCase();
        int[] c=new int[26];
        for(int i=0;i<str.length();i++){
            c[str.charAt(i)-97]++;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]>0){
                System.out.println((char)(i+97)+" "+c[i]);
            }
        }
    }
}
