package com.cognizantInterns.collectionsPgm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapPgm {
    HashMap<String,String> hsah=new HashMap<String,String>();

    void addValue()
    {
        hsah.put("name","Vinothkumar Selvaarasan");
        hsah.put("RegisterNo","123");
        hsah.put("City","Chennai");
        hsah.put("Country","India");
    }

    void printData()
    {
        for(Map.Entry<String,String> me:hsah.entrySet())
        {
            System.out.println("Key is "+me.getKey());
            System.out.println("Value is "+me.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapPgm hmp=new HashMapPgm();
        hmp.addValue();
        hmp.printData();
    }

}
