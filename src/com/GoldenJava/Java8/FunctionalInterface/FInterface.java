package com.GoldenJava.Java8.FunctionalInterface;

import java.lang.FunctionalInterface;

@FunctionalInterface
public interface FInterface {
    // Functional interface should contain only one abstract method
//    @FunctionalInterface is optional to use
//    ***  static methods of interface are not visible to implemented classes  ***
//    int add(int a,int b);
    int multiply(int a, int b);

    static int subtract(int a, int b) {
        return a - b;
    }

    default int add(int a, int b) {
        return a + b;
    }
}
