package com.GoldenJava.Java8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
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
class Employee {
    private Integer id;
    private String name;
    private float salary;

    public Employee() {
    }

    public Employee(Integer id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
