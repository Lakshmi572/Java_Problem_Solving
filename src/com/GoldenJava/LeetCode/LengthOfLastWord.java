package com.GoldenJava.LeetCode;


import java.util.Scanner;
import java.util.StringTokenizer;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
//        System.out.println(s);

        int lastWord = lengthOfLastWord(s);
        System.out.println(lastWord);

    }

    public static int lengthOfLastWord(String s) {
        StringTokenizer st=new StringTokenizer(s," ");
        int n=st.countTokens(),i=0;
        String[] str=new String[n];
        while (st.hasMoreTokens()){
            str[i]=st.nextToken();
            i++;
        }
        /*for (String sm:
             str) {
            System.out.println("token: "+sm);
        }*/

        return str[n-1].length();
    }
}
