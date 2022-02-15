package com.cognizantInterns.java8StudentPractice.InBuiltFunctionalInterface;

import com.cognizantInterns.java8StudentPractice.Pojo.PojoDataClass;
import com.cognizantInterns.java8StudentPractice.Pojo.Registeration;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPojo {
    static Consumer<Registeration> regi=(r)->{
        System.out.println("Name is "+r.getName());
    };
    static Registeration registeration= PojoDataClass.getOnedata();
    public static void main(String[] args) {

        regi.accept(registeration);
    }
}
