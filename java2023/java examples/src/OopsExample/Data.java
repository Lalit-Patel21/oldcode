package OopsExample;

public class Data {
    public Data(){
        System.out.println("Constructor Called....");
    }
    static
    {
        System.out.println("Static block1  Called.....");
    }
    static {
        System.out.println("Static block2 Called.....");
    }
    static public void show(){
        System.out.println("show called....");
    }

}
