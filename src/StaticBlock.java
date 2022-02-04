import java.sql.ResultSet;

public class StaticBlock {
    static int RegisterNo=200;
    StaticBlock()
    {
        System.out.println("Hi i am a Default Constructor");
        RegisterNo=100;
        System.out.println("Register No is "+ RegisterNo);
    }
    static {
        System.out.println("Hi i am a static Block");
        System.out.println("Register No is "+ RegisterNo);
    }

    public static void main(String[] args) {
        StaticBlock sb=new StaticBlock();

    }

}
