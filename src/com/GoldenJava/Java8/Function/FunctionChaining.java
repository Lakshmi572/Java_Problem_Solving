package com.GoldenJava.Java8.Function;

import java.util.function.Function;

/*
f1.andThen(f2) -> first f1 will be executed then f2 will be executed
f1.compose(f2) -> first f2 will be executed then f11 will be executed
 */
public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> 2 * i;
        Function<Integer, Integer> f2 = i -> i * i * i;
        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f1.compose(f2).apply(2));

        System.out.println(f1.compose(f2).andThen(f2).apply(2));
        System.out.println(f1.andThen(f2).andThen(f2).apply(2));
        System.out.println(f1.compose(f2).compose(f2).apply(2));
    }
}
