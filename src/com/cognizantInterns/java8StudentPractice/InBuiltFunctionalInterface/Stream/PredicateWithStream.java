package com.cognizantInterns.java8StudentPractice.InBuiltFunctionalInterface.Stream;


import com.cognizantInterns.java8StudentPractice.Pojo.PojoDataClass;
import com.cognizantInterns.java8StudentPractice.Pojo.Registeration;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateWithStream {
    static List<Registeration> registeration= PojoDataClass.getAlldata();
    static Predicate<Registeration> p=(regi)->regi.getRegisterNo()>=201;

    public static void main(String[] args) {
        List<Registeration> r1=  registeration.stream()
                .filter(p)
                .collect(Collectors.toList());
        System.out.println(r1);
    }


}
//Optional (Java 8)
//Threads
//Finish all the Handson
