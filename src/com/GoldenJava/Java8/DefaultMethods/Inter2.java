package com.GoldenJava.Java8.DefaultMethods;

public interface Inter2 {
    default void m1(){
        System.out.println("Inter 2 default method");
    }
    void m2();
}
