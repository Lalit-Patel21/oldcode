package java8features;

public class SmartTV implements SmartGadget{
    @Override
    public void displaySize() {
        System.out.println("I have a display size of 42 inches");
    }

    @Override
    public void start(String name) {
        SmartGadget.super.start(name);
        System.out.println("You can also start me with a REMOTE");
    }
}
