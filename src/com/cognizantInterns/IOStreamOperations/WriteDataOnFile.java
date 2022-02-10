package com.cognizantInterns.IOStreamOperations;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteDataOnFile {
    String name;
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

    void getData() throws IOException
    {
        FileWriter fileWriter=new FileWriter("vin.txt");
        System.out.println("Enter the Name");
        name=bufferedReader.readLine();
        fileWriter.write(name);
        fileWriter.close();

    }

    public static void main(String[] args) throws IOException{
        WriteDataOnFile wdof=new WriteDataOnFile();
        wdof.getData();
    }


}
