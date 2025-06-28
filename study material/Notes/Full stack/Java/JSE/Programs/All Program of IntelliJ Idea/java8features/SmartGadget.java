package java8features;
public interface SmartGadget {
   void displaySize();
    default void start(String name){
        System.out.println("I am a "+name+ " and you can start me with a button");
    }
    static void wifi(){
        System.out.println("I have a WIFI");
    }
}
