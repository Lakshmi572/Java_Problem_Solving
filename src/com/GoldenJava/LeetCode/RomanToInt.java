package com.GoldenJava.LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RomanToInt {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
//        System.out.println(s);
        RomanToInt r=new RomanToInt();
        int num=r.Roman(s);
        System.out.println(num);
    }

    private int Roman(String s) {
        int num=0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)) {
                case 'I' -> {
                    if (i+1<s.length() && s.charAt(i + 1) == 'V') {
                        num = num + 3;
                        i++;
                    }
                    if (i+1<s.length() && s.charAt(i + 1) == 'X') {
                        num = num + 8;
                        i++;
                    }
                    num = num + 1;
                }
                case 'V' -> num = num + 5;
                case 'X' -> {
                    if (i+1<s.length() && s.charAt(i + 1) == 'L') {
                        num = num + 30;
                        i++;
                    }
                    if (i+1<s.length() && s.charAt(i + 1) == 'C') {
                        num = num + 80;
                        i++;
                    }
                    num = num + 10;
                }
                case 'L' -> num = num + 50;
                case 'C' -> {
                    if (i+1<s.length() && s.charAt(i + 1) == 'D') {
                        num = num + 300;
                        i++;
                    }
                    if (i+1<s.length() && s.charAt(i + 1) == 'M') {
                        num = num + 800;
                        i++;
                    }
                    num = num + 100;
                }
                case 'D' -> num = num + 500;
                case 'M' -> num = num + 1000;
            }
        }
        return num;
    }

}
