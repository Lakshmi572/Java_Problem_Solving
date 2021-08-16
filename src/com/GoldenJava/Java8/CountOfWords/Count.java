package com.GoldenJava.Java8.CountOfWords;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {
        // Count the occurrence of words in string array
        String str="Hello Hi Welcome Hi Hello Sorry Good Luck Luck Welcome";

        List<String> list= Arrays.asList(str.split(" "));
//        list.forEach(System.out::println);
        Map<String,Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

    }
}
