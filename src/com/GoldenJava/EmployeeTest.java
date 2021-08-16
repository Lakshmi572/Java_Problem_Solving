package com.GoldenJava;

public class EmployeeTest {

    public static void main(String[] args) {
//        System.out.println("Hello world");
        int a=10;
        int b=10;
//        System.out.println(a==b);

        Employee e1= new Employee(1,"Lakshmi");
        Employee e2= new Employee(1,"Lakshmi");
        System.out.println(e1.equals(e2));
    }
}
