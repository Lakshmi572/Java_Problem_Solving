package com.GoldenJava.Java8.Predicate;
/*
Predicate is pre-defined functional interface, which takes an argument and returns the boolean value.
It is used for conditional checking.
Usually, it used to apply in a filter for a collection of objects.
 */

import com.GoldenJava.Java8.Entities.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicatePractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Print all the even numbers using lambda expression
        Predicate<Integer> p = i -> i % 2 == 0;
        for (Integer i : list) {
            if (p.test(i)) {
                System.out.println(i);
            }
        }

        // Collect all the even integers to other list using stream
        List<Integer> collect = list.stream().filter(p).collect(Collectors.toList());
        System.out.println("All the even numbers using streams: " + collect);

        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(1572, "Johny", 1000000, 26));
        list1.add(new Employee(1575, "Smith", 300000, 20));
        list1.add(new Employee(1613, "Anny", 1150000, 27));
        list1.add(new Employee(1554, "Vishal", 400000, 25));
        list1.add(new Employee(1568, "Jenie", 150000, 27));

        System.out.println("************ Employee whose salary > 4.5 lpa and age > 25 **********************");
//      ****** Filter emp whose age >25 and salary > 4.5 lpa  *******
//      Approach 1
        System.out.println("Approach 1");
        Stream<Employee> limit = list1.stream().filter(e -> e.getAge() > 25 && e.getSalary() > 450000).limit(2);
        limit.forEach(System.out::println);

//      Approach 2
        System.out.println("Approach 2");
        Predicate<Employee> greaterthan25 = e -> e.getAge() > 25;
        Predicate<Employee> greaterThan4lpa = e -> e.getSalary() > 450000;

        list1.stream().filter(greaterthan25.and(greaterThan4lpa)).forEach(System.out::println);



        System.out.println("************ Employee whose salary > 4.5 lpa or age > 25 **********************");
//      ****** Filter emp whose age >25 or salary > 4.5 lpa *******
        //      Approach 1
        System.out.println("Approach 1");
        list1.stream().filter(e -> e.getAge() > 25 || e.getSalary() > 450000).forEach(System.out::println);


//      Approach 2
        System.out.println("Approach 2");
        list1.stream().filter(greaterthan25.or(greaterThan4lpa)).forEach(System.out::println);


        System.out.println("************ Employee whose salary < 4.5 lpa  **********************");
        list1.stream().filter(greaterThan4lpa.negate()).forEach(System.out::println);

    }
}
