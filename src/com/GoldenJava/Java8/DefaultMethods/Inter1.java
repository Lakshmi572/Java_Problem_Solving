package com.GoldenJava.Java8.DefaultMethods;

@FunctionalInterface
public interface Inter1 {
    default void m1(){
        System.out.println("Inter1 default method");
    }
    void m2();
}
