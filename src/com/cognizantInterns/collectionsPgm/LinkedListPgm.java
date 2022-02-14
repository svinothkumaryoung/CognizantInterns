package com.cognizantInterns.collectionsPgm;

import java.util.*;

public class LinkedListPgm {
    List<Registeration> regi=new LinkedList<Registeration>();
    private Object Registeration;

    void addData()
    {
        regi.add(new Registeration("Vinothkumar Selvaarasan",120,"Chennai","India"));
        regi.add(new Registeration("Ashokkumar Selvaarasan",112,"Karur","India"));
        regi.add(new Registeration("Roshan Vinothkumar ",102,"Texas","America"));
        regi.add(new Registeration("Niranjan Vinothkumar ",323,"Texas","America"));
        regi.add(new Registeration("Chithra Vinothkumar ",224,"Chennai","India"));
        regi.add(new Registeration("Manimohzi ",325,"Chennai","India"));

    }
    void reteriveData()
    {
        Iterator<Registeration> it=regi.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }


    void reteriveDataSorting()
    {
        System.out.println("Sorting the Data Default Sorting \n\n");
        Collections.sort(regi);
        Iterator<Registeration> it=regi.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    void reteriveDataOnCustomized()
    {
        System.out.println("Sorting the Data Name Sorting \n\n");
        Collections.sort(regi,new NameComparator());
        Iterator<Registeration> it=regi.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
    void ReteriveDatawithRegisterNo()
    {
        System.out.println("Sorting the Data Register Number Sorting \n\n");
        Collections.sort(regi,new RegisterNoComparator());
        Iterator<Registeration> it=regi.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        LinkedListPgm llp=new LinkedListPgm();
        llp.addData();
        llp.reteriveData();
        llp.reteriveDataSorting();
        llp.ReteriveDatawithRegisterNo();
        llp.reteriveDataOnCustomized();

    }
}
