package com.GoldenJava.Java8.Consumer;

import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        Consumer<String> c= s-> System.out.println("Good morning"+" "+s);
        Consumer<String> c1= s-> System.out.println("Have a great Day"+" "+s);
        Consumer<Integer> i=n-> System.out.println(2*n);

        //Consumer chaining
        Consumer<String> cc=c.andThen(c1);

        i.accept(3);
        c.accept("Chiru");
        cc.accept("John");
    }
}
