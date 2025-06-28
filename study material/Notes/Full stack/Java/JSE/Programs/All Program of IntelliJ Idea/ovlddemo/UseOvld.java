package ovlddemo;

public class UseOvld {
    public static void main(String[] args) {
        Ovld obj=new Ovld();
        obj.show('A');
        obj.show("A");
        obj.show(65);
        obj.show(65.0);
        obj.show("Hi");
    }
}
