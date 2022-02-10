package com.cognizantInterns.ExceptionHandlerPgm;

import java.util.Scanner;

public class BuyProduct_CreateException {
    String name;
    String MobileNo;
    String ProductName;
    int quantity;
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Name ");
        name=s1.next();
        System.out.println("Enter the MobileNo ");
        MobileNo=s1.next();
        System.out.println("Enter the ProductName ");
        ProductName=s1.next();
        System.out.println("Enter the quantity ");
        quantity=s1.nextInt();
    }
    void checkQuantity() throws ProductOffers
    {
        if(quantity>=3)
        {
            throw new ProductOffers("Only 3 products allowed per orders");
        }
        else
        {
            System.out.println("Thanks for Purchasing the Order");
        }
    }

    public static void main(String[] args){
        BuyProduct_CreateException bpce=new BuyProduct_CreateException();
        bpce.getData();
        try{
            bpce.checkQuantity();
        }
       catch(ProductOffers po)
       {
           System.out.println(po);
       }
    }
}
