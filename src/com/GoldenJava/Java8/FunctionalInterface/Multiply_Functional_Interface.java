package com.GoldenJava.Java8.FunctionalInterface;

public class Multiply_Functional_Interface {
    public static void main(String[] args) {
        // Multiply 2 integer numbers using functional interface
        FInterface total=(a,b) -> a*b;
        System.out.println(total.multiply(6,8));
    }

}
