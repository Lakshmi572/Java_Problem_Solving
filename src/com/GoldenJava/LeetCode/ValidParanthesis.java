package com.GoldenJava.LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidParanthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        ValidParanthesis par= new ValidParanthesis();
        boolean valid = par.valid(s);
        System.out.println(valid);
    }

    private boolean valid(String s) {
        int count=0;
        StringBuffer st=new StringBuffer();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case ')' -> {
                    if(!st.isEmpty() && st.charAt(count-1) =='('){
                        st.deleteCharAt(count-1);
                        count--;
                    }else{
                        return false;
                    }
                }
                case ']' -> {
                    if(!st.isEmpty() && st.charAt(count-1) =='['){
                        st.deleteCharAt(count-1);
                        count--;
                    }else{
                        return false;
                    }
                }
                case '}' -> {
                    if(!st.isEmpty() && st.charAt(count-1) =='{'){
                        st.deleteCharAt(count-1);
                        count--;
                    }else{
                        return false;
                    }
                }default -> {
                    st.append(s.charAt(i));
                    count++;
                }
            }
        }
        return st.isEmpty();
    }
}
