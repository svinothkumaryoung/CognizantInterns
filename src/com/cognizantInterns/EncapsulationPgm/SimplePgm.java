package com.cognizantInterns.EncapsulationPgm;

import java.util.Scanner;

public class SimplePgm {

    Scanner s1=new Scanner(System.in);
    RegisterationClass rc=new RegisterationClass();
    void getData()
    {
        System.out.println("Enter the Register Number ");
        rc.setRegisterNo(s1.nextInt());
        System.out.println("Enter the Name ");
        rc.setName(s1.next());
        System.out.println("Enter the Address ");
        rc.setAddress(s1.next());
        System.out.println("Enter the City");
        rc.setCity(s1.next());
    }
    void printData()
    {
        System.out.println("Register Number is "+rc.getRegisterNo());
        System.out.println("Name is "+rc.getName());
        System.out.println("Address is "+rc.getAddress());
        System.out.println("City is "+rc.getCity());
    }

    public static void main(String[] args) {
        SimplePgm sp=new SimplePgm();
        sp.getData();
        sp.printData();
    }
}
