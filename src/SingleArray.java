import java.util.Scanner;

public class SingleArray {
    int registerNo;
    int NoOfSubjects;
    int marks[];
    int total;
    float avg;
    Scanner s=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Register No");
        registerNo=s.nextInt();
        System.out.println("Enter the No Of Subjects");
        NoOfSubjects=s.nextInt();
        marks=new int[NoOfSubjects];
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Enter the Marks for the Subject "+(i+1));
            marks[i]=s.nextInt();
        }

    }
    void calculation()
    {
        for(int i=0;i<marks.length;i++)
        {
           // total=total+marks[i];
            total+=marks[i];
        }
        avg=total/marks.length;
    }
    void printData()
    {
        System.out.println("Register Number is "+registerNo);
        System.out.println("Marks of Subjects");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Marks of Subject "+(i+1)+"->"+marks[i]);
        }
        System.out.println("Total Marks is "+total);
        System.out.println("Average Marks is "+avg);
    }

    public static void main(String[] args) {
        SingleArray sa=new SingleArray();
        sa.getData();
        sa.calculation();
        sa.printData();
    }


}
