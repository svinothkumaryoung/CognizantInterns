package com.cognizantInterns.abstractionImple;
/*
If u declare any method as abstract u have to make class also as abstract.
Abstract method body define only in the sub class.
Abstract class can have both abstract and non abstract method.
Cann't create object for abstract class
 */
abstract class abstractData{
    abstractData()
    {
        System.out.println("Hi i am a constructor");
    }
    abstract void getUserInfo();
    void printData()
    {
        System.out.println("Hai Welcome to Computer Science and Engineering");
    }

}
public class AbstractClassPgm extends abstractData  {
    void getUserInfo()
    {
    System.out.println("Hi i am a abstract class method define in the child class");
    }
    void printData(){
        System.out.println("Hai i am a abstract class as non abstract method i am a method overrider");
    }

    public static void main(String[] args) {
        abstractData ad=new AbstractClassPgm();
        ad.getUserInfo();
        ad.printData();
    }
}
