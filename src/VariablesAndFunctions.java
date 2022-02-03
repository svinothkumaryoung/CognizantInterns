import java.util.Scanner;

public class VariablesAndFunctions {
    int registerNo;
    Scanner scanner=new Scanner(System.in);
    public void getData()
    {
        System.out.println("Enter the Register No");
        registerNo=scanner.nextInt();
    }
    public void printData()
    {
        System.out.print("Register No is "+registerNo);
    }
    public static void main(String[] args) {
        VariablesAndFunctions vaf=new VariablesAndFunctions();
        vaf.getData();
        vaf.printData();
    }
}
