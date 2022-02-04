import java.util.Scanner;

public class ThisKey {
    int registerNo;
    String name;
    Scanner s1=new Scanner(System.in);
    ThisKey()
    {
        this(100,"AshokKumar Selvaarasan");

        registerNo=10302;
        name="Vinothkumar Selvaarasan";
        this.printData();
    }
    ThisKey(int registerNo,String name)
    {
        this.registerNo=registerNo;
        this.name=name;
        this.printData();
    }
    void getData()
    {
        System.out.println("Enter the Register Number");
        registerNo=s1.nextInt();
        System.out.println("Enter the Name");
        name=s1.next();
    }
    void printData()
    {
        System.out.println("Register Number is "+registerNo+ " Name is "+name);
    }

    public static void main(String[] args) {
        ThisKey tk=new ThisKey();

        ThisKey tk2=new ThisKey();
        tk2.getData();
        tk2.printData();
    }
}
