package com.cognizantInterns.SuperKeyword;

import java.util.Scanner;

class parent
{
    int registerNo;
    Scanner s=new Scanner(System.in);
    parent()
    {
        registerNo=1919;
    }
    parent(int registerNo)
    {
        this.registerNo=registerNo;
    }
    void getData()
    {
        System.out.println("Enter the Register No");
        registerNo=s.nextInt();
    }
    void printData()
    {
        System.out.println("Register No is "+registerNo);
    }
}
class Child extends parent{
    String name;
    Child()
    {
        name="Vinothkumar Selvaarasan";
    }
    Child(String name,int r)
    {
        super(r);
        this.name=name;
    }
    void getChildData()
    {
        System.out.println("Enter the name ");
        name=s.next();
    }
    void printData1()
    {
        super.printData();
        System.out.println("Name is "+name);
    }

}
public class SuperKey {
    public static void main(String[] args) {

        Child c1=new Child("Ashokkumar Selvaarasan",1616);
       c1.printData1();
    }

}
