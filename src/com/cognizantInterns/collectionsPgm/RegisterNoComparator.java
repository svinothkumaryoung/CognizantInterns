package com.cognizantInterns.collectionsPgm;

import java.util.Comparator;

public class RegisterNoComparator implements Comparator<Registeration> {
    @Override
    public int compare(Registeration r1, Registeration r2) {
        Registeration regi1=(Registeration)r1;
        Registeration regi2=(Registeration)r2;
        if(regi1.getRegisterNo()==regi2.getRegisterNo()){
            return 0;
        }
        else if(regi1.getRegisterNo()>regi2.getRegisterNo())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
