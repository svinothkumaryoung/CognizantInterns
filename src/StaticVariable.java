public class StaticVariable {
    static int Staticcount;
    int normalCount;
    void inc()
    {
        Staticcount++;
        normalCount++;
    }
    void printData()
    {
        System.out.println("Static Variable Value is "+Staticcount);
        System.out.println("Non Static Variable is "+normalCount);
    }

    public static void main(String[] args) {
            StaticVariable sv=new StaticVariable();
        sv.inc();
        sv.printData();
        StaticVariable sv1=new StaticVariable();
        sv1.inc();
        sv1.printData();
    }

}
