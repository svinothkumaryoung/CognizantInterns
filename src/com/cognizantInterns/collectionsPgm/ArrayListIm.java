package com.cognizantInterns.collectionsPgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIm {
    ArrayList<String> arrayList=new ArrayList<String>();
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    String name;

    void addData() throws IOException
    {
        System.out.println("Enter the Number of Name u eant to Add");
        int i=Integer.parseInt(bufferedReader.readLine());
        for(int j=0;j<=i;j++)
        {
            System.out.println("Enter the Name");
            name=bufferedReader.readLine();
            arrayList.add(name);
        }

    }
    void printData()
    {
        Iterator<String> iterator=arrayList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayListIm ali=new ArrayListIm();
        ali.addData();
        ali.printData();
    }

}
