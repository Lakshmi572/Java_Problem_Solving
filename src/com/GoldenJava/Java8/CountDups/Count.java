package com.GoldenJava.Java8.CountDups;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {
        //Count the number of duplicate elements and print print using stream operations...
        List<Integer> val=new ArrayList<>();
        val.add(10);val.add(34);val.add(10);val.add(45);val.add(34);val.add(45);val.add(45);
        //method reference
        val.forEach(System.out::println);
        Set<Integer> dupes=new HashSet<>();

        System.out.println("after filtering.....");
        val.stream().filter(x -> !dupes.add(x)).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
