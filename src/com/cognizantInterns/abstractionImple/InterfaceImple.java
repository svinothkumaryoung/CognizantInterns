package com.cognizantInterns.abstractionImple;
/*
-> Interface can have only the declaration part only and the definition
   part is there in the subclass.

-> We use "implements" keyword to implement the method declare in
   the interface on the subclass.

 */
interface inter1{
    public void getData();
    public void PrintData();
}
interface inter2{
    public void userData();
}
public class InterfaceImple implements  inter1,inter2 {
    public void getData()
    {
       System.out.println("Hi i am interface Method->Name is GetData");
    }
    public void PrintData()
    {
        System.out.println("Hi i am interface Method->Name is PrintData");
    }
    public void userData(){
        System.out.println("Hi i am UserData Method on Second Interface");
    }

    public static void main(String[] args) {
        InterfaceImple i=new InterfaceImple();
        //inter i1=new InterfaceImple();
        //inter2 i2=new InterfaceImple();
        i.getData();
        i.PrintData();
        i.userData();
    }
}
