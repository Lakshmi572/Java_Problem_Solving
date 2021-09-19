package com.GoldenJava.interview_Prep.medium;
// Using Loops
// check whether both given strings having same set of characters
public class isAnagram1 {
    public static void main(String[] args) {
         String s="sTop";
         String s1="Pots";
        boolean check = check(s, s1);
        System.out.println("Is it anagram? "+ check);
    }

    private static boolean check(String s, String s1) {
        s=s.toLowerCase();
        s1=s1.toLowerCase();
        if(s.length()!=s1.length()){
            return false;
        }
        char[] c=s.toCharArray();
        StringBuilder sb=new StringBuilder(s1);
        for(char ch: c){
            int i = sb.indexOf(String.valueOf(ch));
//            System.out.println(i);
            if(i!=-1){
                sb.deleteCharAt(i);
            }else{
                return false;
            }
        }
        return sb.length() == 0;
    }
}
