package com.GoldenJava.Java8.Supplier;

import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {
        Supplier<Integer> i=()->(int)(Math.random()*1000000);
        System.out.println(i.get());
    }
}
