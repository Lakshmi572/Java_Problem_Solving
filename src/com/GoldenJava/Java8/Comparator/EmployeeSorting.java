package com.GoldenJava.Java8.Comparator;

import com.GoldenJava.Java8.Entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(151, "Lakshmi", 100000f));
        list.add(new Employee(112, "Sreeja", 300000f));
        list.add(new Employee(103, "Chinmayi", 150000f));
        list.add(new Employee(175, "Aamani", 10000f));
        System.out.println(list);
        System.out.println("************* Sorting by Employee id *******************");
        list.sort((e1, e2) -> e1.getId().compareTo(e2.getId()));
        System.out.println(list);
        System.out.println("************* Sorting by Employee name *******************");
        list.sort((e1, e2) -> e2.getName().compareTo(e1.getName()));
        System.out.println(list);
    }
}
