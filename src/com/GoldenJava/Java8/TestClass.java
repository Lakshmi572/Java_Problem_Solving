package com.GoldenJava.Java8;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {

//        List<Integer> list=Arrays.asList(12,14,15,13,12,15,12);
//        Set<Integer> set=new HashSet<>();
//        list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(System.out::println);

//        String str="Hi No Hello Love Hi Hi No Shh";
//        List<String> list=Arrays.asList(str.split(" "));
////        list.forEach(System.out::println);
//        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(map);


        // converting set to Tree set
        List<Integer> set= new ArrayList<>();
        set.add(9);
        set.add(8);
        set.add(7);
        set.add(4);
        set.add(3);
        set.add(10);
        set.add(1);
        set.add(8);
        set.add(7);
        set.add(10);
//        set.forEach(System.out::println);
//        TreeSet<Integer> treeSet= new TreeSet<>(set);
//        treeSet.forEach(System.out::println);
        Set<Integer> hi= new HashSet<>(set);
        hi.forEach(System.out::println);
    }
}
