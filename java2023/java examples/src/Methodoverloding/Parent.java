package Methodoverloding;

public class Parent {
    public void show(int n){
        System.out.println("in show of parent with int arg:"+n);
    }
    public void show(String n){
        System.out.println("in show of parent with String arg:"+n);
    }
}
class Child extends Parent{
    public void show(int n){
        System.out.println("in show of child with int arg:"+n);
        super.show(n);
    }
    public void show(double n){
        System.out.println("in show of child with double arg:"+n);

    }
}
class demo{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show(12.4);
        obj.show("Hello");
        obj.show(25);
    }
}
