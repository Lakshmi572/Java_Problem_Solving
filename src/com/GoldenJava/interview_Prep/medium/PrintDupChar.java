package com.GoldenJava.interview_Prep.medium;

// Using loops and Collections --> O(n)
// Print all the duplicate characters present in a string
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDupChar {
    public static void main(String[] args) {
        String s="hello world";
        char[] c=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (char value : c) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }
        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        for(Map.Entry<Character,Integer> entry:set){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }
}
