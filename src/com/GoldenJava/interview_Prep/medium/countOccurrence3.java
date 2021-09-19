package com.GoldenJava.interview_Prep.medium;

//Using loops and collections --> O(n)
// Print all the non-repetitive characters including digits also

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class countOccurrence3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        char[] chars = str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:chars){
            boolean alphabetic = Character.isAlphabetic(c);
            boolean digit = Character.isDigit(c);
            boolean b = map.containsKey(c);
            if(alphabetic || digit){
                if(b){
                    map.put(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                }
            }
        }
        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        for(Map.Entry<Character,Integer> s:set){
            if(s.getValue()==1){
                System.out.println(s.getKey()+": "+s.getValue());
            }
        }
    }
}
