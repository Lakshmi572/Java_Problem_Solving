package com.GoldenJava.Java8.FunctionalInterface;

// Multiply 2 integer numbers using functional interface

public class Multiply_Functional_Interface implements FInterface{
    public static void main(String[] args) {

        FInterface total=(a,b) -> a*b;

        Multiply_Functional_Interface anInterface = new Multiply_Functional_Interface();
        System.out.println("Calling static method of interface using interface name: "+FInterface.subtract(10,5));
//        Static methods of interface should be called using interface name only
//        System.out.println("Calling static method of interface using implemented class ref: "+ anInterface.subtract(10,5));
        System.out.println("Calling default method: "+anInterface.add(10,20));
        System.out.println("Using Lambda expression: "+total.multiply(6,8));
        System.out.println("Using normal approach: "+anInterface.multiply(10,6));

    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }
}
