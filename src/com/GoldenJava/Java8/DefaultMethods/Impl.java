package com.GoldenJava.Java8.DefaultMethods;

public class Impl implements Inter1,Inter2{
    @Override
    public void m2() {
        System.out.println("Implementation method");
    }

    // **** Default methods ambiguity can be resolved like this ****
    @Override
    public void m1() {
        Inter2.super.m1();
    }

    public static void main(String[] args) {
        Impl imp=new Impl();
        imp.m2();
        imp.m1();
    }
}
