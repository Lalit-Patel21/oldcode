package java8features;

public class UseSmartGadget {
    public static void main(String[] args) {
        SmartGadget sg;
        sg=new IPhone();
        sg.start("IPhone");
        sg.displaySize();
        SmartGadget.wifi();

        sg=new Laptop();
        sg.start("Laptop");
        sg.displaySize();
        SmartGadget.wifi();

        sg=new SmartTV();
        sg.start("SmartTV");
        sg.displaySize();
        SmartGadget.wifi();
    }
}
