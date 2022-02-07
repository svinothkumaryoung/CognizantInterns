package com.cognizant.inheritance;

import java.util.Scanner;

class StudentBasicsInfo
{
    Scanner s1=new Scanner(System.in);
    int registerNo;
    String name;
    String Dept;
    String Emailid;
    String PhoneNo;
    void getData()
    {
        System.out.println("Enter the Register No");
        registerNo=s1.nextInt();
        System.out.println("Enter the Name");
        name=s1.next();
        System.out.println("Enter the Department");
        Dept=s1.next();
        System.out.println("Enter the Email Id");
        Emailid=s1.next();
        System.out.println("Enter the Phone No");
        PhoneNo=s1.next();
    }
    void printData()
    {
        System.out.println("Register No is "+registerNo);
        System.out.println("Name is "+name);
        System.out.println("Dept is "+Dept);
        System.out.println("Email id is "+Emailid);
        System.out.println("Phone No No is "+PhoneNo);
    }
}
class studentParentInfo extends StudentBasicsInfo
{
    String FatherName;
    String MotherName;
    String Address;
    void getDataChild()
    {
        System.out.println("Enter the Father Name");
        FatherName=s1.next();
        System.out.println("Enter the Mother Name");
        MotherName=s1.next();
        System.out.println("Enter the Address");
        Address=s1.next();
    }
    void printDataChild()
    {
        System.out.println("Father Name is "+FatherName );
        System.out.println("Mother Name is "+MotherName);
        System.out.println("Address is "+Address);
    }
}
 class Marks extends studentParentInfo
{
    int tenthMarks;
    int TwelthMarks;
    void getDataMarks()
    {
        System.out.println("Enter the Tenth Marks ");
        tenthMarks=s1.nextInt();
        System.out.println("Enter the Twelth Marks ");
        TwelthMarks=s1.nextInt();
    }
    void printDataMarks()
    {
        System.out.println("Tenth Marks "+tenthMarks);
        System.out.println("Twelth Marks "+TwelthMarks);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Marks m=new Marks();
        m.getData();
        m.getDataChild();
        m.getDataMarks();
        m.printData();
        m.printDataChild();
        m.printDataMarks();
    }
}
