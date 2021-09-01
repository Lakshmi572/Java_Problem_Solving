package com.GoldenJava.LeetCode;

import java.util.Scanner;

public class Add_Binary_67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        String b=sc.next();
        String s = addBinary(a, b);
        System.out.println(s);
    }

    public static String addBinary(String a, String b) {

        StringBuilder ab=new StringBuilder();
        int carry=0;
        for(int i=a.length()-1,j=a.length()-1;i>=0 & j>=0;i--,j--){
            if(a.charAt(i)!=b.charAt(j)){
                if(carry==1){
                    ab.append('0');
                    carry=0;
                }else{
                    ab.append('1');
                }

            }else if(a.charAt(i)=='1' && b.charAt(j)=='1'){
                if(carry==1){
                    ab.append('1');

                }else{
                    ab.append('0');
                }
                carry=1;
            }else{
                if(carry==1){
                    ab.append('1');
                    carry=0;
                }else{
                    ab.append('0');
                }
            }
        }
        if(carry==1){
            ab.append('1');
        }

        return ab.reverse().toString();
    }
}
