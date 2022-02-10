package com.cognizantInterns.IOStreamOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamPgmn {
    int RegisterNo;
    String name;
    String Dept;
    String EmailId;

    InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    void getData() throws IOException
    {
        System.out.println("Enter the Register No");
        RegisterNo=Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter The Name");
        name=bufferedReader.readLine();
        System.out.println("Enter the Department");
        Dept=bufferedReader.readLine();
        System.out.println("Enter the EmailId");
        EmailId=bufferedReader.readLine();
    }
    void printData()
    {
        System.out.println("Register Number"+RegisterNo);
        System.out.println("Name"+name);
        System.out.println("Department"+Dept);
        System.out.println("Email Id"+EmailId);

    }

    public static void main(String[] args) throws IOException{
        InputStreamPgmn isp=new InputStreamPgmn();
        isp.getData();
        isp.printData();
    }
}
