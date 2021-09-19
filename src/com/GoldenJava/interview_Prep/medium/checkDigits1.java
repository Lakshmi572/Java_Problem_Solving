package com.GoldenJava.interview_Prep.medium;
//Using loops
// Check whether given array of numbers are numbers without having special characters
public class checkDigits1 {
    public static void main(String[] args) {
        String[] arr= {"123", "-123" , "123.12", "abcd123"};
        for(String a: arr){
            int count=0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)<='9' && a.charAt(i)>='0'){
                    count++;
                }else{
                    System.out.println(a+" is not a number");
                    break;
                }
            }
            if(count==a.length()){
                System.out.println(a+" is a number");
            }
        }
    }
}
