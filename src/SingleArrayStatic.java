import java.util.Scanner;

public class SingleArrayStatic {
    int marks[]=new int[6];
    Scanner s=new Scanner(System.in);

    void getData()
    {
        System.out.println("Array Value is ");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Enter the Marks for Subject "+(i+1));
            marks[i]=s.nextInt();
        }
    }
    void printData()
    {
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Marks for Subject "+(i+1)+"->"+  marks[i]);
        }
    }

    public static void main(String[] args) {
        SingleArrayStatic sas=new SingleArrayStatic();
        sas.getData();
        sas.printData();
    }
}
