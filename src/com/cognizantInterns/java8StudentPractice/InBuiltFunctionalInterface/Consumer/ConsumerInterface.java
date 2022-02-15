package com.cognizantInterns.java8StudentPractice.InBuiltFunctionalInterface.Consumer;

import java.util.function.Consumer;

public class ConsumerInterface {
    static Consumer<String> c=(a)->
    {
        System.out.println(a);
    };

    public static void main(String[] args) {
        c.accept("Vinothkumar Selvaarasan");
    }
}
