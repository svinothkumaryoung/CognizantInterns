package com.cognizantInterns.java8StudentPractice.InBuiltFunctionalInterface.Stream;


import com.cognizantInterns.java8StudentPractice.Pojo.PojoDataClass;
import com.cognizantInterns.java8StudentPractice.Pojo.Registeration;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamData {
static List<Registeration> regi= PojoDataClass.getAlldata();
static Predicate<Registeration> r1=(r)->r.getRegisterNo()>=203;
static Predicate<Registeration> r2=(rr)->rr.getCity().equals("Texas");

    public static void main(String[] args) {
        List<Registeration> r=regi.stream()
                .peek(rrr->System.out.println(rrr+"\n\n"))
                .filter(r1)
                .peek(rrr1->System.out.println(rrr1+"\n\n"))
                .filter(r2)
                .collect(Collectors.toList());
        System.out.println(r);
    }
 }
