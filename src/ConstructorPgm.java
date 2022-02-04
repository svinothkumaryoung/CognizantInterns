public class ConstructorPgm {
    int RegisterNo;
    String name;
    ConstructorPgm()
    {
        RegisterNo=1010;
        name="Students";
    }
    void printData()
    {
        System.out.println("Register Number is "+RegisterNo+" Name is "+name);
    }

    public static void main(String[] args) {
        ConstructorPgm cp=new ConstructorPgm();
        cp.printData();
    }

}
