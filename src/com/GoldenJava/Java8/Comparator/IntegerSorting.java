package com.GoldenJava.Java8.Comparator;

import com.GoldenJava.Java8.FunctionalInterface.FInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IntegerSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(30);
        list.add(15);
        list.add(45);
        list.add(25);
        list.add(5);
        list.add(50);
        list.add(70);
        Comparator<Integer> ascending = Integer::compareTo;
        list.sort(ascending);
        System.out.println(list);
        Comparator<Integer> descending = (i1,i2)->i2.compareTo(i1);
        list.sort(descending);
        System.out.println(list);
    }
}
