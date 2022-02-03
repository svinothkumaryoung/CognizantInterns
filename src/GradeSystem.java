import java.util.Scanner;

public class GradeSystem {
    int RegisterNo;
    int percentage;
    Scanner s=new Scanner(System.in);
    void getUserData()
    {
        System.out.println("Enter the Register Number ");
        RegisterNo=s.nextInt();
        System.out.println("Enter the Percentage");
        percentage=s.nextInt();
    }
    void checkUserData()
    {
        if(90 <= percentage  && 100 >= percentage    )
        {
            System.out.println("S Grade");
        }
        else if(80<= percentage && 89>=percentage)
        {
            System.out.println("A Grade");
        }
        else if(70<= percentage && 79>=percentage)
        {
            System.out.println("B Grade");
        }
        else if(60<= percentage && 69>=percentage)
        {
            System.out.println("C Grade");
        }
        else if(50<= percentage && 59>=percentage)
        {
            System.out.println("D Grade");
        }
        else if(40<= percentage && 49>=percentage)
        {
            System.out.println("E Grade");
        }
        else if(0<= percentage && 39>=percentage)
        {
            System.out.println("E Grade");
        }
        else
        {
            System.out.println("Please Enter the Proper Percentage");
        }
    }
    void printData()
    {
        System.out.println("Percentage is "+percentage);
    }

    public static void main(String[] args) {
        GradeSystem gs=new GradeSystem();
        gs.getUserData();
        gs.checkUserData();
        gs.printData();
    }
}
