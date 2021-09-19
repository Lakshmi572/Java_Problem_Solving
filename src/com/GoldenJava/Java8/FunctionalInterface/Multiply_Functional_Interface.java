package com.GoldenJava.Java8.FunctionalInterface;

// Multiply 2 integer numbers using functional interface

public class Multiply_Functional_Interface {
    public static void main(String[] args) {

        FInterface total=(a,b) -> a*b;
        System.out.println(total.multiply(6,8));
    }

}
