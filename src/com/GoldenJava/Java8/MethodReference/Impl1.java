package com.GoldenJava.Java8.MethodReference;
/*
The only one thing we have to check for method reference is the arguments lis type should be same.
It does not care about modifiers and return types
 */
public class Impl1 {

    public static void print1() {
        System.out.println("Implementation class one");
    }
    public static int getNumber(){
        return (int)(Math.random()*10);
    }

    public static void main(String[] args) {
        //Using predefined Functional interface i.e., Runnable interface
        System.out.println("Using lambda approach");
        Runnable f= ()-> System.out.println("lambda expression");
        f.run();


        System.out.println("Using method reference approach");
        Runnable f1=Impl1::print1;
        f1.run();

        System.out.println("getNumber() and run() methods return types are different");
        Runnable num=Impl1::getNumber;
        num.run();
    }

}
