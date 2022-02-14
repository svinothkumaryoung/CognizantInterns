package com.cognizantInterns.java8StudentPractice;

public class FunctionalInterfaceWithArg {
    static inteWithArg iwa=(a,b)->{
        System.out.println("The Value of A is "+a+" The Value of B is "+b);
    };

    public static void main(String[] args) {
        iwa.getData(10,20);
    }
}
