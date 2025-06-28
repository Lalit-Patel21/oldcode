package java8features;
public interface Sample {
    void m1();
    default void m2()
    {
        System.out.println("In m2 of Sample");
    }
    static void m3(){
        System.out.println("In m3 of Sample");
    }
}
