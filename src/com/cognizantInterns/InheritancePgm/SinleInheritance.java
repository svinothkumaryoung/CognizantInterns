package com.cognizantInterns.InheritancePgm;

import java.util.Scanner;

class parentClass//Child Class
{
    int registerNo;
    String name;
    Scanner s1=new Scanner(System.in);
    void getDataParent()
    {
        System.out.println("Enter the Register Number");
        registerNo=s1.nextInt();
        System.out.println("Enter the Name");
        name=s1.next();
    }
    void printData()
    {
        System.out.println("Register Number is "+registerNo);
        System.out.println("Name is "+name);
    }

}

public class SinleInheritance extends parentClass //Parent Class
{
    String dept;
    String Semester;

    void getDataChild()
    {
        System.out.println("Enter the Department");
        dept=s1.next();
        System.out.println("Enter the Semester");
        Semester=s1.next();
    }

    void printDataChild()
    {
        System.out.println("Department is "+dept);
        System.out.println("Semester is "+Semester);
    }

    public static void main(String[] args) {
        SinleInheritance si=new SinleInheritance();
        si.getDataParent(); //Parent Class Method
        si.getDataChild();
        si.printData();     //Parent Class Method
        si.printDataChild();


    }
}
