public class ConstructorWithArg {
    int RegisterNo;
    String name;
    ConstructorWithArg()
    {
        RegisterNo=10010;
        name="VinothKumar Selvaarasn";
    }
    ConstructorWithArg(int r,String n)
    {
        RegisterNo=r;
        name=n;
    }
    void printData()
    {
        System.out.println("Register Number is "+RegisterNo);
        System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        ConstructorWithArg cwa=new ConstructorWithArg();
        cwa.printData();
        ConstructorWithArg cwa1=new ConstructorWithArg(302020,"Ashokkumar Selvaarasan");
        cwa1.printData();
    }
}
