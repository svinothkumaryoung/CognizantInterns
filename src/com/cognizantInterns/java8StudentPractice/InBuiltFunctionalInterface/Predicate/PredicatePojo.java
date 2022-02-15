package com.cognizantInterns.java8StudentPractice.InBuiltFunctionalInterface.Predicate;

import com.cognizantInterns.java8StudentPractice.Pojo.PojoDataClass;
import com.cognizantInterns.java8StudentPractice.Pojo.Registeration;

import java.util.function.Predicate;

public class PredicatePojo {
    static Predicate<Registeration> p1 = (r) -> r.getRegisterNo() > 203;
    static Registeration registeration= PojoDataClass.getOnedata();
    public static void main(String[] args) {

        System.out.println("Registeration No is greater than 203 "+ p1.test(registeration));


    }

}