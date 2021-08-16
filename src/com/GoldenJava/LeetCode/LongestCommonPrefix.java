package com.GoldenJava.LeetCode;

import java.util.Scanner;

class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        LongestCommonPrefix lc=new LongestCommonPrefix();

        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }

        String s1 = lc.find(s);
        System.out.println(s1);
    }

    private String find(String[] s) {
        if(s.length ==1){
            return s[0];
        }
        if(s.length == 0){
            return "";
        }
        String one=s[0];
        StringBuffer fin=new StringBuffer();
        for(int i=1;i<s.length ;i++){
            for(int j=0;j<s[i].length() && j<one.length();j++){
                if(i==1) {
                    if (s[i].charAt(j) == one.charAt(j)) {
                        fin.append(s[i].charAt(j));
//                        System.out.println(fin.charAt(j));
                    }else{
                        break;
                    }
                }else{
                    if(j<fin.length()  && fin.charAt(j) != s[i].charAt(j)){
                        fin.delete(j,fin.length());
                    }
                }
            }
        }
        return fin.toString();
    }
}
