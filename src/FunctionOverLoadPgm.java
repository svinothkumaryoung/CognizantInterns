public class FunctionOverLoadPgm {

    void info()
    {
        System.out.println("Hi Welcome to Basic of Java");
    }
    void info(String name)
    {
        System.out.println("Hi "+name+" Welcome to Basic of Java");
    }
    void info(String name,String Address)
    {
        System.out.println("Hi "+name+" Welcome to Basic of Java"+Address);
    }
    void info(String name,int pincode,String Address)
    {
        System.out.println("Hi "+name+" Welcome to Basic of Java"+Address+" "+pincode);
    }

    public static void main(String[] args) {
        FunctionOverLoadPgm fp=new FunctionOverLoadPgm();
        fp.info();
        fp.info("Vinothkumar Selvaarasan");
        fp.info("Vinothkumar Selvaarasan","Chennai");
        fp.info("Vinothkumar Selvaarasan",600060,"Chennai");

    }
}
