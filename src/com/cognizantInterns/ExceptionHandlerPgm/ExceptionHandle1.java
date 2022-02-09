package com.cognizantInterns.ExceptionHandlerPgm;

import java.util.Scanner;

public class ExceptionHandle1 {
    int a,b,c;
    Scanner s=new Scanner(System.in);
    int a1[]=new int[5];
    void getData()
    {
        System.out.println("Enter the Value for A");
        a=s.nextInt();
        System.out.println("Enter the Value for B");
        b=s.nextInt();
    }
    void calcualtion()
    {
        try{
            c=a/b;
            a1[5]=201;
            System.out.println("Output of A/B is "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithematic Exception");
        }

        catch(Exception E)
        {
            System.out.println("Exception");
        }
        finally {
            System.out.println("Finally Block ");
        }

        System.out.println("Hai How are you");
    }

    public static void main(String[] args) {
        ExceptionHandle1 eh=new ExceptionHandle1();
        eh.getData();
        eh.calcualtion();
    }


}
