package com.GoldenJava.Java8.Limit_Skip_Methods;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,23,32,45,34,56,76,74,86,90);
//        list.forEach(System.out::println);
        //counting number of elements present in list
//        System.out.println("Count of elements : "+list.stream().count());
//        System.out.println("Count of elements : "+ (long) list.size());


          // Using Limit() methos to limit the elements
        System.out.println("Limiting to 5 elements : ");
        list.stream().limit(5).forEach(System.out::println);

        //Using skip() method to skip first N number of elements
        System.out.println("Skipping first 5 elements");
        list.stream().skip(5).forEach(System.out::println);

    }
}
