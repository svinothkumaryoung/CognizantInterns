package com.cognizantInterns.collectionsPgm;

import java.util.Comparator;

public class NameComparator implements Comparator<Registeration> {
    @Override
    public int compare(Registeration r1, Registeration r2) {
       Registeration regi1=(Registeration) r1;
       Registeration regi2=(Registeration) r2;
       return regi1.getName().compareTo(regi2.getName());
    }
}
