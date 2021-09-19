package com.GoldenJava.interview_Prep.medium;

// Using Loops- StringBuilder -->O(n)
//How to find First Non-Repeated Character from String?

import java.util.*;

public class non_repeatChar2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char nonRepeatChar = findNonRepeatChar(s);
        System.out.println(nonRepeatChar);
    }
    private static char findNonRepeatChar(String s) {
        if(s.length()==0){
            return ' ';
        }
        char[] chars = s.toCharArray();
        Map<Character, Integer> map=new LinkedHashMap<>();
        for(Character c:chars){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        char ch = 0;
        int flag=0;
        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        for(Map.Entry<Character,Integer> k:set){
            if(k.getValue()==1){
                ch=k.getKey();
                flag=1;
            }
            if(flag==1){
                break;
            }
        }
        return ch!='\0'?ch:' ';
    }
}
