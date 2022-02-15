package com.cognizantInterns.java8StudentPractice.InBuiltFunctionalInterface.Consumer;

import java.util.function.Consumer;

public class ConsumerAndThen {
    static Consumer<String> c1=(a)->{
        System.out.println("The Value Recieved is "+a);
    };
    static Consumer<String> c2=(b)->{
        System.out.println("The Value Recieved is "+b);
    };

    public static void main(String[] args) {
        //c1.accept("Vinothkumar ");
        //c2.accept("Vinothkumar");
        c1.andThen(c2).accept("Vinothkumar");
    }
}
