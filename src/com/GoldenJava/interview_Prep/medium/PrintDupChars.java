package com.GoldenJava.interview_Prep.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDupChars {
    public static void main(String[] args) {
        String s="rajasekhar aekaa";
        char[] c=s.toCharArray();
       /* Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<c.length;i++){
            if(!map.containsKey(c[i])){
                map.put(c[i],1);
            }else{
                map.put
            }
        }*/

        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    set.add(s.charAt(i));
                }
            }
        }
        for(Character l:set){
            System.out.println(l);
        }
    }
}
