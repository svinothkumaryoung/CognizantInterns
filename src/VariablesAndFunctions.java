import java.util.Scanner;

public class VariablesAndFunctions {
    int year;
    Scanner scanner=new Scanner(System.in);
    public void getData()
    {
        System.out.println("Enter the Year");
        year=scanner.nextInt();
    }
    void checkYear()
    {
        if(year<1947)
        {
            System.out.println("Pre Independence");
        }
        else
        {
            System.out.println("Post Independence");
        }
    }
        public void printData()
        {
            System.out.println("Year is "+year);
        }
    public static void main(String[] args) {
        VariablesAndFunctions vaf=new VariablesAndFunctions();
        vaf.getData();
        vaf.printData();
        vaf.checkYear();
    }
}
