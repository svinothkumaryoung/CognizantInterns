import java.util.Scanner;

public class TwoDimensional {
    String[][] product=new String[2][2];
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Product u want to store in the room");
        for(int i=0;i<product.length;i++)
        {
            for(int j=0;j<product[i].length;j++)
            { System.out.println("Enter the Product u want to Store in "+(i+1)+(j+1));
                product[i][j]=s1.next();
            }
        }
    }
    void printData()
    {
        for(int i=0;i<product.length;i++)
        {
            for(int j=0;j<product[i].length;j++)
            {
                System.out.println("Product is in Room No "+(i+1)+(j+1)+" -> "+product[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        TwoDimensional td=new TwoDimensional();
        td.getData();
        td.printData();
    }
}
