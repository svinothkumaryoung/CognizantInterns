package com.cognizantInterns.java8StudentPractice.Pojo;

import java.util.Arrays;
import java.util.List;

public class PojoDataClass {


    public static List<Registeration> getAlldata()
    {
        Registeration r1=new Registeration(201,"Vinothkumar Selvaarasan","Chennai","9344088356");
        Registeration r2=new Registeration(202,"Ashokkumar Selvaarasan","Chennai","75022883");
        Registeration r3=new Registeration(203,"Roshan Vinothkumar","Texas","232323");
        Registeration r4=new Registeration(204,"Niranjan Vinothkumar ","Texas","2324345");
        Registeration r5=new Registeration(205,"Chithra Vinothkumar ","Chennai","45345");
        Registeration r6=new Registeration(206,"Nagalakshmi Selvaarasan","Chennai","345345");

        return Arrays.asList(r1,r2,r3,r4,r5,r6);
    }
    public static Registeration getOnedata()
    {
        Registeration r1=new Registeration(201,"Vinothkumar Selvaarasan","Chennai","9344088356");

        return r1;
    }


}
