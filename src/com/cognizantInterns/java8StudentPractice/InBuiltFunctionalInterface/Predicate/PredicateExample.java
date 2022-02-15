package com.cognizantInterns.java8StudentPractice.InBuiltFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predi=(a)-> a>=100;
    public static void main(String[] args) {
        System.out.println(predi.test(100));
    }
}
