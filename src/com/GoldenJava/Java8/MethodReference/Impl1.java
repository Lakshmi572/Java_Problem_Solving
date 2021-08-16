package com.GoldenJava.Java8.MethodReference;

public class Impl1 {

    public static void print1() {
        System.out.println("Implementation class one");
    }


    public static void main(String[] args) {
        //Using predefined Functional interface i.e., Runnable interface
        System.out.println("Using lambda approach");
        Runnable f= ()-> System.out.println("lambda expression");
        f.run();


        System.out.println("Using method reference approach");
        Runnable f1=Impl1::print1;
        f1.run();
    }

}
